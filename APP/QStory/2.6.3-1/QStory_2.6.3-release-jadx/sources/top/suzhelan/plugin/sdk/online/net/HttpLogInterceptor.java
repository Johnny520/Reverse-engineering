package top.suzhelan.plugin.sdk.online.net;

import android.util.Log;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p020.C6921;
import p020.InterfaceC6939;
import p023.AbstractC6962;
import p023.C6954;
import p023.C6960;
import p023.C6978;
import p023.InterfaceC6969;
import p023.InterfaceC6970;
import p028.C7050;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m151d2 = {"Ltop/suzhelan/plugin/sdk/online/net/HttpLogInterceptor;", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;", "request", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;", "response", "", "reqBody", "respBody", "Lkotlin/飘花落叶言子楪兰苏哲世;", "printLog", "(L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪哲苏兰;L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;Ljava/lang/String;Ljava/lang/String;)V", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世苏哲;", "chain", "intercept", "(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世苏哲;)L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;", "online-plugin-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class HttpLogInterceptor implements InterfaceC6969 {
    private final void printLog(C6954 request, C6960 response, String reqBody, String respBody) {
        String str = String.format("请求成功：%s\nRequestBody:%s\nResponseBody:%s\n", Arrays.copyOf(new Object[]{request.f17061, reqBody, respBody}, 3));
        try {
            C6978 c6978 = request.f17061;
            JSONObject jSONObjectM6934 = InterfaceC3749.m6934(reqBody);
            JSONWriter$Feature jSONWriter$Feature = JSONWriter$Feature.PrettyFormat;
            str = String.format("请求成功：%s\nRequestBody:%s\nResponseBody:%s\n", Arrays.copyOf(new Object[]{c6978, InterfaceC3749.m6932(jSONObjectM6934, jSONWriter$Feature), InterfaceC3749.m6932(InterfaceC3749.m6934(respBody), jSONWriter$Feature)}, 3));
        } catch (Exception unused) {
        }
        Log.d("[Plugin]请求日志", str);
    }

    @Override // p023.InterfaceC6969
    public C6960 intercept(InterfaceC6970 chain) throws EOFException {
        String strM12036;
        chain.getClass();
        C7050 c7050 = (C7050) chain;
        C6954 c6954 = c7050.f17489;
        AbstractC6962 abstractC6962 = c6954.f17058;
        if (abstractC6962 != null) {
            C6921 c6921 = new C6921();
            abstractC6962.mo11711(c6921);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            strM12036 = c6921.m12036(c6921.f16992, charset);
        } else {
            strM12036 = "";
        }
        C6960 c6960M12232 = c7050.m12232(c6954);
        InterfaceC6939 interfaceC6939Mo11726 = c6960M12232.f17115.mo11726();
        interfaceC6939Mo11726.mo12032(Long.MAX_VALUE);
        C6921 c6921Clone = interfaceC6939Mo11726.mo12035().clone();
        Charset charset2 = StandardCharsets.UTF_8;
        charset2.getClass();
        printLog(c6954, c6960M12232, strM12036, c6921Clone.m12036(c6921Clone.f16992, charset2));
        return c6960M12232;
    }
}
