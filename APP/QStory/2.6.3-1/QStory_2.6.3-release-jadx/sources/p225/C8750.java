package p225;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.AbstractC2409;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2434;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8750 implements InterfaceC8752 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f22287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2409 f22288;

    public C8750(AbstractC2409 abstractC2409, float f) {
        this.f22288 = abstractC2409;
        this.f22287 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8750)) {
            return false;
        }
        C8750 c8750 = (C8750) obj;
        return AbstractC5227.m9466(this.f22288, c8750.f22288) && Float.compare(this.f22287, c8750.f22287) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22287) + (this.f22288.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f22288);
        sb.append(", alpha=");
        return AbstractC0900.m715(sb, this.f22287, ')');
    }

    @Override // p225.InterfaceC8752
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC2433 mo13975() {
        return this.f22288;
    }

    @Override // p225.InterfaceC8752
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo13976() {
        int i = C2434.f5044;
        return C2434.f5042;
    }

    @Override // p225.InterfaceC8752
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo13977() {
        return this.f22287;
    }
}
