package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.SharedFlowImpl", m556f = "SharedFlow.kt", m557l = {387, 394, 397}, m558m = "collect$suspendImpl", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class SharedFlowImpl$collect$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6119 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(C6119 c6119, InterfaceC5189<? super SharedFlowImpl$collect$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6119;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C6119.m10874(this.this$0, null, this);
    }
}
