package p023;

import androidx.compose.foundation.lazy.layout.C1575;
import androidx.compose.p001ui.graphics.vector.C2397;
import io.ktor.util.C5043;
import okhttp3.Protocol;
import p020.InterfaceC6929;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6979 f17120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f17121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Protocol f17123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6954 f17124;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C1575 f17125;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public long f17126;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC6929 f17128;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C6960 f17130;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public long f17131;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C6960 f17132;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C6960 f17133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f17122 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AbstractC6957 f17129 = AbstractC6957.f17094;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public InterfaceC6950 f17127 = InterfaceC6950.f17048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2397 f17119 = new C2397(6, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12080(String str, C6960 c6960) {
        if (c6960 != null) {
            if (c6960.f17113 != null) {
                C6755.m11873(str.concat(".networkResponse != null"));
            } else if (c6960.f17108 != null) {
                C6755.m11873(str.concat(".cacheResponse != null"));
            } else {
                if (c6960.f17107 == null) {
                    return;
                }
                C6755.m11873(str.concat(".priorResponse != null"));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6960 m12081() {
        int i = this.f17122;
        if (i < 0) {
            C5043.m9171(this.f17122, "code < 0: ");
            return null;
        }
        C6954 c6954 = this.f17124;
        if (c6954 == null) {
            C6755.m11870("request == null");
            return null;
        }
        Protocol protocol = this.f17123;
        if (protocol == null) {
            C6755.m11870("protocol == null");
            return null;
        }
        String str = this.f17121;
        if (str != null) {
            return new C6960(c6954, protocol, str, i, this.f17120, this.f17119.m3398(), this.f17129, this.f17128, this.f17132, this.f17133, this.f17130, this.f17131, this.f17126, this.f17125, this.f17127);
        }
        C6755.m11870("message == null");
        return null;
    }
}
