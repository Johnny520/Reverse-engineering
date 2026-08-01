package p023;

import java.util.LinkedHashMap;
import kotlin.text.AbstractC5971;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6967 implements InterfaceC6950 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6967 f17153 = new C6967();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6967 f17152 = new C6967();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6982 m12084(C6967 c6967, String str) {
        C6982 c6982 = new C6982(str);
        C6982.f17249.put(str, c6982);
        return c6982;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public synchronized C6982 m12085(String str) {
        C6982 c6982;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = C6982.f17249;
            c6982 = (C6982) linkedHashMap.get(str);
            if (c6982 == null) {
                c6982 = (C6982) linkedHashMap.get(AbstractC5971.m10698(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : AbstractC5971.m10698(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (c6982 == null) {
                    c6982 = new C6982(str);
                }
                linkedHashMap.put(str, c6982);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c6982;
    }
}
