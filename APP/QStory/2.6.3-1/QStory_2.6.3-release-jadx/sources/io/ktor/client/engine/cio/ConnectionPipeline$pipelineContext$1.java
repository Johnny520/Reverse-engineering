package io.ktor.client.engine.cio;

import androidx.activity.AbstractC0900;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1", m556f = "ConnectionPipeline.kt", m557l = {44, 49, 50, 56, 57}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ConnectionPipeline$pipelineContext$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $keepAliveTime;
    final /* synthetic */ boolean $overProxy;
    final /* synthetic */ InterfaceC6039 $tasks;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4705 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipeline$pipelineContext$1(long j, AbstractC4705 abstractC4705, boolean z, InterfaceC6039 interfaceC6039, InterfaceC5189<? super ConnectionPipeline$pipelineContext$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$keepAliveTime = j;
        this.this$0 = abstractC4705;
        this.$overProxy = z;
        this.$tasks = interfaceC6039;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ConnectionPipeline$pipelineContext$1(this.$keepAliveTime, this.this$0, this.$overProxy, this.$tasks, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ConnectionPipeline$pipelineContext$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Throwable th = null;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
            } else {
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    AbstractC0900.m697(obj);
                    th.getClass();
                    throw null;
                }
                if (i == 2) {
                    AbstractC0900.m697(this.L$0);
                    AbstractC6017.m10769(obj);
                    throw null;
                }
                if (i == 3) {
                    AbstractC0900.m697(this.L$0);
                    AbstractC6017.m10769(obj);
                    throw null;
                }
                if (i == 4) {
                    AbstractC6017.m10769(obj);
                    throw null;
                }
                if (i != 5) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            long j = this.$keepAliveTime;
            ConnectionPipeline$pipelineContext$1$task$1 connectionPipeline$pipelineContext$1$task$1 = new ConnectionPipeline$pipelineContext$1$task$1(this.$tasks, null);
            this.label = 1;
            obj = AbstractC6231.m11032(j, connectionPipeline$pipelineContext$1$task$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            AbstractC0900.m697(obj);
            th.getClass();
            throw null;
        } catch (ClosedChannelException unused) {
            throw null;
        } catch (CancellationException unused2) {
            throw null;
        } catch (ClosedReceiveChannelException unused3) {
            throw null;
        }
    }
}
