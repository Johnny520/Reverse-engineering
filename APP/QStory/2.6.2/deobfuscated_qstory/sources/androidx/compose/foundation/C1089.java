package androidx.compose.foundation;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.layout.C0666;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1089 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0666 f3216;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f3217;

    public C1089() {
        long jM2870 = AbstractC1581.m2870(4284900966L);
        C0666 c0666 = new C0666(0.0f, 0.0f, 0.0f, 0.0f);
        this.f3217 = jM2870;
        this.f3216 = c0666;
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
        return C1599.m2939(this.f3217, c1089.f3217) && AbstractC4394.m8917(this.f3216, c1089.f3216);
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return this.f3216.hashCode() + (Long.hashCode(this.f3217) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC0053.m138(this.f3217, sb, ", drawPadding=");
        sb.append(this.f3216);
        sb.append(')');
        return sb.toString();
    }
}
