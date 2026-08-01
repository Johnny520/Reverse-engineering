package top.yukonga.miuix.kmp.extra;

import androidx.compose.runtime.InterfaceC2232;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6873 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2232 f16869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16870;

    public /* synthetic */ C6873(InterfaceC2232 interfaceC2232, int i) {
        this.f16870 = i;
        this.f16869 = interfaceC2232;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16870;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        InterfaceC2232 interfaceC2232 = this.f16869;
        switch (i) {
            case 0:
                return C0826x506131fd.invokeSuspend$lambda$0(interfaceC2232, fFloatValue, fFloatValue2);
            default:
                return DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1.invokeSuspend$lambda$0(interfaceC2232, fFloatValue, fFloatValue2);
        }
    }
}
