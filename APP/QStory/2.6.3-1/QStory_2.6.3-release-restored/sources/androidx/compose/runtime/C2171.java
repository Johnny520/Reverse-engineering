package androidx.compose.runtime;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.flow.InterfaceC6150;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2171 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2223 f4243;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4244;

    public /* synthetic */ C2171(InterfaceC2223 interfaceC2223, int i) {
        this.f4244 = i;
        this.f4243 = interfaceC2223;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        int i = this.f4244;
        C6008 c6008 = C6008.f15084;
        InterfaceC2223 interfaceC2223 = this.f4243;
        switch (i) {
            case 0:
                ((C2222) interfaceC2223).setValue(obj);
                break;
            case 1:
                ((C2222) interfaceC2223).setValue(obj);
                break;
            case 2:
                ((C2222) interfaceC2223).setValue(obj);
                break;
            default:
                ((C2222) interfaceC2223).setValue(obj);
                break;
        }
        return c6008;
    }
}
