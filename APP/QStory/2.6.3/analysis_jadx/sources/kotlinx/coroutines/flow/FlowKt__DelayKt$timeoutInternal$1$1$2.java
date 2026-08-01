package kotlinx.coroutines.flow;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.C5157;
import kotlinx.coroutines.TimeoutCancellationException;
import p052.InterfaceC6558;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend", v = 1)
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements InterfaceC6558 {

    /* JADX INFO: renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    final /* synthetic */ long f14800$$v$c$kotlintimeDuration$timeout$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, InterfaceC4357<? super FlowKt__DelayKt$timeoutInternal$1$1$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.f14800$$v$c$kotlintimeDuration$timeout$0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.f14800$$v$c$kotlintimeDuration$timeout$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<?> interfaceC4357) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) C5157.m10195(this.f14800$$v$c$kotlintimeDuration$timeout$0)));
    }
}
