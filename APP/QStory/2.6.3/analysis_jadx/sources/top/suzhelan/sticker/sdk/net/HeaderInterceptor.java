package top.suzhelan.sticker.sdk.net;

import android.util.Base64;
import androidx.compose.runtime.internal.C1245;
import java.nio.charset.Charset;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p007.C6125;
import p007.C6131;
import p007.InterfaceC6140;
import p007.InterfaceC6141;
import p012.C6221;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltop/suzhelan/sticker/sdk/net/HeaderInterceptor;", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世苏哲;", "chain", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;", "intercept", "(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世苏哲;)L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;", "online-sticker-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HeaderInterceptor implements InterfaceC6140 {
    @Override // p007.InterfaceC6140
    public C6131 intercept(InterfaceC6141 chain) {
        chain.getClass();
        C6221 c6221 = (C6221) chain;
        C6125 c6125 = c6221.f17144;
        String user_nickname = StickerSdkConfig.getUSER_NICKNAME();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = user_nickname.getBytes(charsetForName);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        C1245 c1245M11515 = c6125.m11515();
        c1245M11515.m2156("Uin", StickerSdkConfig.getUSER_UIN());
        strEncodeToString.getClass();
        c1245M11515.m2156("Nickname", strEncodeToString);
        return c6221.m11673(new C6125(c1245M11515));
    }
}
