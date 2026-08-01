package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.InterfaceC1333;
import p052.InterfaceC6542;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0902 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1333 f2553;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2554;

    public /* synthetic */ C0902(InterfaceC1333 interfaceC1333, int i) {
        this.f2554 = i;
        this.f2553 = interfaceC1333;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f2554;
        InterfaceC1333 interfaceC1333 = this.f2553;
        switch (i) {
            case 0:
                return SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.invokeSuspend$lambda$0(interfaceC1333);
            default:
                return new C7328(((C7328) interfaceC1333.getValue()).f19546);
        }
    }
}
