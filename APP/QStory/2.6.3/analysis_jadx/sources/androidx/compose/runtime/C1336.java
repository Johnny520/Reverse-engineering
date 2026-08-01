package androidx.compose.runtime;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1336 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1388 f3898;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3899;

    public /* synthetic */ C1336(InterfaceC1388 interfaceC1388, int i) {
        this.f3899 = i;
        this.f3898 = interfaceC1388;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        int i = this.f3899;
        C5176 c5176 = C5176.f14739;
        InterfaceC1388 interfaceC1388 = this.f3898;
        switch (i) {
            case 0:
                ((C1387) interfaceC1388).setValue(obj);
                break;
            case 1:
                ((C1387) interfaceC1388).setValue(obj);
                break;
            case 2:
                ((C1387) interfaceC1388).setValue(obj);
                break;
            default:
                ((C1387) interfaceC1388).setValue(obj);
                break;
        }
        return c5176;
    }
}
