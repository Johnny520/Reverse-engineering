package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.InterfaceC2168;
import p068.InterfaceC7372;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1740 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2168 f2899;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2900;

    public /* synthetic */ C1740(InterfaceC2168 interfaceC2168, int i) {
        this.f2900 = i;
        this.f2899 = interfaceC2168;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f2900;
        InterfaceC2168 interfaceC2168 = this.f2899;
        switch (i) {
            case 0:
                return SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.invokeSuspend$lambda$0(interfaceC2168);
            default:
                return new C8158(((C8158) interfaceC2168.getValue()).f19886);
        }
    }
}
