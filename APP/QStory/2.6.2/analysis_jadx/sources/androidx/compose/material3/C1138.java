package androidx.compose.material3;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0113;
import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.node.InterfaceC1787;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1138 implements InterfaceC1095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f3275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f3276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f3277;

    public C1138(float f, long j, boolean z) {
        this.f3277 = z;
        this.f3276 = f;
        this.f3275 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1138)) {
            return false;
        }
        C1138 c1138 = (C1138) obj;
        if (this.f3277 == c1138.f3277 && C7892.m13290(this.f3276, c1138.f3276)) {
            return C1599.m2939(this.f3275, c1138.f3275);
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    public final int hashCode() {
        int iM144 = AbstractC0053.m144(Boolean.hashCode(this.f3277) * 31, this.f3276, 961);
        int i = C1599.f4698;
        return Long.hashCode(this.f3275) + iM144;
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1787 mo1934(InterfaceC0579 interfaceC0579) {
        return new C1191(interfaceC0579, this.f3277, this.f3276, new C0113(this, 16));
    }
}
