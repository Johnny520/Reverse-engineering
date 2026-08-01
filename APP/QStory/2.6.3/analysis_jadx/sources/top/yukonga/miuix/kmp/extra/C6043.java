package top.yukonga.miuix.kmp.extra;

import androidx.compose.runtime.InterfaceC1397;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6043 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1397 f16524;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16525;

    public /* synthetic */ C6043(InterfaceC1397 interfaceC1397, int i) {
        this.f16525 = i;
        this.f16524 = interfaceC1397;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16525;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        InterfaceC1397 interfaceC1397 = this.f16524;
        switch (i) {
            case 0:
                return BottomSheetContentLayoutKt$BottomSheetContentLayout$resetGesture$1$1.invokeSuspend$lambda$0(interfaceC1397, fFloatValue, fFloatValue2);
            default:
                return DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1.invokeSuspend$lambda$0(interfaceC1397, fFloatValue, fFloatValue2);
        }
    }
}
