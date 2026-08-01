package p007;

import java.util.LinkedHashMap;
import kotlin.text.AbstractC5139;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6138 implements InterfaceC6121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6138 f16808 = new C6138();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6138 f16807 = new C6138();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6153 m11525(C6138 c6138, String str) {
        C6153 c6153 = new C6153(str);
        C6153.f16904.put(str, c6153);
        return c6153;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public synchronized C6153 m11526(String str) {
        C6153 c6153;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = C6153.f16904;
            c6153 = (C6153) linkedHashMap.get(str);
            if (c6153 == null) {
                c6153 = (C6153) linkedHashMap.get(AbstractC5139.m10139(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : AbstractC5139.m10139(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (c6153 == null) {
                    c6153 = new C6153(str);
                }
                linkedHashMap.put(str, c6153);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c6153;
    }
}
