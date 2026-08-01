package p015;

import java.util.LinkedHashMap;
import kotlin.text.AbstractC5138;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6211 implements InterfaceC6194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6211 f17047 = new C6211();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6211 f17046 = new C6211();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6226 m11654(C6211 c6211, String str) {
        C6226 c6226 = new C6226(str);
        C6226.f17143.put(str, c6226);
        return c6226;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public synchronized C6226 m11655(String str) {
        C6226 c6226;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = C6226.f17143;
            c6226 = (C6226) linkedHashMap.get(str);
            if (c6226 == null) {
                c6226 = (C6226) linkedHashMap.get(AbstractC5138.m10125(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : AbstractC5138.m10125(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (c6226 == null) {
                    c6226 = new C6226(str);
                }
                linkedHashMap.put(str, c6226);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c6226;
    }
}
