package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.flow.InterfaceC5317;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5989 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f16331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5400 f16332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1397 f16333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ boolean f16334;

    public C5989(boolean z, InterfaceC5400 interfaceC5400, InterfaceC1397 interfaceC1397, InterfaceC1395 interfaceC1395) {
        this.f16334 = z;
        this.f16332 = interfaceC5400;
        this.f16333 = interfaceC1397;
        this.f16331 = interfaceC1395;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        ((Number) obj).doubleValue();
        InterfaceC1397 interfaceC1397 = this.f16333;
        ((AbstractC1349) interfaceC1397).m2425(1.0f);
        if (!this.f16334) {
            InterfaceC1395 interfaceC1395 = this.f16331;
            InterfaceC5451 interfaceC5451 = (InterfaceC5451) interfaceC1395.getValue();
            if (interfaceC5451 != null) {
                interfaceC5451.mo10252(null);
            }
            interfaceC1395.setValue(AbstractC5398.m10473(this.f16332, null, null, new ScrollBarKt$ScrollBar$3$1$2$1(interfaceC1397, null), 3));
        }
        return C5175.f14739;
    }
}
