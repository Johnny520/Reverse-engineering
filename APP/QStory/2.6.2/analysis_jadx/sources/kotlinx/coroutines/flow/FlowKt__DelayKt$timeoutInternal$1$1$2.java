package kotlinx.coroutines.flow;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.C5156;
import kotlinx.coroutines.TimeoutCancellationException;
import p052.InterfaceC6557;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend", v = 1)
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements InterfaceC6557 {

    /* JADX INFO: renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    final /* synthetic */ long f14800$$v$c$kotlintimeDuration$timeout$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, InterfaceC4356<? super FlowKt__DelayKt$timeoutInternal$1$1$2> interfaceC4356) {
        super(1, interfaceC4356);
        this.f14800$$v$c$kotlintimeDuration$timeout$0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.f14800$$v$c$kotlintimeDuration$timeout$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<?> interfaceC4356) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) C5156.m10191(this.f14800$$v$c$kotlintimeDuration$timeout$0)));
    }
}
