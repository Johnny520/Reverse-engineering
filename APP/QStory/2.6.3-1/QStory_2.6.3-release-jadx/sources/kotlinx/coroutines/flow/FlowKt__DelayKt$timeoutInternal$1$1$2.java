package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.C5989;
import kotlinx.coroutines.TimeoutCancellationException;
import p068.InterfaceC7387;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, m151d2 = {"<anonymous>", ""}, m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", m556f = "Delay.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements InterfaceC7387 {

    /* JADX INFO: renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    final /* synthetic */ long f15145$$v$c$kotlintimeDuration$timeout$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, InterfaceC5189<? super FlowKt__DelayKt$timeoutInternal$1$1$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.f15145$$v$c$kotlintimeDuration$timeout$0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.f15145$$v$c$kotlintimeDuration$timeout$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<?> interfaceC5189) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) C5989.m10754(this.f15145$$v$c$kotlintimeDuration$timeout$0)));
    }
}
