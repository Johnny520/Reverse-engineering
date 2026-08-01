package io.ktor.client.plugins.cookies;

import com.bumptech.glide.AbstractC3056;
import io.ktor.http.CookieEncoding;
import io.ktor.util.AbstractC4207;
import io.ktor.util.C4210;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.AbstractC5143;
import kotlin.text.Regex;
import kotlinx.io.AbstractC5477;
import kotlinx.io.C5476;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p007.AbstractC6136;
import p052.InterfaceC6557;
import p058.AbstractC6854;
import p236.AbstractC8110;
import p236.AbstractC8125;
import p236.AbstractC8126;
import p236.C8128;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpCookiesKt$renderClientCookies$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public static final HttpCookiesKt$renderClientCookies$1 INSTANCE = new HttpCookiesKt$renderClientCookies$1();

    public HttpCookiesKt$renderClientCookies$1() {
        super(1, AbstractC8126.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
    }

    @Override // p052.InterfaceC6557
    public final String invoke(C8128 c8128) {
        c8128.getClass();
        Regex regex = AbstractC8126.f22431;
        StringBuilder sb = new StringBuilder();
        sb.append(c8128.f22438);
        sb.append(SignatureVisitor.INSTANCEOF);
        String strM11558 = c8128.f22437;
        CookieEncoding cookieEncoding = c8128.f22436;
        strM11558.getClass();
        cookieEncoding.getClass();
        int i = AbstractC8125.f22429[cookieEncoding.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (AbstractC5143.m10172(strM11558, '\"')) {
                    C5919.m11249("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
                    return null;
                }
                for (int i2 = 0; i2 < strM11558.length(); i2++) {
                    char cCharAt = strM11558.charAt(i2);
                    if (AbstractC3056.m6673(cCharAt) || AbstractC4394.m8915(cCharAt, 32) < 0 || AbstractC8126.f22430.contains(Character.valueOf(cCharAt))) {
                        strM11558 = AbstractC6136.m11558('\"', "\"", strM11558);
                        break;
                    }
                }
            } else if (i == 3) {
                int i3 = AbstractC4207.f12693;
                C5476 c5476 = new C5476();
                AbstractC6854.m12058(c5476, strM11558, 0, 14);
                strM11558 = AbstractC4207.m8601(AbstractC5477.m10625(c5476, -1));
            } else {
                if (i != 4) {
                    C4210.m8621();
                    return null;
                }
                strM11558 = AbstractC8110.m13547(strM11558, true);
            }
        }
        sb.append(strM11558);
        return sb.toString();
    }
}
