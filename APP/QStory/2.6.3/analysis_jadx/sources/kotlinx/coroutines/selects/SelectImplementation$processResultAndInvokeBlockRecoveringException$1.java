package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {726}, m = "processResultAndInvokeBlockRecoveringException", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class SelectImplementation$processResultAndInvokeBlockRecoveringException$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5369 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$processResultAndInvokeBlockRecoveringException$1(C5369 c5369, InterfaceC4357<? super SelectImplementation$processResultAndInvokeBlockRecoveringException$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c5369;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C5369 c5369 = this.this$0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5369.f14964;
        c5369.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new SelectImplementation$processResultAndInvokeBlockRecoveringException$1(c5369, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            throw null;
        }
        if (i2 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj2);
        return obj2;
    }
}
