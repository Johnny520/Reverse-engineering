package androidx.compose.p001ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2442 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f5055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f5056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ColorFilter f5057;

    public C2442(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2431.m3483();
            porterDuffColorFilter = AbstractC2431.m3485(AbstractC2416.m3433(j), AbstractC2416.m3447(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC2416.m3433(j), AbstractC2416.m3430(i));
        }
        this.f5057 = porterDuffColorFilter;
        this.f5056 = j;
        this.f5055 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2442)) {
            return false;
        }
        C2442 c2442 = (C2442) obj;
        return C2434.m3509(this.f5056, c2442.f5056) && this.f5055 == c2442.f5055;
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Integer.hashCode(this.f5055) + (Long.hashCode(this.f5056) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0900.m698(this.f5056, sb, ", blendMode=");
        sb.append((Object) AbstractC2416.m3438(this.f5055));
        sb.append(')');
        return sb.toString();
    }
}
