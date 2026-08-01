package p209;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.AbstractC1574;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1599;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7921 implements InterfaceC7923 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f21942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1574 f21943;

    public C7921(AbstractC1574 abstractC1574, float f) {
        this.f21943 = abstractC1574;
        this.f21942 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7921)) {
            return false;
        }
        C7921 c7921 = (C7921) obj;
        return AbstractC4395.m8907(this.f21943, c7921.f21943) && Float.compare(this.f21942, c7921.f21942) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21942) + (this.f21943.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f21943);
        sb.append(", alpha=");
        return AbstractC0053.m155(sb, this.f21942, ')');
    }

    @Override // p209.InterfaceC7923
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC1598 mo13416() {
        return this.f21943;
    }

    @Override // p209.InterfaceC7923
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo13417() {
        int i = C1599.f4699;
        return C1599.f4697;
    }

    @Override // p209.InterfaceC7923
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo13418() {
        return this.f21942;
    }
}
