package kotlinx.coroutines.flow;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {134}, m = "collectWhile", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public FlowKt__LimitKt$collectWhile$1(InterfaceC4356<? super FlowKt__LimitKt$collectWhile$1> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
        } catch (AbortFlowException e) {
            if (e.owner != i) {
                throw e;
            }
            AbstractC5398.m10498(getContext());
        }
        if (i != 0) {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        AbstractC5184.m10206(obj);
        C5243 c5243 = new C5243();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = c5243;
        this.I$0 = 0;
        this.label = 1;
        throw null;
    }
}
