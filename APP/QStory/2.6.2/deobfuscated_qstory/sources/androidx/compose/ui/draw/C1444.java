package androidx.compose.ui.draw;

import androidx.collection.AbstractC0287;
import androidx.collection.C0244;
import androidx.compose.ui.graphics.InterfaceC1583;
import androidx.compose.ui.graphics.layer.C1516;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1444 implements InterfaceC1583 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1583 f4138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0244 f4139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2569() {
        C0244 c0244 = this.f4139;
        if (c0244 != null) {
            Object[] objArr = c0244.f1005;
            int i = c0244.f1004;
            for (int i2 = 0; i2 < i; i2++) {
                mo2571((C1516) objArr[i2]);
            }
            c0244.m778();
        }
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1583
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1516 mo2570() {
        InterfaceC1583 interfaceC1583 = this.f4138;
        if (interfaceC1583 == null) {
            AbstractC7935.m13395("GraphicsContext not provided");
        }
        C1516 c1516Mo2570 = interfaceC1583.mo2570();
        C0244 c0244 = this.f4139;
        if (c0244 != null) {
            c0244.m774(c1516Mo2570);
            return c1516Mo2570;
        }
        Object[] objArr = AbstractC0287.f1003;
        C0244 c02442 = new C0244(1);
        c02442.m774(c1516Mo2570);
        this.f4139 = c02442;
        return c1516Mo2570;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1583
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2571(C1516 c1516) {
        InterfaceC1583 interfaceC1583 = this.f4138;
        if (interfaceC1583 != null) {
            interfaceC1583.mo2571(c1516);
        }
    }
}
