package io.ktor.client.plugins.sse;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import io.ktor.client.statement.AbstractC3943;
import io.ktor.util.C4209;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5438;
import kotlinx.coroutines.C5460;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5441;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession$2", f = "builders.kt", l = {258, 261, 280, 280}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class BuildersKt$serverSentEventsSession$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5441 $sessionDeferred;
    final /* synthetic */ AbstractC3943 $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$serverSentEventsSession$2(AbstractC3943 abstractC3943, InterfaceC5441 interfaceC5441, InterfaceC4357<? super BuildersKt$serverSentEventsSession$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$statement = abstractC3943;
        this.$sessionDeferred = interfaceC5441;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new BuildersKt$serverSentEventsSession$2(this.$statement, this.$sessionDeferred, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((BuildersKt$serverSentEventsSession$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        try {
            try {
                try {
                    if (i == 0) {
                        AbstractC5185.m10210(obj);
                        InterfaceC5441 interfaceC5441 = this.$sessionDeferred;
                        this.L$0 = null;
                        this.L$1 = interfaceC5441;
                        this.label = 1;
                        throw null;
                    }
                    try {
                        if (i == 1) {
                            AbstractC0053.m137(this.L$0);
                            AbstractC5185.m10210(obj);
                            if (obj == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                        if (i == 2) {
                            if (this.L$2 != null) {
                                C2942.m6394();
                                return null;
                            }
                            AbstractC0053.m137(this.L$0);
                            AbstractC5185.m10210(obj);
                            if (obj != null) {
                                throw new ClassCastException();
                            }
                            throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.sse.ClientSSESession");
                        }
                        if (i == 3) {
                            AbstractC5185.m10210(obj);
                            return c5176;
                        }
                        if (i != 4) {
                            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) this.L$0;
                        AbstractC5185.m10210(obj);
                        throw th;
                    } catch (Throwable th2) {
                        this.L$0 = th2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        throw null;
                    }
                } catch (Throwable th3) {
                    InterfaceC5441 interfaceC54412 = this.$sessionDeferred;
                    C4209 c4209 = AbstractC3907.f12118;
                    if (th3 instanceof SSEClientException) {
                        th3.getResponse();
                    }
                    ((C5438) interfaceC54412).m10529(new SSEClientException(null, th3, th3.getMessage()));
                }
            } catch (CancellationException e) {
                ((C5460) this.$sessionDeferred).mo10285(e);
            }
            return c5176;
        } catch (CancellationException e2) {
            throw AbstractC8175.m13625(e2);
        }
    }
}
