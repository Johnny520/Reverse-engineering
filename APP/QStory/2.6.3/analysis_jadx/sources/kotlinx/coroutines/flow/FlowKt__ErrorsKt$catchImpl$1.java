package kotlinx.coroutines.flow;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.AbstractC5187;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5452;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ErrorsKt$catchImpl$1(InterfaceC4357<? super FlowKt__ErrorsKt$catchImpl$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, kotlin.jvm.internal.Ref$ObjectRef] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC5452 interfaceC5452;
        CancellationException cancellationExceptionMo10563;
        this.result = obj;
        ?? r0 = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = r0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            if (r0 == 0) {
                AbstractC5185.m10210(obj);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = ref$ObjectRef;
                this.label = 1;
                throw null;
            }
            if (r0 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            return null;
        } catch (Throwable th) {
            Throwable th2 = (Throwable) r0.element;
            if ((th2 != null && th2.equals(th)) || ((interfaceC5452 = (InterfaceC5452) getContext().get(C5453.f15105)) != null && interfaceC5452.isCancelled() && (cancellationExceptionMo10563 = interfaceC5452.mo10563()) != null && cancellationExceptionMo10563.equals(th))) {
                throw th;
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                AbstractC5187.m10216(th2, th);
                throw th2;
            }
            AbstractC5187.m10216(th, th2);
            throw th;
        }
    }
}
