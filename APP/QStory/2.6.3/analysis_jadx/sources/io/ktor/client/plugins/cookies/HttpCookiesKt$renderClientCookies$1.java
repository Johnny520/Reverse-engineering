package io.ktor.client.plugins.cookies;

import io.ktor.http.CookieEncoding;
import io.ktor.util.AbstractC4208;
import io.ktor.util.C4211;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.AbstractC5144;
import kotlin.text.Regex;
import kotlinx.io.AbstractC5478;
import kotlinx.io.C5477;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p009.AbstractC6183;
import p052.InterfaceC6558;
import p058.AbstractC6855;
import p175.AbstractC7739;
import p236.AbstractC8111;
import p236.AbstractC8126;
import p236.AbstractC8127;
import p236.C8129;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpCookiesKt$renderClientCookies$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public static final HttpCookiesKt$renderClientCookies$1 INSTANCE = new HttpCookiesKt$renderClientCookies$1();

    public HttpCookiesKt$renderClientCookies$1() {
        super(1, AbstractC8127.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
    }

    @Override // p052.InterfaceC6558
    public final String invoke(C8129 c8129) {
        c8129.getClass();
        Regex regex = AbstractC8127.f22429;
        StringBuilder sb = new StringBuilder();
        sb.append(c8129.f22436);
        sb.append(SignatureVisitor.INSTANCEOF);
        String strM11590 = c8129.f22435;
        CookieEncoding cookieEncoding = c8129.f22434;
        strM11590.getClass();
        cookieEncoding.getClass();
        int i = AbstractC8126.f22427[cookieEncoding.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (AbstractC5144.m10163(strM11590, '\"')) {
                    C5925.m11310("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
                    return null;
                }
                for (int i2 = 0; i2 < strM11590.length(); i2++) {
                    char cCharAt = strM11590.charAt(i2);
                    if (AbstractC7739.m13064(cCharAt) || AbstractC4395.m8905(cCharAt, 32) < 0 || AbstractC8127.f22428.contains(Character.valueOf(cCharAt))) {
                        strM11590 = AbstractC6183.m11590('\"', "\"", strM11590);
                        break;
                    }
                }
            } else if (i == 3) {
                int i3 = AbstractC4208.f12697;
                C5477 c5477 = new C5477();
                AbstractC6855.m12086(c5477, strM11590, 0, 14);
                strM11590 = AbstractC4208.m8591(AbstractC5478.m10629(c5477, -1));
            } else {
                if (i != 4) {
                    C4211.m8611();
                    return null;
                }
                strM11590 = AbstractC8111.m13576(strM11590, true);
            }
        }
        sb.append(strM11590);
        return sb.toString();
    }
}
