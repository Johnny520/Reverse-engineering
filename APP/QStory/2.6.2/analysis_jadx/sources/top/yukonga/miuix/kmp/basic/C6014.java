package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.C5175;
import p052.InterfaceC6542;
import p053.AbstractC6560;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6014 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16434;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16435;

    public /* synthetic */ C6014(Object obj, int i) {
        this.f16435 = i;
        this.f16434 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        C6028 c6028;
        int i = this.f16435;
        Object obj = this.f16434;
        switch (i) {
            case 0:
                return Integer.valueOf(NumberPickerKt$NumberPicker$5$1.invokeSuspend$lambda$0((InterfaceC1333) obj));
            case 1:
                InterfaceC6542 interfaceC6542 = (InterfaceC6542) ((InterfaceC1395) obj).getValue();
                if (interfaceC6542 != null) {
                    interfaceC6542.invoke();
                }
                return C5175.f14739;
            case 2:
                float fM2422 = ((AbstractC1346) ((InterfaceC1398) obj)).m2422();
                return Float.valueOf(fM2422 >= 0.0f ? fM2422 : 0.0f);
            default:
                C6020 c6020 = ((C6029) obj).f16476;
                if (c6020 != null && (c6028 = c6020.f16448) != null) {
                    fM11335 = c6028.m11335();
                }
                return Integer.valueOf(Float.isNaN(fM11335) ? 0 : AbstractC6560.m12006(fM11335));
        }
    }
}
