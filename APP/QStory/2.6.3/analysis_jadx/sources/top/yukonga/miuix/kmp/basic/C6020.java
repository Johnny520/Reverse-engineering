package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.C5176;
import p052.InterfaceC6543;
import p053.AbstractC6561;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6020 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16444;

    public /* synthetic */ C6020(Object obj, int i) {
        this.f16444 = i;
        this.f16443 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        C6034 c6034;
        int i = this.f16444;
        Object obj = this.f16443;
        switch (i) {
            case 0:
                return Integer.valueOf(NumberPickerKt$NumberPicker$5$1.invokeSuspend$lambda$0((InterfaceC1333) obj));
            case 1:
                InterfaceC6543 interfaceC6543 = (InterfaceC6543) ((InterfaceC1395) obj).getValue();
                if (interfaceC6543 != null) {
                    interfaceC6543.invoke();
                }
                return C5176.f14739;
            case 2:
                float fM2432 = ((AbstractC1346) ((InterfaceC1398) obj)).m2432();
                return Float.valueOf(fM2432 >= 0.0f ? fM2432 : 0.0f);
            default:
                C6026 c6026 = ((C6035) obj).f16485;
                if (c6026 != null && (c6034 = c6026.f16457) != null) {
                    fM11395 = c6034.m11395();
                }
                return Integer.valueOf(Float.isNaN(fM11395) ? 0 : AbstractC6561.m12058(fM11395));
        }
    }
}
