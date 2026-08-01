package kotlinx.coroutines.flow;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6284;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m556f = "Errors.kt", m557l = {152}, m558m = "catchImpl", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ErrorsKt$catchImpl$1(InterfaceC5189<? super FlowKt__ErrorsKt$catchImpl$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, kotlin.jvm.internal.Ref$ObjectRef] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6284 interfaceC6284;
        CancellationException cancellationExceptionMo11122;
        this.result = obj;
        ?? r0 = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = r0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            if (r0 == 0) {
                AbstractC6017.m10769(obj);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = ref$ObjectRef;
                this.label = 1;
                throw null;
            }
            if (r0 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            return null;
        } catch (Throwable th) {
            Throwable th2 = (Throwable) r0.element;
            if ((th2 != null && th2.equals(th)) || ((interfaceC6284 = (InterfaceC6284) getContext().get(C6285.f15450)) != null && interfaceC6284.isCancelled() && (cancellationExceptionMo11122 = interfaceC6284.mo11122()) != null && cancellationExceptionMo11122.equals(th))) {
                throw th;
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                AbstractC6019.m10775(th2, th);
                throw th2;
            }
            AbstractC6019.m10775(th, th2);
            throw th;
        }
    }
}
