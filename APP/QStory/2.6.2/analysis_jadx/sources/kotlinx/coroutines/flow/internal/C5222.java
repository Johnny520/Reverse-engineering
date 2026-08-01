package kotlinx.coroutines.flow.internal;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC5317;
import kotlinx.coroutines.internal.AbstractC5352;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5222 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6553 f14815;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4359 f14816;

    public C5222(InterfaceC5317 interfaceC5317, InterfaceC4359 interfaceC4359) {
        this.f14816 = interfaceC4359;
        this.f14814 = AbstractC5352.m10365(interfaceC4359);
        this.f14815 = new UndispatchedContextCollector$emitRef$1(interfaceC5317, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objM10294 = AbstractC5218.m10294(this.f14816, obj, this.f14814, this.f14815, interfaceC4356);
        return objM10294 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10294 : C5175.f14739;
    }
}
