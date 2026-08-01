package top.yukonga.miuix.kmp.extra;

import androidx.compose.runtime.InterfaceC1397;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6037 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1397 f16515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16516;

    public /* synthetic */ C6037(InterfaceC1397 interfaceC1397, int i) {
        this.f16516 = i;
        this.f16515 = interfaceC1397;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16516;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        InterfaceC1397 interfaceC1397 = this.f16515;
        switch (i) {
            case 0:
                return BottomSheetContentLayoutKt$BottomSheetContentLayout$resetGesture$1$1.invokeSuspend$lambda$0(interfaceC1397, fFloatValue, fFloatValue2);
            default:
                return DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1.invokeSuspend$lambda$0(interfaceC1397, fFloatValue, fFloatValue2);
        }
    }
}
