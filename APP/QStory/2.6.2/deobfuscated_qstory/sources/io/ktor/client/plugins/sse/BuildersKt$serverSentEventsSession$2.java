package io.ktor.client.plugins.sse;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.alibaba.fastjson2.C2941;
import io.ktor.client.statement.AbstractC3942;
import io.ktor.util.C4208;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5437;
import kotlinx.coroutines.C5459;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5440;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession$2", f = "builders.kt", l = {258, 261, 280, 280}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class BuildersKt$serverSentEventsSession$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5440 $sessionDeferred;
    final /* synthetic */ AbstractC3942 $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$serverSentEventsSession$2(AbstractC3942 abstractC3942, InterfaceC5440 interfaceC5440, InterfaceC4356<? super BuildersKt$serverSentEventsSession$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$statement = abstractC3942;
        this.$sessionDeferred = interfaceC5440;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new BuildersKt$serverSentEventsSession$2(this.$statement, this.$sessionDeferred, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BuildersKt$serverSentEventsSession$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        try {
            try {
                try {
                    if (i == 0) {
                        AbstractC5184.m10206(obj);
                        InterfaceC5440 interfaceC5440 = this.$sessionDeferred;
                        this.L$0 = null;
                        this.L$1 = interfaceC5440;
                        this.label = 1;
                        throw null;
                    }
                    try {
                        if (i == 1) {
                            AbstractC0053.m137(this.L$0);
                            AbstractC5184.m10206(obj);
                            if (obj == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                        if (i == 2) {
                            if (this.L$2 != null) {
                                C2941.m6336();
                                return null;
                            }
                            AbstractC0053.m137(this.L$0);
                            AbstractC5184.m10206(obj);
                            if (obj != null) {
                                throw new ClassCastException();
                            }
                            throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.sse.ClientSSESession");
                        }
                        if (i == 3) {
                            AbstractC5184.m10206(obj);
                            return c5175;
                        }
                        if (i != 4) {
                            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) this.L$0;
                        AbstractC5184.m10206(obj);
                        throw th;
                    } catch (Throwable th2) {
                        this.L$0 = th2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        throw null;
                    }
                } catch (Throwable th3) {
                    InterfaceC5440 interfaceC54402 = this.$sessionDeferred;
                    C4208 c4208 = AbstractC3906.f12113;
                    if (th3 instanceof SSEClientException) {
                        th3.getResponse();
                    }
                    ((C5437) interfaceC54402).m10525(new SSEClientException(null, th3, th3.getMessage()));
                }
            } catch (CancellationException e) {
                ((C5459) this.$sessionDeferred).mo10281(e);
            }
            return c5175;
        } catch (CancellationException e2) {
            throw AbstractC0455.m1139(e2);
        }
    }
}
