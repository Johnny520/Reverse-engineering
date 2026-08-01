package androidx.compose.p001ui.graphics.drawscope;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.AbstractC2446;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2344 extends AbstractC2340 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f4636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f4637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4639;

    public C2344(float f, float f2, int i, int i2, AbstractC2446 abstractC2446, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.f4639 = f;
        this.f4638 = f2;
        this.f4637 = i;
        this.f4636 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2344)) {
            return false;
        }
        C2344 c2344 = (C2344) obj;
        return this.f4639 == c2344.f4639 && this.f4638 == c2344.f4638 && this.f4637 == c2344.f4637 && this.f4636 == c2344.f4636 && AbstractC5227.m9466(null, null);
    }

    public final int hashCode() {
        return AbstractC0900.m704(this.f4636, AbstractC0900.m704(this.f4637, AbstractC0900.m705(Float.hashCode(this.f4639) * 31, this.f4638, 31), 31), 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f4639);
        sb.append(", miter=");
        sb.append(this.f4638);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.f4637;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.f4636;
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
