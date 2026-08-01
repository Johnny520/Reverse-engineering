package p015;

import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.ui.graphics.vector.C1562;
import io.ktor.util.C4210;
import okhttp3.Protocol;
import p005.InterfaceC6109;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6205 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6223 f17014;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f17015;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Protocol f17017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6198 f17018;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C0734 f17019;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public long f17020;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC6109 f17022;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C6204 f17024;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public long f17025;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C6204 f17026;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C6204 f17027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f17016 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AbstractC6201 f17023 = AbstractC6201.f16988;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public InterfaceC6194 f17021 = InterfaceC6194.f16942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1562 f17013 = new C1562(6, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11650(String str, C6204 c6204) {
        if (c6204 != null) {
            if (c6204.f17007 != null) {
                C5919.m11253(str.concat(".networkResponse != null"));
            } else if (c6204.f17002 != null) {
                C5919.m11253(str.concat(".cacheResponse != null"));
            } else {
                if (c6204.f17001 == null) {
                    return;
                }
                C5919.m11253(str.concat(".priorResponse != null"));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6204 m11651() {
        int i = this.f17016;
        if (i < 0) {
            C4210.m8622(this.f17016, "code < 0: ");
            return null;
        }
        C6198 c6198 = this.f17018;
        if (c6198 == null) {
            C5919.m11250("request == null");
            return null;
        }
        Protocol protocol = this.f17017;
        if (protocol == null) {
            C5919.m11250("protocol == null");
            return null;
        }
        String str = this.f17015;
        if (str != null) {
            return new C6204(c6198, protocol, str, i, this.f17014, this.f17013.m2828(), this.f17023, this.f17022, this.f17026, this.f17027, this.f17024, this.f17025, this.f17020, this.f17019, this.f17021);
        }
        C5919.m11250("message == null");
        return null;
    }
}
