package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC4819;
import io.ktor.http.content.C4815;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import p034.AbstractC7082;
import p050.AbstractC7176;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p252.AbstractC8935;
import p252.AbstractC8944;
import p252.C8930;
import p252.C8945;
import p252.C8954;
import p257.C8969;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", m556f = "HttpPlainText.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "", "content", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpPlainTextKt$HttpPlainText$2$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ String $acceptCharsetHeader;
    final /* synthetic */ Charset $requestCharset;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$1(String str, Charset charset, InterfaceC5189<? super HttpPlainTextKt$HttpPlainText$2$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$acceptCharsetHeader = str;
        this.$requestCharset = charset;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C8969 c8969, Object obj, InterfaceC5189<? super AbstractC4819> interfaceC5189) {
        HttpPlainTextKt$HttpPlainText$2$1 httpPlainTextKt$HttpPlainText$2$1 = new HttpPlainTextKt$HttpPlainText$2$1(this.$acceptCharsetHeader, this.$requestCharset, interfaceC5189);
        httpPlainTextKt$HttpPlainText$2$1.L$0 = c8969;
        httpPlainTextKt$HttpPlainText$2$1.L$1 = obj;
        return httpPlainTextKt$HttpPlainText$2$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8954 c8954M12468;
        Charset charsetM12300;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C8969 c8969 = (C8969) this.L$0;
        Object obj2 = this.L$1;
        String str = this.$acceptCharsetHeader;
        InterfaceC9970 interfaceC9970 = AbstractC4763.f12488;
        C8945 c8945 = c8969.f22803;
        C8930 c8930 = c8969.f22805;
        String[] strArr = AbstractC8944.f22758;
        if (c8945.m2973("Accept-Charset") == null) {
            AbstractC4763.f12488.trace("Adding Accept-Charset=" + str + " to " + c8930);
            C8945 c89452 = c8969.f22803;
            c89452.getClass();
            str.getClass();
            c89452.mo2972(str);
            List listM2974 = c89452.m2974("Accept-Charset");
            listM2974.clear();
            listM2974.add(str);
        }
        if (!(obj2 instanceof String) || ((c8954M12468 = AbstractC7176.m12468(c8969)) != null && !AbstractC5227.m9466(c8954M12468.f22771, AbstractC8935.f22735.f22771))) {
            return null;
        }
        Charset charset = this.$requestCharset;
        String str2 = (String) obj2;
        C8954 c8954 = c8954M12468 == null ? AbstractC8935.f22735 : c8954M12468;
        if (c8954M12468 != null && (charsetM12300 = AbstractC7082.m12300(c8954M12468)) != null) {
            charset = charsetM12300;
        }
        AbstractC4763.f12488.trace("Sending request body to " + c8930 + " as text/plain with charset " + charset);
        return new C4815(str2, AbstractC7082.m12295(c8954, charset), null);
    }
}
