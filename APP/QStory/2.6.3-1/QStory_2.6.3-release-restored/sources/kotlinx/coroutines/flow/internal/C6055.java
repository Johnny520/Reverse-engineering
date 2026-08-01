package kotlinx.coroutines.flow.internal;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC6150;
import kotlinx.coroutines.internal.AbstractC6185;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6055 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f15159;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7383 f15160;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5192 f15161;

    public C6055(InterfaceC6150 interfaceC6150, InterfaceC5192 interfaceC5192) {
        this.f15161 = interfaceC5192;
        this.f15159 = AbstractC6185.m10928(interfaceC5192);
        this.f15160 = new UndispatchedContextCollector$emitRef$1(interfaceC6150, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM10857 = AbstractC6051.m10857(this.f15161, obj, this.f15159, this.f15160, interfaceC5189);
        return objM10857 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10857 : C6008.f15084;
    }
}
