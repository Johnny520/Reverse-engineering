package p241;

import io.ktor.client.plugins.sse.C3903;
import io.ktor.client.plugins.sse.C3905;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.http.content.AbstractC3986;
import io.ktor.util.C4208;
import io.ktor.utils.io.InterfaceC4251;
import java.util.List;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;
import p236.AbstractC8105;
import p236.AbstractC8114;
import p236.C8096;
import p236.C8112;
import p236.C8116;
import p236.C8124;

/* JADX INFO: renamed from: 飘花落叶言楪兰世苏子哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8141 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3905 m13567(C8138 c8138, C8096 c8096, C8116 c8116, InterfaceC4251 interfaceC4251, AbstractC3986 abstractC3986, InterfaceC4359 interfaceC4359) throws BadContentTypeFormatException {
        C8124 c8124;
        c8138.getClass();
        interfaceC4251.getClass();
        interfaceC4359.getClass();
        String[] strArr = AbstractC8114.f22415;
        String strMo8366 = c8116.mo8366("Content-Type");
        if (strMo8366 != null) {
            C8124 c81242 = C8124.f22426;
            c8124 = C8112.m13553(strMo8366);
        } else {
            c8124 = null;
        }
        C4208 c4208 = AbstractC8137.f22450;
        if ((c8138.f22453 instanceof C3903) && c8096.equals(C8096.f22353)) {
            if (c8124 == null) {
                c8124 = null;
            } else if (!((List) c8124.f232).isEmpty()) {
                c8124 = new C8124(c8124.f22428, c8124.f22427);
            }
            if (AbstractC4394.m8917(c8124, AbstractC8105.f22391)) {
                return new C3905((C3903) abstractC3986, interfaceC4251, interfaceC4359);
            }
        }
        return null;
    }
}
