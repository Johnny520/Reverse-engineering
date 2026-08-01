package p007;

import androidx.activity.AbstractC0053;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC4395;
import p003.AbstractC6089;
import p009.AbstractC6183;
import p013.AbstractC6226;
import p013.AbstractC6230;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6138 f16809;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6135 f16810;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HostnameVerifier f16811;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SSLSocketFactory f16812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SocketFactory f16813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6155 f16814;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6149 f16815;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ProxySelector f16816;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f16817;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final List f16818;

    public C6139(String str, int i, InterfaceC6155 interfaceC6155, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C6135 c6135, C6138 c6138, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        interfaceC6155.getClass();
        socketFactory.getClass();
        c6138.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.f16814 = interfaceC6155;
        this.f16813 = socketFactory;
        this.f16812 = sSLSocketFactory;
        this.f16811 = hostnameVerifier;
        this.f16810 = c6135;
        this.f16809 = c6138;
        this.f16816 = proxySelector;
        C6148 c6148 = new C6148(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c6148.f16873 = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                C5925.m11310("unexpected scheme: ".concat(str2));
                throw null;
            }
            c6148.f16873 = "https";
        }
        String strM11689 = AbstractC6226.m11689(AbstractC6089.m11445(0, 0, str, 7));
        if (strM11689 == null) {
            C5925.m11310("unexpected host: ".concat(str));
            throw null;
        }
        c6148.f16870 = strM11689;
        if (1 > i || i >= 65536) {
            C5925.m11314(AbstractC6183.m11588(i, "unexpected port: "));
            throw null;
        }
        c6148.f16874 = i;
        this.f16815 = c6148.m11535();
        this.f16817 = AbstractC6230.m11703(list);
        this.f16818 = AbstractC6230.m11703(list2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6139)) {
            return false;
        }
        C6139 c6139 = (C6139) obj;
        return AbstractC4395.m8907(this.f16815, c6139.f16815) && m11527(c6139);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f16810) + ((Objects.hashCode(this.f16811) + ((Objects.hashCode(this.f16812) + ((this.f16816.hashCode() + AbstractC0053.m160(this.f16818, AbstractC0053.m160(this.f16817, (this.f16809.hashCode() + ((this.f16814.hashCode() + AbstractC6183.m11572(527, 31, this.f16815.f16887)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C6149 c6149 = this.f16815;
        sb.append(c6149.f16881);
        sb.append(':');
        sb.append(c6149.f16880);
        sb.append(", ");
        sb.append("proxySelector=" + this.f16816);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m11527(C6139 c6139) {
        c6139.getClass();
        return AbstractC4395.m8907(this.f16814, c6139.f16814) && AbstractC4395.m8907(this.f16809, c6139.f16809) && AbstractC4395.m8907(this.f16817, c6139.f16817) && AbstractC4395.m8907(this.f16818, c6139.f16818) && AbstractC4395.m8907(this.f16816, c6139.f16816) && AbstractC4395.m8907(this.f16812, c6139.f16812) && AbstractC4395.m8907(this.f16811, c6139.f16811) && AbstractC4395.m8907(this.f16810, c6139.f16810) && this.f16815.f16880 == c6139.f16815.f16880;
    }
}
