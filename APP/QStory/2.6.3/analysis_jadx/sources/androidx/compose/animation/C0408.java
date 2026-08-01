package androidx.compose.animation;

import androidx.compose.animation.core.C0364;
import androidx.compose.runtime.AbstractC1347;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0408 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0364 f1355;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1356;

    public /* synthetic */ C0408(C0364 c0364, int i) {
        this.f1356 = i;
        this.f1355 = c0364;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        switch (this.f1356) {
            case 0:
                return ((AbstractC1347) this.f1355.f1241).getValue();
            default:
                return this.f1355.m1063();
        }
    }
}
