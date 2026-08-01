package io.ktor.client.plugins;

import io.ktor.client.statement.AbstractC3945;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.C4225;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6861(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", l = {98}, m = "invokeSuspend")
public final class DefaultTransformKt$defaultTransformers$2$result$channel$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Object $body;
    final /* synthetic */ AbstractC3945 $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2$result$channel$1(Object obj, AbstractC3945 abstractC3945, InterfaceC4356<? super DefaultTransformKt$defaultTransformers$2$result$channel$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$body = obj;
        this.$response = abstractC3945;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DefaultTransformKt$defaultTransformers$2$result$channel$1 defaultTransformKt$defaultTransformers$2$result$channel$1 = new DefaultTransformKt$defaultTransformers$2$result$channel$1(this.$body, this.$response, interfaceC4356);
        defaultTransformKt$defaultTransformers$2$result$channel$1.L$0 = obj;
        return defaultTransformKt$defaultTransformers$2$result$channel$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4225 c4225, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DefaultTransformKt$defaultTransformers$2$result$channel$1) create(c4225, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C4225 c4225 = (C4225) this.L$0;
                InterfaceC4251 interfaceC4251 = (InterfaceC4251) this.$body;
                InterfaceC4246 interfaceC4246 = c4225.f12722;
                this.label = 1;
                obj = AbstractC4243.m8673(interfaceC4251, interfaceC4246, Long.MAX_VALUE, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            ((Number) obj).longValue();
            return C5175.f14739;
        } catch (CancellationException e) {
            AbstractC5398.m10505(null, e);
            throw null;
        } catch (Throwable th) {
            AbstractC5398.m10505(null, AbstractC5398.m10487("Receive failed", th));
            throw null;
        }
    }
}
