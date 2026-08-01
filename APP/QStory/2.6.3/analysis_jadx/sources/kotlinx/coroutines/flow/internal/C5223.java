package kotlinx.coroutines.flow.internal;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC5318;
import kotlinx.coroutines.internal.AbstractC5353;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5223 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6554 f14815;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4360 f14816;

    public C5223(InterfaceC5318 interfaceC5318, InterfaceC4360 interfaceC4360) {
        this.f14816 = interfaceC4360;
        this.f14814 = AbstractC5353.m10369(interfaceC4360);
        this.f14815 = new UndispatchedContextCollector$emitRef$1(interfaceC5318, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objM10298 = AbstractC5219.m10298(this.f14816, obj, this.f14814, this.f14815, interfaceC4357);
        return objM10298 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10298 : C5176.f14739;
    }
}
