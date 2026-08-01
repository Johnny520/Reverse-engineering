package p007;

import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.ui.graphics.vector.C1562;
import io.ktor.util.C4211;
import okhttp3.Protocol;
import p004.InterfaceC6100;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6132 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6150 f16775;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f16776;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Protocol f16778;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6125 f16779;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C0734 f16780;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public long f16781;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC6100 f16783;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C6131 f16785;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public long f16786;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C6131 f16787;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C6131 f16788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f16777 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AbstractC6128 f16784 = AbstractC6128.f16749;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public InterfaceC6121 f16782 = InterfaceC6121.f16703;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1562 f16774 = new C1562(6, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11521(String str, C6131 c6131) {
        if (c6131 != null) {
            if (c6131.f16768 != null) {
                C5925.m11314(str.concat(".networkResponse != null"));
            } else if (c6131.f16763 != null) {
                C5925.m11314(str.concat(".cacheResponse != null"));
            } else {
                if (c6131.f16762 == null) {
                    return;
                }
                C5925.m11314(str.concat(".priorResponse != null"));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6131 m11522() {
        int i = this.f16777;
        if (i < 0) {
            C4211.m8612(this.f16777, "code < 0: ");
            return null;
        }
        C6125 c6125 = this.f16779;
        if (c6125 == null) {
            C5925.m11311("request == null");
            return null;
        }
        Protocol protocol = this.f16778;
        if (protocol == null) {
            C5925.m11311("protocol == null");
            return null;
        }
        String str = this.f16776;
        if (str != null) {
            return new C6131(c6125, protocol, str, i, this.f16775, this.f16774.m2838(), this.f16784, this.f16783, this.f16787, this.f16788, this.f16785, this.f16786, this.f16781, this.f16780, this.f16782);
        }
        C5925.m11311("message == null");
        return null;
    }
}
