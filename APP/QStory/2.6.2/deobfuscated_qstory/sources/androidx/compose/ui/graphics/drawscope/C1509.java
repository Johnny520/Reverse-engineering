package androidx.compose.ui.graphics.drawscope;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.AbstractC1611;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1509 extends AbstractC1505 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f4290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f4291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4293;

    public C1509(float f, float f2, int i, int i2, AbstractC1611 abstractC1611, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.f4293 = f;
        this.f4292 = f2;
        this.f4291 = i;
        this.f4290 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1509)) {
            return false;
        }
        C1509 c1509 = (C1509) obj;
        return this.f4293 == c1509.f4293 && this.f4292 == c1509.f4292 && this.f4291 == c1509.f4291 && this.f4290 == c1509.f4290 && AbstractC4394.m8917(null, null);
    }

    public final int hashCode() {
        return AbstractC0053.m143(this.f4290, AbstractC0053.m143(this.f4291, AbstractC0053.m144(Float.hashCode(this.f4293) * 31, this.f4292, 31), 31), 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f4293);
        sb.append(", miter=");
        sb.append(this.f4292);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.f4291;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.f4290;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }
}
