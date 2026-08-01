package androidx.compose.foundation.gestures;

import kotlinx.coroutines.channels.C5202;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0558 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5207 f1606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1607;

    public /* synthetic */ C0558(InterfaceC5207 interfaceC5207, int i) {
        this.f1607 = i;
        this.f1606 = interfaceC5207;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f1607;
        InterfaceC5207 interfaceC5207 = this.f1606;
        switch (i) {
            case 0:
                return (C0559) C5202.m10272(interfaceC5207.mo10255());
            default:
                return (C0505) C5202.m10272(interfaceC5207.mo10255());
        }
    }
}
