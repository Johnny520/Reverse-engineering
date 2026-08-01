package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2233;
import kotlin.C6008;
import p068.InterfaceC7372;
import p069.AbstractC7390;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6850 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16788;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16789;

    public /* synthetic */ C6850(Object obj, int i) {
        this.f16789 = i;
        this.f16788 = obj;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        C6864 c6864;
        int i = this.f16789;
        Object obj = this.f16788;
        switch (i) {
            case 0:
                return Integer.valueOf(NumberPickerKt$NumberPicker$5$1.invokeSuspend$lambda$0((InterfaceC2168) obj));
            case 1:
                InterfaceC7372 interfaceC7372 = (InterfaceC7372) ((InterfaceC2230) obj).getValue();
                if (interfaceC7372 != null) {
                    interfaceC7372.invoke();
                }
                return C6008.f15084;
            case 2:
                float fM2992 = ((AbstractC2181) ((InterfaceC2233) obj)).m2992();
                return Float.valueOf(fM2992 >= 0.0f ? fM2992 : 0.0f);
            default:
                C6856 c6856 = ((C6865) obj).f16830;
                if (c6856 != null && (c6864 = c6856.f16802) != null) {
                    fM11954 = c6864.m11954();
                }
                return Integer.valueOf(Float.isNaN(fM11954) ? 0 : AbstractC7390.m12617(fM11954));
        }
    }
}
