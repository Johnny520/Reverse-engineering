package androidx.compose.foundation;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.layout.C0666;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1089 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0666 f3217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f3218;

    public C1089() {
        long jM2880 = AbstractC1581.m2880(4284900966L);
        C0666 c0666 = new C0666(0.0f, 0.0f, 0.0f, 0.0f);
        this.f3218 = jM2880;
        this.f3217 = c0666;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1089.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C1089 c1089 = (C1089) obj;
        return C1599.m2949(this.f3218, c1089.f3218) && AbstractC4395.m8907(this.f3217, c1089.f3217);
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return this.f3217.hashCode() + (Long.hashCode(this.f3218) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC0053.m138(this.f3218, sb, ", drawPadding=");
        sb.append(this.f3217);
        sb.append(')');
        return sb.toString();
    }
}
