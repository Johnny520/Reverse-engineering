package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2942;
import io.ktor.client.plugins.api.AbstractC3882;
import io.ktor.client.statement.AbstractC3946;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.InterfaceC4252;
import java.nio.charset.Charset;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import p052.InterfaceC6545;
import p059.C6857;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", l = {137}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰哲苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;", "content", "L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;", "requestedType", "", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰哲苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
final class HttpPlainTextKt$HttpPlainText$2$2 extends SuspendLambda implements InterfaceC6545 {
    final /* synthetic */ Charset $responseCharsetFallback;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$2(Charset charset, InterfaceC4357<? super HttpPlainTextKt$HttpPlainText$2$2> interfaceC4357) {
        super(5, interfaceC4357);
        this.$responseCharsetFallback = charset;
    }

    @Override // p052.InterfaceC6545
    public final Object invoke(AbstractC3882 abstractC3882, AbstractC3946 abstractC3946, InterfaceC4252 interfaceC4252, C6857 c6857, InterfaceC4357<Object> interfaceC4357) {
        HttpPlainTextKt$HttpPlainText$2$2 httpPlainTextKt$HttpPlainText$2$2 = new HttpPlainTextKt$HttpPlainText$2$2(this.$responseCharsetFallback, interfaceC4357);
        httpPlainTextKt$HttpPlainText$2$2.L$0 = abstractC3946;
        httpPlainTextKt$HttpPlainText$2$2.L$1 = interfaceC4252;
        httpPlainTextKt$HttpPlainText$2$2.L$2 = c6857;
        return httpPlainTextKt$HttpPlainText$2$2.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (this.L$0 != null) {
                C2942.m6394();
                return null;
            }
            InterfaceC4252 interfaceC4252 = (InterfaceC4252) this.L$1;
            if (!AbstractC4395.m8907(((C6857) this.L$2).f18298, AbstractC4396.f12975.mo8917(String.class))) {
                return null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = AbstractC4244.m8673(interfaceC4252, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (this.L$0 != null) {
                C2942.m6394();
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        throw null;
    }
}
