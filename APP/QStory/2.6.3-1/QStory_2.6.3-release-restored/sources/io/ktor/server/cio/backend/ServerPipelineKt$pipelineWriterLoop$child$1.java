package io.ktor.server.cio.backend;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.InterfaceC6031;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.cio.backend.ServerPipelineKt$pipelineWriterLoop$child$1", m556f = "ServerPipeline.kt", m557l = {Opcodes.SUB_DOUBLE_2ADDR}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;"}, m152k = 3, m153mv = {2, 0, 0})
final class ServerPipelineKt$pipelineWriterLoop$child$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6031 $channel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerPipelineKt$pipelineWriterLoop$child$1(InterfaceC6031 interfaceC6031, InterfaceC5189<? super ServerPipelineKt$pipelineWriterLoop$child$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$channel = interfaceC6031;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ServerPipelineKt$pipelineWriterLoop$child$1(this.$channel, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super InterfaceC5084> interfaceC5189) {
        return ((ServerPipelineKt$pipelineWriterLoop$child$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo10806;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6031 interfaceC6031 = this.$channel;
            this.label = 1;
            objMo10806 = interfaceC6031.mo10806(this);
            if (objMo10806 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            objMo10806 = ((C6034) obj).f15136;
        }
        return C6034.m10831(objMo10806);
    }
}
