package p015;

import androidx.activity.AbstractC0053;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC4394;
import p004.AbstractC6098;
import p007.AbstractC6136;
import p017.AbstractC6234;
import p017.AbstractC6238;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6212 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6211 f17048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6208 f17049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HostnameVerifier f17050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SSLSocketFactory f17051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SocketFactory f17052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6228 f17053;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6222 f17054;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ProxySelector f17055;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f17056;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final List f17057;

    public C6212(String str, int i, InterfaceC6228 interfaceC6228, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C6208 c6208, C6211 c6211, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        interfaceC6228.getClass();
        socketFactory.getClass();
        c6211.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.f17053 = interfaceC6228;
        this.f17052 = socketFactory;
        this.f17051 = sSLSocketFactory;
        this.f17050 = hostnameVerifier;
        this.f17049 = c6208;
        this.f17048 = c6211;
        this.f17055 = proxySelector;
        C6221 c6221 = new C6221(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c6221.f17112 = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                C5919.m11249("unexpected scheme: ".concat(str2));
                throw null;
            }
            c6221.f17112 = "https";
        }
        String strM11699 = AbstractC6234.m11699(AbstractC6098.m11452(0, 0, str, 7));
        if (strM11699 == null) {
            C5919.m11249("unexpected host: ".concat(str));
            throw null;
        }
        c6221.f17109 = strM11699;
        if (1 > i || i >= 65536) {
            C5919.m11253(AbstractC6136.m11556(i, "unexpected port: "));
            throw null;
        }
        c6221.f17113 = i;
        this.f17054 = c6221.m11664();
        this.f17056 = AbstractC6238.m11711(list);
        this.f17057 = AbstractC6238.m11711(list2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6212)) {
            return false;
        }
        C6212 c6212 = (C6212) obj;
        return AbstractC4394.m8917(this.f17054, c6212.f17054) && m11656(c6212);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17049) + ((Objects.hashCode(this.f17050) + ((Objects.hashCode(this.f17051) + ((this.f17055.hashCode() + AbstractC0053.m159(this.f17057, AbstractC0053.m159(this.f17056, (this.f17048.hashCode() + ((this.f17053.hashCode() + AbstractC6136.m11539(527, 31, this.f17054.f17126)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C6222 c6222 = this.f17054;
        sb.append(c6222.f17120);
        sb.append(':');
        sb.append(c6222.f17119);
        sb.append(", ");
        sb.append("proxySelector=" + this.f17055);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m11656(C6212 c6212) {
        c6212.getClass();
        return AbstractC4394.m8917(this.f17053, c6212.f17053) && AbstractC4394.m8917(this.f17048, c6212.f17048) && AbstractC4394.m8917(this.f17056, c6212.f17056) && AbstractC4394.m8917(this.f17057, c6212.f17057) && AbstractC4394.m8917(this.f17055, c6212.f17055) && AbstractC4394.m8917(this.f17051, c6212.f17051) && AbstractC4394.m8917(this.f17050, c6212.f17050) && AbstractC4394.m8917(this.f17049, c6212.f17049) && this.f17054.f17119 == c6212.f17054.f17119;
    }
}
