package top.suzhelan.sticker.sdk.net;

import android.util.Base64;
import androidx.compose.runtime.internal.C2080;
import java.nio.charset.Charset;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p023.C6954;
import p023.C6960;
import p023.InterfaceC6969;
import p023.InterfaceC6970;
import p028.C7050;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m151d2 = {"Ltop/suzhelan/sticker/sdk/net/HeaderInterceptor;", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世苏哲;", "chain", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;", "intercept", "(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰世苏哲;)L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏哲楪兰;", "online-sticker-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class HeaderInterceptor implements InterfaceC6969 {
    @Override // p023.InterfaceC6969
    public C6960 intercept(InterfaceC6970 chain) {
        chain.getClass();
        C7050 c7050 = (C7050) chain;
        C6954 c6954 = c7050.f17489;
        String user_nickname = StickerSdkConfig.getUSER_NICKNAME();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = user_nickname.getBytes(charsetForName);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        C2080 c2080M12074 = c6954.m12074();
        c2080M12074.m2716("Uin", StickerSdkConfig.getUSER_UIN());
        strEncodeToString.getClass();
        c2080M12074.m2716("Nickname", strEncodeToString);
        return c7050.m12232(new C6954(c2080M12074));
    }
}
