package androidx.window.layout;

import androidx.core.util.InterfaceC2188;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2600 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2601 f7783;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2188 f7784;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7785;

    public /* synthetic */ C2600(C2601 c2601, InterfaceC2188 interfaceC2188, int i) {
        this.f7785 = i;
        this.f7783 = c2601;
        this.f7784 = interfaceC2188;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f7785;
        InterfaceC2188 interfaceC2188 = this.f7784;
        C2601 c2601 = this.f7783;
        C2596 c2596 = (C2596) interfaceC2188;
        switch (i) {
            case 0:
                return WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend$lambda$1(c2601, c2596);
            default:
                return WindowInfoTrackerImpl$windowLayoutInfo$2.invokeSuspend$lambda$1(c2601, c2596);
        }
    }
}
