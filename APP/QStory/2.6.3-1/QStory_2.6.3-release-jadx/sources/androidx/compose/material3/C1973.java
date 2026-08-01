package androidx.compose.material3;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0960;
import androidx.compose.foundation.InterfaceC1933;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.node.InterfaceC2622;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1973 implements InterfaceC1933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f3621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f3622;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f3623;

    public C1973(float f, long j, boolean z) {
        this.f3623 = z;
        this.f3622 = f;
        this.f3621 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1973)) {
            return false;
        }
        C1973 c1973 = (C1973) obj;
        if (this.f3623 == c1973.f3623 && C8722.m13877(this.f3622, c1973.f3622)) {
            return C2434.m3509(this.f3621, c1973.f3621);
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC1933
    public final int hashCode() {
        int iM705 = AbstractC0900.m705(Boolean.hashCode(this.f3623) * 31, this.f3622, 961);
        int i = C2434.f5044;
        return Long.hashCode(this.f3621) + iM705;
    }

    @Override // androidx.compose.foundation.InterfaceC1933
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2622 mo2504(InterfaceC1420 interfaceC1420) {
        return new C2026(interfaceC1420, this.f3623, this.f3622, new C0960(this, 16));
    }
}
