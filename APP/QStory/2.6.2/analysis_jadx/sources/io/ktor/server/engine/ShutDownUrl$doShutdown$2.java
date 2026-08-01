package io.ktor.server.engine;

import bsh.C2632;
import io.ktor.server.application.AbstractC4059;
import io.ktor.server.application.C4057;
import io.ktor.server.application.InterfaceC4054;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5459;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5440;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.ShutDownUrl$doShutdown$2", f = "ShutDownUrl.kt", l = {37}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ShutDownUrl$doShutdown$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C4057 $application;
    final /* synthetic */ InterfaceC4054 $environment;
    final /* synthetic */ int $exitCode;
    final /* synthetic */ InterfaceC5440 $latch;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutDownUrl$doShutdown$2(InterfaceC5440 interfaceC5440, C4057 c4057, InterfaceC4054 interfaceC4054, int i, InterfaceC4356<? super ShutDownUrl$doShutdown$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$latch = interfaceC5440;
        this.$application = c4057;
        this.$environment = interfaceC4054;
        this.$exitCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ShutDownUrl$doShutdown$2(this.$latch, this.$application, this.$environment, this.$exitCode, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ShutDownUrl$doShutdown$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4359 interfaceC4359 = this.$latch;
            this.label = 1;
            if (((C5459) interfaceC4359).mo10558(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        this.$application.f12342.m13505(AbstractC4059.f12351, this.$environment);
        this.$application.m8473();
        System.exit(this.$exitCode);
        C2632.m5294("System.exit returned normally, while it was supposed to halt JVM.");
        return null;
    }
}
