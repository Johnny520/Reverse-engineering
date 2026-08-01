package p209;

import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1599;
import p195.AbstractC7833;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7919 implements InterfaceC7922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21944;

    public C7919(long j) {
        this.f21944 = j;
        if (j != 16) {
            return;
        }
        AbstractC7833.m13170("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7919) && C1599.m2939(this.f21944, ((C7919) obj).f21944);
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Long.hashCode(this.f21944);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C1599.m2944(this.f21944)) + ')';
    }

    @Override // p209.InterfaceC7922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC1598 mo13388() {
        return null;
    }

    @Override // p209.InterfaceC7922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long mo13389() {
        return this.f21944;
    }

    @Override // p209.InterfaceC7922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo13390() {
        return C1599.m2938(this.f21944);
    }
}
