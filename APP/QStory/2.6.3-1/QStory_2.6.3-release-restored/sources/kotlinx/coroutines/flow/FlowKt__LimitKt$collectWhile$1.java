package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m556f = "Limit.kt", m557l = {134}, m558m = "collectWhile", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 176)
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public FlowKt__LimitKt$collectWhile$1(InterfaceC5189<? super FlowKt__LimitKt$collectWhile$1> interfaceC5189) {
        super(interfaceC5189);
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
            AbstractC6231.m11061(getContext());
        }
        if (i != 0) {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        AbstractC6017.m10769(obj);
        C6076 c6076 = new C6076();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = c6076;
        this.I$0 = 0;
        this.label = 1;
        throw null;
    }
}
