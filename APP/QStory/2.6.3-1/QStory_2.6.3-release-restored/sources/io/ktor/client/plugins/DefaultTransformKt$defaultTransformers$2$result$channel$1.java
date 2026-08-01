package io.ktor.client.plugins;

import io.ktor.client.statement.AbstractC4778;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
@InterfaceC7691(m555c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", m556f = "DefaultTransform.kt", m557l = {98}, m558m = "invokeSuspend")
public final class DefaultTransformKt$defaultTransformers$2$result$channel$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Object $body;
    final /* synthetic */ AbstractC4778 $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2$result$channel$1(Object obj, AbstractC4778 abstractC4778, InterfaceC5189<? super DefaultTransformKt$defaultTransformers$2$result$channel$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$body = obj;
        this.$response = abstractC4778;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DefaultTransformKt$defaultTransformers$2$result$channel$1 defaultTransformKt$defaultTransformers$2$result$channel$1 = new DefaultTransformKt$defaultTransformers$2$result$channel$1(this.$body, this.$response, interfaceC5189);
        defaultTransformKt$defaultTransformers$2$result$channel$1.L$0 = obj;
        return defaultTransformKt$defaultTransformers$2$result$channel$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DefaultTransformKt$defaultTransformers$2$result$channel$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C5058 c5058 = (C5058) this.L$0;
                InterfaceC5084 interfaceC5084 = (InterfaceC5084) this.$body;
                InterfaceC5079 interfaceC5079 = c5058.f13071;
                this.label = 1;
                obj = AbstractC5076.m9222(interfaceC5084, interfaceC5079, Long.MAX_VALUE, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            ((Number) obj).longValue();
            return C6008.f15084;
        } catch (CancellationException e) {
            AbstractC6231.m11068(null, e);
            throw null;
        } catch (Throwable th) {
            AbstractC6231.m11068(null, AbstractC6231.m11050("Receive failed", th));
            throw null;
        }
    }
}
