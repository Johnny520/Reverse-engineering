package p023;

import androidx.compose.foundation.lazy.layout.C1575;
import java.io.Closeable;
import okhttp3.Protocol;
import p020.InterfaceC6929;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6960 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC6950 f17103;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C1575 f17104;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long f17105;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f17106;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6960 f17107;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6960 f17108;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f17109;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6979 f17110;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f17111;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC6929 f17112;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6960 f17113;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C6980 f17114;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6957 f17115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Protocol f17116;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6954 f17118;

    public C6960(C6954 c6954, Protocol protocol, String str, int i, C6979 c6979, C6980 c6980, AbstractC6957 abstractC6957, InterfaceC6929 interfaceC6929, C6960 c6960, C6960 c69602, C6960 c69603, long j, long j2, C1575 c1575, InterfaceC6950 interfaceC6950) {
        c6954.getClass();
        protocol.getClass();
        str.getClass();
        abstractC6957.getClass();
        interfaceC6950.getClass();
        this.f17118 = c6954;
        this.f17116 = protocol;
        this.f17117 = str;
        this.f17111 = i;
        this.f17110 = c6979;
        this.f17114 = c6980;
        this.f17115 = abstractC6957;
        this.f17112 = interfaceC6929;
        this.f17113 = c6960;
        this.f17108 = c69602;
        this.f17107 = c69603;
        this.f17106 = j;
        this.f17105 = j2;
        this.f17104 = c1575;
        this.f17103 = interfaceC6950;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.f17109 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17115.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f17116 + ", code=" + this.f17111 + ", message=" + this.f17117 + ", url=" + this.f17118.f17061 + '}';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6961 m12079() {
        C6961 c6961 = new C6961();
        c6961.f17122 = -1;
        c6961.f17129 = AbstractC6957.f17094;
        c6961.f17127 = InterfaceC6950.f17048;
        c6961.f17124 = this.f17118;
        c6961.f17123 = this.f17116;
        c6961.f17122 = this.f17111;
        c6961.f17121 = this.f17117;
        c6961.f17120 = this.f17110;
        c6961.f17119 = this.f17114.m12108();
        c6961.f17129 = this.f17115;
        c6961.f17128 = this.f17112;
        c6961.f17132 = this.f17113;
        c6961.f17133 = this.f17108;
        c6961.f17130 = this.f17107;
        c6961.f17131 = this.f17106;
        c6961.f17126 = this.f17105;
        c6961.f17125 = this.f17104;
        c6961.f17127 = this.f17103;
        return c6961;
    }
}
