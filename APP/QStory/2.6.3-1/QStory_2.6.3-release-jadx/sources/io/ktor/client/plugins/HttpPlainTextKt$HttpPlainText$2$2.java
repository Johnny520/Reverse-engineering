package io.ktor.client.plugins;

import com.alibaba.fastjson2.C3775;
import io.ktor.client.plugins.api.AbstractC4714;
import io.ktor.client.statement.AbstractC4778;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import java.nio.charset.Charset;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import p068.InterfaceC7374;
import p075.C7686;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", m556f = "HttpPlainText.kt", m557l = {137}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m151d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰哲苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;", "content", "L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;", "requestedType", "", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰哲苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpPlainTextKt$HttpPlainText$2$2 extends SuspendLambda implements InterfaceC7374 {
    final /* synthetic */ Charset $responseCharsetFallback;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$2(Charset charset, InterfaceC5189<? super HttpPlainTextKt$HttpPlainText$2$2> interfaceC5189) {
        super(5, interfaceC5189);
        this.$responseCharsetFallback = charset;
    }

    @Override // p068.InterfaceC7374
    public final Object invoke(AbstractC4714 abstractC4714, AbstractC4778 abstractC4778, InterfaceC5084 interfaceC5084, C7686 c7686, InterfaceC5189<Object> interfaceC5189) {
        HttpPlainTextKt$HttpPlainText$2$2 httpPlainTextKt$HttpPlainText$2$2 = new HttpPlainTextKt$HttpPlainText$2$2(this.$responseCharsetFallback, interfaceC5189);
        httpPlainTextKt$HttpPlainText$2$2.L$0 = abstractC4778;
        httpPlainTextKt$HttpPlainText$2$2.L$1 = interfaceC5084;
        httpPlainTextKt$HttpPlainText$2$2.L$2 = c7686;
        return httpPlainTextKt$HttpPlainText$2$2.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (this.L$0 != null) {
                C3775.m6954();
                return null;
            }
            InterfaceC5084 interfaceC5084 = (InterfaceC5084) this.L$1;
            if (!AbstractC5227.m9466(((C7686) this.L$2).f18643, AbstractC5228.f13320.mo9476(String.class))) {
                return null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = AbstractC5076.m9232(interfaceC5084, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (this.L$0 != null) {
                C3775.m6954();
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        throw null;
    }
}
