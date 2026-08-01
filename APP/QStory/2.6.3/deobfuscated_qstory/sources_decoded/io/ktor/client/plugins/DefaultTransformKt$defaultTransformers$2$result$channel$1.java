package io.ktor.client.plugins;

import io.ktor.client.statement.AbstractC3946;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.C4226;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6862(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", l = {98}, m = "invokeSuspend")
public final class DefaultTransformKt$defaultTransformers$2$result$channel$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Object $body;
    final /* synthetic */ AbstractC3946 $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2$result$channel$1(Object obj, AbstractC3946 abstractC3946, InterfaceC4357<? super DefaultTransformKt$defaultTransformers$2$result$channel$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$body = obj;
        this.$response = abstractC3946;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DefaultTransformKt$defaultTransformers$2$result$channel$1 defaultTransformKt$defaultTransformers$2$result$channel$1 = new DefaultTransformKt$defaultTransformers$2$result$channel$1(this.$body, this.$response, interfaceC4357);
        defaultTransformKt$defaultTransformers$2$result$channel$1.L$0 = obj;
        return defaultTransformKt$defaultTransformers$2$result$channel$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DefaultTransformKt$defaultTransformers$2$result$channel$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C4226 c4226 = (C4226) this.L$0;
                InterfaceC4252 interfaceC4252 = (InterfaceC4252) this.$body;
                InterfaceC4247 interfaceC4247 = c4226.f12726;
                this.label = 1;
                obj = AbstractC4244.m8663(interfaceC4252, interfaceC4247, Long.MAX_VALUE, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            ((Number) obj).longValue();
            return C5176.f14739;
        } catch (CancellationException e) {
            AbstractC5399.m10509(null, e);
            throw null;
        } catch (Throwable th) {
            AbstractC5399.m10509(null, AbstractC5399.m10491("Receive failed", th));
            throw null;
        }
    }
}
