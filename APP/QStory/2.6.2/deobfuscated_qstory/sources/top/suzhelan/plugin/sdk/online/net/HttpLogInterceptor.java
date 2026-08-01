package top.suzhelan.plugin.sdk.online.net;

import android.util.Log;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p005.C6101;
import p005.InterfaceC6119;
import p015.AbstractC6206;
import p015.C6198;
import p015.C6204;
import p015.C6222;
import p015.InterfaceC6213;
import p015.InterfaceC6214;
import p021.C6259;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/net/HttpLogInterceptor;", "L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰世哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;", "request", "L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;", "response", "", "reqBody", "respBody", "Lkotlin/飘花落叶言子楪兰苏哲世;", "printLog", "(L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;)V", "L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰世苏哲;", "chain", "intercept", "(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰世苏哲;)L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HttpLogInterceptor implements InterfaceC6213 {
    private final void printLog(C6198 request, C6204 response, String reqBody, String respBody) {
        String str = String.format("请求成功：%s\nRequestBody:%s\nResponseBody:%s\n", Arrays.copyOf(new Object[]{request.f16955, reqBody, respBody}, 3));
        try {
            C6222 c6222 = request.f16955;
            JSONObject jSONObjectM6316 = InterfaceC2915.m6316(reqBody);
            JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.PrettyFormat;
            str = String.format("请求成功：%s\nRequestBody:%s\nResponseBody:%s\n", Arrays.copyOf(new Object[]{c6222, InterfaceC2915.m6314(jSONObjectM6316, jSONWriter$Feature), InterfaceC2915.m6314(InterfaceC2915.m6316(respBody), jSONWriter$Feature)}, 3));
        } catch (Exception unused) {
        }
        Log.d("[Plugin]请求日志", str);
    }

    @Override // p015.InterfaceC6213
    public C6204 intercept(InterfaceC6214 chain) throws EOFException {
        String strM11485;
        chain.getClass();
        C6259 c6259 = (C6259) chain;
        C6198 c6198 = c6259.f17230;
        AbstractC6206 abstractC6206 = c6198.f16952;
        if (abstractC6206 != null) {
            C6101 c6101 = new C6101();
            abstractC6206.mo11095(c6101);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            strM11485 = c6101.m11485(c6101.f16657, charset);
        } else {
            strM11485 = "";
        }
        C6204 c6204M11743 = c6259.m11743(c6198);
        InterfaceC6119 interfaceC6119Mo11110 = c6204M11743.f17009.mo11110();
        interfaceC6119Mo11110.mo11479(Long.MAX_VALUE);
        C6101 c6101Clone = interfaceC6119Mo11110.mo11482().clone();
        Charset charset2 = StandardCharsets.UTF_8;
        charset2.getClass();
        printLog(c6198, c6204M11743, strM11485, c6101Clone.m11485(c6101Clone.f16657, charset2));
        return c6204M11743;
    }
}
