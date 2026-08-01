package io.ktor.client.engine.cio;

import androidx.activity.AbstractC0053;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1", f = "ConnectionPipeline.kt", l = {44, 49, 50, 56, 57}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ConnectionPipeline$pipelineContext$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $keepAliveTime;
    final /* synthetic */ boolean $overProxy;
    final /* synthetic */ InterfaceC5206 $tasks;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC3872 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipeline$pipelineContext$1(long j, AbstractC3872 abstractC3872, boolean z, InterfaceC5206 interfaceC5206, InterfaceC4356<? super ConnectionPipeline$pipelineContext$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$keepAliveTime = j;
        this.this$0 = abstractC3872;
        this.$overProxy = z;
        this.$tasks = interfaceC5206;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ConnectionPipeline$pipelineContext$1(this.$keepAliveTime, this.this$0, this.$overProxy, this.$tasks, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ConnectionPipeline$pipelineContext$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Throwable th = null;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
            } else {
                if (i == 1) {
                    AbstractC5184.m10206(obj);
                    AbstractC0053.m137(obj);
                    th.getClass();
                    throw null;
                }
                if (i == 2) {
                    AbstractC0053.m137(this.L$0);
                    AbstractC5184.m10206(obj);
                    throw null;
                }
                if (i == 3) {
                    AbstractC0053.m137(this.L$0);
                    AbstractC5184.m10206(obj);
                    throw null;
                }
                if (i == 4) {
                    AbstractC5184.m10206(obj);
                    throw null;
                }
                if (i != 5) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            long j = this.$keepAliveTime;
            ConnectionPipeline$pipelineContext$1$task$1 connectionPipeline$pipelineContext$1$task$1 = new ConnectionPipeline$pipelineContext$1$task$1(this.$tasks, null);
            this.label = 1;
            obj = AbstractC5398.m10469(j, connectionPipeline$pipelineContext$1$task$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            AbstractC0053.m137(obj);
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
