package p023;

import androidx.activity.AbstractC0900;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC5227;
import p019.AbstractC6918;
import p025.AbstractC7012;
import p029.AbstractC7055;
import p029.AbstractC7059;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6967 f17154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6964 f17155;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HostnameVerifier f17156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SSLSocketFactory f17157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SocketFactory f17158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6984 f17159;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6978 f17160;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ProxySelector f17161;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f17162;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final List f17163;

    public C6968(String str, int i, InterfaceC6984 interfaceC6984, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C6964 c6964, C6967 c6967, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        interfaceC6984.getClass();
        socketFactory.getClass();
        c6967.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.f17159 = interfaceC6984;
        this.f17158 = socketFactory;
        this.f17157 = sSLSocketFactory;
        this.f17156 = hostnameVerifier;
        this.f17155 = c6964;
        this.f17154 = c6967;
        this.f17161 = proxySelector;
        C6977 c6977 = new C6977(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c6977.f17218 = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                C6755.m11869("unexpected scheme: ".concat(str2));
                throw null;
            }
            c6977.f17218 = "https";
        }
        String strM12248 = AbstractC7055.m12248(AbstractC6918.m12004(0, 0, str, 7));
        if (strM12248 == null) {
            C6755.m11869("unexpected host: ".concat(str));
            throw null;
        }
        c6977.f17215 = strM12248;
        if (1 > i || i >= 65536) {
            C6755.m11873(AbstractC7012.m12147(i, "unexpected port: "));
            throw null;
        }
        c6977.f17219 = i;
        this.f17160 = c6977.m12094();
        this.f17162 = AbstractC7059.m12262(list);
        this.f17163 = AbstractC7059.m12262(list2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6968)) {
            return false;
        }
        C6968 c6968 = (C6968) obj;
        return AbstractC5227.m9466(this.f17160, c6968.f17160) && m12086(c6968);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17155) + ((Objects.hashCode(this.f17156) + ((Objects.hashCode(this.f17157) + ((this.f17161.hashCode() + AbstractC0900.m720(this.f17163, AbstractC0900.m720(this.f17162, (this.f17154.hashCode() + ((this.f17159.hashCode() + AbstractC7012.m12131(527, 31, this.f17160.f17232)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C6978 c6978 = this.f17160;
        sb.append(c6978.f17226);
        sb.append(':');
        sb.append(c6978.f17225);
        sb.append(", ");
        sb.append("proxySelector=" + this.f17161);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12086(C6968 c6968) {
        c6968.getClass();
        return AbstractC5227.m9466(this.f17159, c6968.f17159) && AbstractC5227.m9466(this.f17154, c6968.f17154) && AbstractC5227.m9466(this.f17162, c6968.f17162) && AbstractC5227.m9466(this.f17163, c6968.f17163) && AbstractC5227.m9466(this.f17161, c6968.f17161) && AbstractC5227.m9466(this.f17157, c6968.f17157) && AbstractC5227.m9466(this.f17156, c6968.f17156) && AbstractC5227.m9466(this.f17155, c6968.f17155) && this.f17160.f17225 == c6968.f17160.f17225;
    }
}
