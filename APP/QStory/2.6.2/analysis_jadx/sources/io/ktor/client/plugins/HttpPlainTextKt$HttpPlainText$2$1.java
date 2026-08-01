package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC3986;
import io.ktor.http.content.C3982;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p000.AbstractC6087;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p236.AbstractC8105;
import p236.AbstractC8114;
import p236.C8100;
import p236.C8115;
import p236.C8124;
import p241.C8139;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", f = "HttpPlainText.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "", "content", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;"}, k = 3, mv = {2, 0, 0})
final class HttpPlainTextKt$HttpPlainText$2$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ String $acceptCharsetHeader;
    final /* synthetic */ Charset $requestCharset;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$1(String str, Charset charset, InterfaceC4356<? super HttpPlainTextKt$HttpPlainText$2$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$acceptCharsetHeader = str;
        this.$requestCharset = charset;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C8139 c8139, Object obj, InterfaceC4356<? super AbstractC3986> interfaceC4356) {
        HttpPlainTextKt$HttpPlainText$2$1 httpPlainTextKt$HttpPlainText$2$1 = new HttpPlainTextKt$HttpPlainText$2$1(this.$acceptCharsetHeader, this.$requestCharset, interfaceC4356);
        httpPlainTextKt$HttpPlainText$2$1.L$0 = c8139;
        httpPlainTextKt$HttpPlainText$2$1.L$1 = obj;
        return httpPlainTextKt$HttpPlainText$2$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8124 c8124M11413;
        Charset charsetM10050;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C8139 c8139 = (C8139) this.L$0;
        Object obj2 = this.L$1;
        String str = this.$acceptCharsetHeader;
        InterfaceC9156 interfaceC9156 = AbstractC3930.f12138;
        C8115 c8115 = c8139.f22460;
        C8100 c8100 = c8139.f22462;
        String[] strArr = AbstractC8114.f22415;
        if (c8115.m2403("Accept-Charset") == null) {
            AbstractC3930.f12138.trace("Adding Accept-Charset=" + str + " to " + c8100);
            C8115 c81152 = c8139.f22460;
            c81152.getClass();
            str.getClass();
            c81152.mo2402(str);
            List listM2404 = c81152.m2404("Accept-Charset");
            listM2404.clear();
            listM2404.add(str);
        }
        if (!(obj2 instanceof String) || ((c8124M11413 = AbstractC6087.m11413(c8139)) != null && !AbstractC4394.m8917(c8124M11413.f22428, AbstractC8105.f22392.f22428))) {
            return null;
        }
        Charset charset = this.$requestCharset;
        String str2 = (String) obj2;
        C8124 c8124 = c8124M11413 == null ? AbstractC8105.f22392 : c8124M11413;
        if (c8124M11413 != null && (charsetM10050 = AbstractC5061.m10050(c8124M11413)) != null) {
            charset = charsetM10050;
        }
        AbstractC3930.f12138.trace("Sending request body to " + c8100 + " as text/plain with charset " + charset);
        return new C3982(str2, AbstractC5061.m10013(c8124, charset), null);
    }
}
