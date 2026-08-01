package p209;

import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1599;
import p195.AbstractC7834;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7920 implements InterfaceC7923 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21941;

    public C7920(long j) {
        this.f21941 = j;
        if (j != 16) {
            return;
        }
        AbstractC7834.m13198("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7920) && C1599.m2949(this.f21941, ((C7920) obj).f21941);
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Long.hashCode(this.f21941);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C1599.m2954(this.f21941)) + ')';
    }

    @Override // p209.InterfaceC7923
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC1598 mo13416() {
        return null;
    }

    @Override // p209.InterfaceC7923
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long mo13417() {
        return this.f21941;
    }

    @Override // p209.InterfaceC7923
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo13418() {
        return C1599.m2948(this.f21941);
    }
}
