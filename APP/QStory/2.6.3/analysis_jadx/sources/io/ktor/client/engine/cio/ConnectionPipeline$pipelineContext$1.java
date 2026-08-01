package io.ktor.client.engine.cio;

import androidx.activity.AbstractC0053;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.ConnectionPipeline$pipelineContext$1", f = "ConnectionPipeline.kt", l = {44, 49, 50, 56, 57}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ConnectionPipeline$pipelineContext$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ long $keepAliveTime;
    final /* synthetic */ boolean $overProxy;
    final /* synthetic */ InterfaceC5207 $tasks;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC3873 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipeline$pipelineContext$1(long j, AbstractC3873 abstractC3873, boolean z, InterfaceC5207 interfaceC5207, InterfaceC4357<? super ConnectionPipeline$pipelineContext$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$keepAliveTime = j;
        this.this$0 = abstractC3873;
        this.$overProxy = z;
        this.$tasks = interfaceC5207;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ConnectionPipeline$pipelineContext$1(this.$keepAliveTime, this.this$0, this.$overProxy, this.$tasks, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ConnectionPipeline$pipelineContext$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Throwable th = null;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
            } else {
                if (i == 1) {
                    AbstractC5185.m10210(obj);
                    AbstractC0053.m137(obj);
                    th.getClass();
                    throw null;
                }
                if (i == 2) {
                    AbstractC0053.m137(this.L$0);
                    AbstractC5185.m10210(obj);
                    throw null;
                }
                if (i == 3) {
                    AbstractC0053.m137(this.L$0);
                    AbstractC5185.m10210(obj);
                    throw null;
                }
                if (i == 4) {
                    AbstractC5185.m10210(obj);
                    throw null;
                }
                if (i != 5) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            long j = this.$keepAliveTime;
            ConnectionPipeline$pipelineContext$1$task$1 connectionPipeline$pipelineContext$1$task$1 = new ConnectionPipeline$pipelineContext$1$task$1(this.$tasks, null);
            this.label = 1;
            obj = AbstractC5399.m10473(j, connectionPipeline$pipelineContext$1$task$1, this);
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
