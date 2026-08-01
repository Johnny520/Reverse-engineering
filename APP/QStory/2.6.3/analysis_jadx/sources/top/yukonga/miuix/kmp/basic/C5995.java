package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5995 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f16340;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5401 f16341;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1397 f16342;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ boolean f16343;

    public C5995(boolean z, InterfaceC5401 interfaceC5401, InterfaceC1397 interfaceC1397, InterfaceC1395 interfaceC1395) {
        this.f16343 = z;
        this.f16341 = interfaceC5401;
        this.f16342 = interfaceC1397;
        this.f16340 = interfaceC1395;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        ((Number) obj).doubleValue();
        InterfaceC1397 interfaceC1397 = this.f16342;
        ((AbstractC1349) interfaceC1397).m2435(1.0f);
        if (!this.f16343) {
            InterfaceC1395 interfaceC1395 = this.f16340;
            InterfaceC5452 interfaceC5452 = (InterfaceC5452) interfaceC1395.getValue();
            if (interfaceC5452 != null) {
                interfaceC5452.mo10256(null);
            }
            interfaceC1395.setValue(AbstractC5399.m10477(this.f16341, null, null, new ScrollBarKt$ScrollBar$3$1$2$1(interfaceC1397, null), 3));
        }
        return C5176.f14739;
    }
}
