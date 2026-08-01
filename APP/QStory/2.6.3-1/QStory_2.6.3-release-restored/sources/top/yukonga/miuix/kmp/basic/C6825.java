package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.flow.InterfaceC6150;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6825 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2230 f16685;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6233 f16686;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2232 f16687;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ boolean f16688;

    public C6825(boolean z, InterfaceC6233 interfaceC6233, InterfaceC2232 interfaceC2232, InterfaceC2230 interfaceC2230) {
        this.f16688 = z;
        this.f16686 = interfaceC6233;
        this.f16687 = interfaceC2232;
        this.f16685 = interfaceC2230;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        ((Number) obj).doubleValue();
        InterfaceC2232 interfaceC2232 = this.f16687;
        ((AbstractC2184) interfaceC2232).m2995(1.0f);
        if (!this.f16688) {
            InterfaceC2230 interfaceC2230 = this.f16685;
            InterfaceC6284 interfaceC6284 = (InterfaceC6284) interfaceC2230.getValue();
            if (interfaceC6284 != null) {
                interfaceC6284.mo10815(null);
            }
            interfaceC2230.setValue(AbstractC6231.m11036(this.f16686, null, null, new ScrollBarKt$ScrollBar$3$1$2$1(interfaceC2232, null), 3));
        }
        return C6008.f15084;
    }
}
