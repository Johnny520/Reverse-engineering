package androidx.compose.animation;

import androidx.compose.animation.core.C1210;
import androidx.compose.runtime.AbstractC2182;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1254 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1210 f1700;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1701;

    public /* synthetic */ C1254(C1210 c1210, int i) {
        this.f1701 = i;
        this.f1700 = c1210;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        switch (this.f1701) {
            case 0:
                return ((AbstractC2182) this.f1700.f1586).getValue();
            default:
                return this.f1700.m1623();
        }
    }
}
