package androidx.compose.foundation;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.layout.C1507;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1507 f3562;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f3563;

    public C1927() {
        long jM3440 = AbstractC2416.m3440(4284900966L);
        C1507 c1507 = new C1507(0.0f, 0.0f, 0.0f, 0.0f);
        this.f3563 = jM3440;
        this.f3562 = c1507;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1927.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C1927 c1927 = (C1927) obj;
        return C2434.m3509(this.f3563, c1927.f3563) && AbstractC5227.m9466(this.f3562, c1927.f3562);
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return this.f3562.hashCode() + (Long.hashCode(this.f3563) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC0900.m698(this.f3563, sb, ", drawPadding=");
        sb.append(this.f3562);
        sb.append(')');
        return sb.toString();
    }
}
