package io.ktor.server.engine;

import bsh.C3466;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4887;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6292;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6273;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.ShutDownUrl$doShutdown$2", m556f = "ShutDownUrl.kt", m557l = {37}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ShutDownUrl$doShutdown$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C4890 $application;
    final /* synthetic */ InterfaceC4887 $environment;
    final /* synthetic */ int $exitCode;
    final /* synthetic */ InterfaceC6273 $latch;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutDownUrl$doShutdown$2(InterfaceC6273 interfaceC6273, C4890 c4890, InterfaceC4887 interfaceC4887, int i, InterfaceC5189<? super ShutDownUrl$doShutdown$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$latch = interfaceC6273;
        this.$application = c4890;
        this.$environment = interfaceC4887;
        this.$exitCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ShutDownUrl$doShutdown$2(this.$latch, this.$application, this.$environment, this.$exitCode, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ShutDownUrl$doShutdown$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5192 interfaceC5192 = this.$latch;
            this.label = 1;
            if (((C6292) interfaceC5192).mo11123(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        this.$application.f12691.m14091(AbstractC4892.f12700, this.$environment);
        this.$application.m9022();
        System.exit(this.$exitCode);
        C3466.m5899("System.exit returned normally, while it was supposed to halt JVM.");
        return null;
    }
}
