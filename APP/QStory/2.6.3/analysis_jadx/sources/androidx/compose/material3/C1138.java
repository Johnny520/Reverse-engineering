package androidx.compose.material3;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0113;
import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.node.InterfaceC1787;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1138 implements InterfaceC1095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f3276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f3277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f3278;

    public C1138(float f, long j, boolean z) {
        this.f3278 = z;
        this.f3277 = f;
        this.f3276 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1138)) {
            return false;
        }
        C1138 c1138 = (C1138) obj;
        if (this.f3278 == c1138.f3278 && C7893.m13318(this.f3277, c1138.f3277)) {
            return C1599.m2949(this.f3276, c1138.f3276);
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    public final int hashCode() {
        int iM145 = AbstractC0053.m145(Boolean.hashCode(this.f3278) * 31, this.f3277, 961);
        int i = C1599.f4699;
        return Long.hashCode(this.f3276) + iM145;
    }

    @Override // androidx.compose.foundation.InterfaceC1095
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1787 mo1944(InterfaceC0579 interfaceC0579) {
        return new C1191(interfaceC0579, this.f3278, this.f3277, new C0113(this, 16));
    }
}
