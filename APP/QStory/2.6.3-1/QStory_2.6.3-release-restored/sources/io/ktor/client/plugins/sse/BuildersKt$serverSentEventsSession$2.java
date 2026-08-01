package io.ktor.client.plugins.sse;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import io.ktor.client.statement.AbstractC4775;
import io.ktor.util.C5041;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.C6292;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6273;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession$2", m556f = "builders.kt", m557l = {258, 261, 280, 280}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class BuildersKt$serverSentEventsSession$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6273 $sessionDeferred;
    final /* synthetic */ AbstractC4775 $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$serverSentEventsSession$2(AbstractC4775 abstractC4775, InterfaceC6273 interfaceC6273, InterfaceC5189<? super BuildersKt$serverSentEventsSession$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$statement = abstractC4775;
        this.$sessionDeferred = interfaceC6273;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new BuildersKt$serverSentEventsSession$2(this.$statement, this.$sessionDeferred, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BuildersKt$serverSentEventsSession$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        try {
            try {
                try {
                    if (i == 0) {
                        AbstractC6017.m10769(obj);
                        InterfaceC6273 interfaceC6273 = this.$sessionDeferred;
                        this.L$0 = null;
                        this.L$1 = interfaceC6273;
                        this.label = 1;
                        throw null;
                    }
                    try {
                        if (i == 1) {
                            AbstractC0900.m697(this.L$0);
                            AbstractC6017.m10769(obj);
                            if (obj == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                        if (i == 2) {
                            if (this.L$2 != null) {
                                C3775.m6954();
                                return null;
                            }
                            AbstractC0900.m697(this.L$0);
                            AbstractC6017.m10769(obj);
                            if (obj != null) {
                                throw new ClassCastException();
                            }
                            throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.sse.ClientSSESession");
                        }
                        if (i == 3) {
                            AbstractC6017.m10769(obj);
                            return c6008;
                        }
                        if (i != 4) {
                            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) this.L$0;
                        AbstractC6017.m10769(obj);
                        throw th;
                    } catch (Throwable th2) {
                        this.L$0 = th2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        throw null;
                    }
                } catch (Throwable th3) {
                    InterfaceC6273 interfaceC62732 = this.$sessionDeferred;
                    C5041 c5041 = AbstractC4739.f12463;
                    if (th3 instanceof SSEClientException) {
                        th3.getResponse();
                    }
                    ((C6270) interfaceC62732).m11088(new SSEClientException(null, th3, th3.getMessage()));
                }
            } catch (CancellationException e) {
                ((C6292) this.$sessionDeferred).mo10844(e);
            }
            return c6008;
        } catch (CancellationException e2) {
            throw AbstractC9004.m14184(e2);
        }
    }
}
