package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC3987;
import io.ktor.http.content.C3983;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import p018.AbstractC6253;
import p034.AbstractC6347;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p236.AbstractC8106;
import p236.AbstractC8115;
import p236.C8101;
import p236.C8116;
import p236.C8125;
import p241.C8140;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", f = "HttpPlainText.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "", "content", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;"}, k = 3, mv = {2, 0, 0})
final class HttpPlainTextKt$HttpPlainText$2$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ String $acceptCharsetHeader;
    final /* synthetic */ Charset $requestCharset;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$1(String str, Charset charset, InterfaceC4357<? super HttpPlainTextKt$HttpPlainText$2$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$acceptCharsetHeader = str;
        this.$requestCharset = charset;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C8140 c8140, Object obj, InterfaceC4357<? super AbstractC3987> interfaceC4357) {
        HttpPlainTextKt$HttpPlainText$2$1 httpPlainTextKt$HttpPlainText$2$1 = new HttpPlainTextKt$HttpPlainText$2$1(this.$acceptCharsetHeader, this.$requestCharset, interfaceC4357);
        httpPlainTextKt$HttpPlainText$2$1.L$0 = c8140;
        httpPlainTextKt$HttpPlainText$2$1.L$1 = obj;
        return httpPlainTextKt$HttpPlainText$2$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8125 c8125M11909;
        Charset charsetM11741;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C8140 c8140 = (C8140) this.L$0;
        Object obj2 = this.L$1;
        String str = this.$acceptCharsetHeader;
        InterfaceC9141 interfaceC9141 = AbstractC3931.f12143;
        C8116 c8116 = c8140.f22458;
        C8101 c8101 = c8140.f22460;
        String[] strArr = AbstractC8115.f22413;
        if (c8116.m2413("Accept-Charset") == null) {
            AbstractC3931.f12143.trace("Adding Accept-Charset=" + str + " to " + c8101);
            C8116 c81162 = c8140.f22458;
            c81162.getClass();
            str.getClass();
            c81162.mo2412(str);
            List listM2414 = c81162.m2414("Accept-Charset");
            listM2414.clear();
            listM2414.add(str);
        }
        if (!(obj2 instanceof String) || ((c8125M11909 = AbstractC6347.m11909(c8140)) != null && !AbstractC4395.m8907(c8125M11909.f22426, AbstractC8106.f22390.f22426))) {
            return null;
        }
        Charset charset = this.$requestCharset;
        String str2 = (String) obj2;
        C8125 c8125 = c8125M11909 == null ? AbstractC8106.f22390 : c8125M11909;
        if (c8125M11909 != null && (charsetM11741 = AbstractC6253.m11741(c8125M11909)) != null) {
            charset = charsetM11741;
        }
        AbstractC3931.f12143.trace("Sending request body to " + c8101 + " as text/plain with charset " + charset);
        return new C3983(str2, AbstractC6253.m11736(c8125, charset), null);
    }
}
