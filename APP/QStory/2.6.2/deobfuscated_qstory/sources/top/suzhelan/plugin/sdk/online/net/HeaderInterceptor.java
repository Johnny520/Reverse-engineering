package top.suzhelan.plugin.sdk.online.net;

import android.util.Base64;
import androidx.compose.runtime.internal.C1245;
import java.nio.charset.Charset;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p015.C6198;
import p015.C6204;
import p015.InterfaceC6213;
import p015.InterfaceC6214;
import p021.C6259;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/net/HeaderInterceptor;", "L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰世哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰世苏哲;", "chain", "L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;", "intercept", "(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰世苏哲;)L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HeaderInterceptor implements InterfaceC6213 {
    @Override // p015.InterfaceC6213
    public C6204 intercept(InterfaceC6214 chain) {
        chain.getClass();
        C6259 c6259 = (C6259) chain;
        C6198 c6198 = c6259.f17230;
        String user_nickname = PluginSdkConfig.getUSER_NICKNAME();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = user_nickname.getBytes(charsetForName);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        C1245 c1245M11644 = c6198.m11644();
        c1245M11644.m2146("Uin", PluginSdkConfig.getUSER_UIN());
        strEncodeToString.getClass();
        c1245M11644.m2146("Nickname", strEncodeToString);
        return c6259.m11743(new C6198(c1245M11644));
    }
}
