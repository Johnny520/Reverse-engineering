package androidx.compose.p001ui.draw;

import androidx.collection.AbstractC1134;
import androidx.collection.C1091;
import androidx.compose.p001ui.graphics.InterfaceC2418;
import androidx.compose.p001ui.graphics.layer.C2351;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2279 implements InterfaceC2418 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2418 f4484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1091 f4485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3139() {
        C1091 c1091 = this.f4485;
        if (c1091 != null) {
            Object[] objArr = c1091.f1350;
            int i = c1091.f1349;
            for (int i2 = 0; i2 < i; i2++) {
                mo3141((C2351) objArr[i2]);
            }
            c1091.m1339();
        }
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2418
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2351 mo3140() {
        InterfaceC2418 interfaceC2418 = this.f4484;
        if (interfaceC2418 == null) {
            AbstractC8765.m13982("GraphicsContext not provided");
        }
        C2351 c2351Mo3140 = interfaceC2418.mo3140();
        C1091 c1091 = this.f4485;
        if (c1091 != null) {
            c1091.m1335(c2351Mo3140);
            return c2351Mo3140;
        }
        Object[] objArr = AbstractC1134.f1348;
        C1091 c10912 = new C1091(1);
        c10912.m1335(c2351Mo3140);
        this.f4485 = c10912;
        return c2351Mo3140;
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2418
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo3141(C2351 c2351) {
        InterfaceC2418 interfaceC2418 = this.f4484;
        if (interfaceC2418 != null) {
            interfaceC2418.mo3141(c2351);
        }
    }
}
