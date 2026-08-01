package io.ktor.server.engine;

import bsh.C2633;
import io.ktor.server.application.AbstractC4060;
import io.ktor.server.application.C4058;
import io.ktor.server.application.InterfaceC4055;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5460;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5441;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.ShutDownUrl$doShutdown$2", f = "ShutDownUrl.kt", l = {37}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ShutDownUrl$doShutdown$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C4058 $application;
    final /* synthetic */ InterfaceC4055 $environment;
    final /* synthetic */ int $exitCode;
    final /* synthetic */ InterfaceC5441 $latch;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutDownUrl$doShutdown$2(InterfaceC5441 interfaceC5441, C4058 c4058, InterfaceC4055 interfaceC4055, int i, InterfaceC4357<? super ShutDownUrl$doShutdown$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$latch = interfaceC5441;
        this.$application = c4058;
        this.$environment = interfaceC4055;
        this.$exitCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ShutDownUrl$doShutdown$2(this.$latch, this.$application, this.$environment, this.$exitCode, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ShutDownUrl$doShutdown$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC4360 interfaceC4360 = this.$latch;
            this.label = 1;
            if (((C5460) interfaceC4360).mo10564(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        this.$application.f12346.m13532(AbstractC4060.f12355, this.$environment);
        this.$application.m8463();
        System.exit(this.$exitCode);
        C2633.m5339("System.exit returned normally, while it was supposed to halt JVM.");
        return null;
    }
}
