package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.InterfaceC1333;
import p052.InterfaceC6543;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0902 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1333 f2554;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2555;

    public /* synthetic */ C0902(InterfaceC1333 interfaceC1333, int i) {
        this.f2555 = i;
        this.f2554 = interfaceC1333;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f2555;
        InterfaceC1333 interfaceC1333 = this.f2554;
        switch (i) {
            case 0:
                return SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.invokeSuspend$lambda$0(interfaceC1333);
            default:
                return new C7329(((C7329) interfaceC1333.getValue()).f19541);
        }
    }
}
