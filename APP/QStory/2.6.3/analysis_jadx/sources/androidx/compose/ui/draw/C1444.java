package androidx.compose.ui.draw;

import androidx.collection.AbstractC0287;
import androidx.collection.C0244;
import androidx.compose.ui.graphics.InterfaceC1583;
import androidx.compose.ui.graphics.layer.C1516;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1444 implements InterfaceC1583 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1583 f4139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0244 f4140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2579() {
        C0244 c0244 = this.f4140;
        if (c0244 != null) {
            Object[] objArr = c0244.f1005;
            int i = c0244.f1004;
            for (int i2 = 0; i2 < i; i2++) {
                mo2581((C1516) objArr[i2]);
            }
            c0244.m779();
        }
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1583
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1516 mo2580() {
        InterfaceC1583 interfaceC1583 = this.f4139;
        if (interfaceC1583 == null) {
            AbstractC7936.m13423("GraphicsContext not provided");
        }
        C1516 c1516Mo2580 = interfaceC1583.mo2580();
        C0244 c0244 = this.f4140;
        if (c0244 != null) {
            c0244.m775(c1516Mo2580);
            return c1516Mo2580;
        }
        Object[] objArr = AbstractC0287.f1003;
        C0244 c02442 = new C0244(1);
        c02442.m775(c1516Mo2580);
        this.f4140 = c02442;
        return c1516Mo2580;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1583
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2581(C1516 c1516) {
        InterfaceC1583 interfaceC1583 = this.f4139;
        if (interfaceC1583 != null) {
            interfaceC1583.mo2581(c1516);
        }
    }
}
