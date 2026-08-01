package io.ktor.server.cio.backend;

import com.android.dx.io.Opcodes;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.C5202;
import kotlinx.coroutines.channels.InterfaceC5199;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.cio.backend.ServerPipelineKt$pipelineWriterLoop$child$1", f = "ServerPipeline.kt", l = {Opcodes.SUB_DOUBLE_2ADDR}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;"}, k = 3, mv = {2, 0, 0})
final class ServerPipelineKt$pipelineWriterLoop$child$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5199 $channel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerPipelineKt$pipelineWriterLoop$child$1(InterfaceC5199 interfaceC5199, InterfaceC4357<? super ServerPipelineKt$pipelineWriterLoop$child$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$channel = interfaceC5199;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ServerPipelineKt$pipelineWriterLoop$child$1(this.$channel, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super InterfaceC4252> interfaceC4357) {
        return ((ServerPipelineKt$pipelineWriterLoop$child$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo10247;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5199 interfaceC5199 = this.$channel;
            this.label = 1;
            objMo10247 = interfaceC5199.mo10247(this);
            if (objMo10247 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            objMo10247 = ((C5202) obj).f14791;
        }
        return C5202.m10272(objMo10247);
    }
}
