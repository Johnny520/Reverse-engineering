package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2941;
import io.ktor.client.plugins.api.AbstractC3881;
import io.ktor.client.statement.AbstractC3945;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.InterfaceC4251;
import java.nio.charset.Charset;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6544;
import p059.C6856;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", l = {137}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰哲苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;", "content", "L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;", "requestedType", "", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰哲苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
final class HttpPlainTextKt$HttpPlainText$2$2 extends SuspendLambda implements InterfaceC6544 {
    final /* synthetic */ Charset $responseCharsetFallback;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$2(Charset charset, InterfaceC4356<? super HttpPlainTextKt$HttpPlainText$2$2> interfaceC4356) {
        super(5, interfaceC4356);
        this.$responseCharsetFallback = charset;
    }

    @Override // p052.InterfaceC6544
    public final Object invoke(AbstractC3881 abstractC3881, AbstractC3945 abstractC3945, InterfaceC4251 interfaceC4251, C6856 c6856, InterfaceC4356<Object> interfaceC4356) {
        HttpPlainTextKt$HttpPlainText$2$2 httpPlainTextKt$HttpPlainText$2$2 = new HttpPlainTextKt$HttpPlainText$2$2(this.$responseCharsetFallback, interfaceC4356);
        httpPlainTextKt$HttpPlainText$2$2.L$0 = abstractC3945;
        httpPlainTextKt$HttpPlainText$2$2.L$1 = interfaceC4251;
        httpPlainTextKt$HttpPlainText$2$2.L$2 = c6856;
        return httpPlainTextKt$HttpPlainText$2$2.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            InterfaceC4251 interfaceC4251 = (InterfaceC4251) this.L$1;
            if (!AbstractC4394.m8917(((C6856) this.L$2).f18303, AbstractC4395.f12971.mo8927(String.class))) {
                return null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = AbstractC4243.m8683(interfaceC4251, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        throw null;
    }
}
