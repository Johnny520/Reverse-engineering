package io.ktor.server.cio.backend;

import com.android.dx.io.Opcodes;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.C5201;
import kotlinx.coroutines.channels.InterfaceC5198;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.backend.ServerPipelineKt$pipelineWriterLoop$child$1", f = "ServerPipeline.kt", l = {Opcodes.SUB_DOUBLE_2ADDR}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;"}, k = 3, mv = {2, 0, 0})
final class ServerPipelineKt$pipelineWriterLoop$child$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5198 $channel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerPipelineKt$pipelineWriterLoop$child$1(InterfaceC5198 interfaceC5198, InterfaceC4356<? super ServerPipelineKt$pipelineWriterLoop$child$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$channel = interfaceC5198;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ServerPipelineKt$pipelineWriterLoop$child$1(this.$channel, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super InterfaceC4251> interfaceC4356) {
        return ((ServerPipelineKt$pipelineWriterLoop$child$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo10242;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5198 interfaceC5198 = this.$channel;
            this.label = 1;
            objMo10242 = interfaceC5198.mo10242(this);
            if (objMo10242 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            objMo10242 = ((C5201) obj).f14791;
        }
        return C5201.m10268(objMo10242);
    }
}
