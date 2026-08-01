package kotlinx.coroutines.flow;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.AbstractC5186;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5451;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ErrorsKt$catchImpl$1(InterfaceC4356<? super FlowKt__ErrorsKt$catchImpl$1> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, kotlin.jvm.internal.Ref$ObjectRef] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC5451 interfaceC5451;
        CancellationException cancellationExceptionMo10559;
        this.result = obj;
        ?? r0 = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = r0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            if (r0 == 0) {
                AbstractC5184.m10206(obj);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = ref$ObjectRef;
                this.label = 1;
                throw null;
            }
            if (r0 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            return null;
        } catch (Throwable th) {
            Throwable th2 = (Throwable) r0.element;
            if ((th2 != null && th2.equals(th)) || ((interfaceC5451 = (InterfaceC5451) getContext().get(C5452.f15105)) != null && interfaceC5451.isCancelled() && (cancellationExceptionMo10559 = interfaceC5451.mo10559()) != null && cancellationExceptionMo10559.equals(th))) {
                throw th;
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                AbstractC5186.m10212(th2, th);
                throw th2;
            }
            AbstractC5186.m10212(th, th2);
            throw th;
        }
    }
}
