package p209;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.AbstractC1574;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1599;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7920 implements InterfaceC7922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f21945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1574 f21946;

    public C7920(AbstractC1574 abstractC1574, float f) {
        this.f21946 = abstractC1574;
        this.f21945 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7920)) {
            return false;
        }
        C7920 c7920 = (C7920) obj;
        return AbstractC4394.m8917(this.f21946, c7920.f21946) && Float.compare(this.f21945, c7920.f21945) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21945) + (this.f21946.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f21946);
        sb.append(", alpha=");
        return AbstractC0053.m157(sb, this.f21945, ')');
    }

    @Override // p209.InterfaceC7922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC1598 mo13388() {
        return this.f21946;
    }

    @Override // p209.InterfaceC7922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo13389() {
        int i = C1599.f4698;
        return C1599.f4696;
    }

    @Override // p209.InterfaceC7922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo13390() {
        return this.f21945;
    }
}
