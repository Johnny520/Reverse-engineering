package io.ktor.client.plugins.cookies;

import io.ktor.http.CookieEncoding;
import io.ktor.util.AbstractC5040;
import io.ktor.util.C5043;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p025.AbstractC7012;
import p068.InterfaceC7387;
import p074.AbstractC7684;
import p191.AbstractC8568;
import p252.AbstractC8940;
import p252.AbstractC8955;
import p252.AbstractC8956;
import p252.C8958;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class HttpCookiesKt$renderClientCookies$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public static final HttpCookiesKt$renderClientCookies$1 INSTANCE = new HttpCookiesKt$renderClientCookies$1();

    public HttpCookiesKt$renderClientCookies$1() {
        super(1, AbstractC8956.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
    }

    @Override // p068.InterfaceC7387
    public final String invoke(C8958 c8958) {
        c8958.getClass();
        Regex regex = AbstractC8956.f22774;
        StringBuilder sb = new StringBuilder();
        sb.append(c8958.f22781);
        sb.append(SignatureVisitor.INSTANCEOF);
        String strM12149 = c8958.f22780;
        CookieEncoding cookieEncoding = c8958.f22779;
        strM12149.getClass();
        cookieEncoding.getClass();
        int i = AbstractC8955.f22772[cookieEncoding.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (AbstractC5976.m10722(strM12149, '\"')) {
                    C6755.m11869("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
                    return null;
                }
                for (int i2 = 0; i2 < strM12149.length(); i2++) {
                    char cCharAt = strM12149.charAt(i2);
                    if (AbstractC8568.m13623(cCharAt) || AbstractC5227.m9464(cCharAt, 32) < 0 || AbstractC8956.f22773.contains(Character.valueOf(cCharAt))) {
                        strM12149 = AbstractC7012.m12149('\"', "\"", strM12149);
                        break;
                    }
                }
            } else if (i == 3) {
                int i3 = AbstractC5040.f13042;
                C6309 c6309 = new C6309();
                AbstractC7684.m12645(c6309, strM12149, 0, 14);
                strM12149 = AbstractC5040.m9150(AbstractC6310.m11188(c6309, -1));
            } else {
                if (i != 4) {
                    C5043.m9170();
                    return null;
                }
                strM12149 = AbstractC8940.m14135(strM12149, true);
            }
        }
        sb.append(strM12149);
        return sb.toString();
    }
}
