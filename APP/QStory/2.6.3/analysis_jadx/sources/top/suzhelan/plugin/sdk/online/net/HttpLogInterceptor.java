package top.suzhelan.plugin.sdk.online.net;

import android.util.Log;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p004.C6092;
import p004.InterfaceC6110;
import p007.AbstractC6133;
import p007.C6125;
import p007.C6131;
import p007.C6149;
import p007.InterfaceC6140;
import p007.InterfaceC6141;
import p012.C6221;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/net/HttpLogInterceptor;", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;", "request", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;", "response", "", "reqBody", "respBody", "Lkotlin/飘花落叶言子楪兰苏哲世;", "printLog", "(L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;)V", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世苏哲;", "chain", "intercept", "(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世苏哲;)L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HttpLogInterceptor implements InterfaceC6140 {
    private final void printLog(C6125 request, C6131 response, String reqBody, String respBody) {
        String str = String.format("请求成功：%s\nRequestBody:%s\nResponseBody:%s\n", Arrays.copyOf(new Object[]{request.f16716, reqBody, respBody}, 3));
        try {
            C6149 c6149 = request.f16716;
            JSONObject jSONObjectM6374 = InterfaceC2916.m6374(reqBody);
            JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.PrettyFormat;
            str = String.format("请求成功：%s\nRequestBody:%s\nResponseBody:%s\n", Arrays.copyOf(new Object[]{c6149, InterfaceC2916.m6372(jSONObjectM6374, jSONWriter$Feature), InterfaceC2916.m6372(InterfaceC2916.m6374(respBody), jSONWriter$Feature)}, 3));
        } catch (Exception unused) {
        }
        Log.d("[Plugin]请求日志", str);
    }

    @Override // p007.InterfaceC6140
    public C6131 intercept(InterfaceC6141 chain) throws EOFException {
        String strM11477;
        chain.getClass();
        C6221 c6221 = (C6221) chain;
        C6125 c6125 = c6221.f17144;
        AbstractC6133 abstractC6133 = c6125.f16713;
        if (abstractC6133 != null) {
            C6092 c6092 = new C6092();
            abstractC6133.mo11152(c6092);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            strM11477 = c6092.m11477(c6092.f16647, charset);
        } else {
            strM11477 = "";
        }
        C6131 c6131M11673 = c6221.m11673(c6125);
        InterfaceC6110 interfaceC6110Mo11167 = c6131M11673.f16770.mo11167();
        interfaceC6110Mo11167.mo11473(Long.MAX_VALUE);
        C6092 c6092Clone = interfaceC6110Mo11167.mo11476().clone();
        Charset charset2 = StandardCharsets.UTF_8;
        charset2.getClass();
        printLog(c6125, c6131M11673, strM11477, c6092Clone.m11477(c6092Clone.f16647, charset2));
        return c6131M11673;
    }
}
