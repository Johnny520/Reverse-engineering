package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 {
    public final na0 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final cq e;
    public final gd3 f;
    public final Proxy g;
    public final ProxySelector h;
    public final yw0 i;
    public final List j;
    public final List k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q5(String str, int i, na0 na0Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, cq cqVar, gd3 gd3Var, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        na0Var.getClass();
        socketFactory.getClass();
        gd3Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = na0Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = cqVar;
        this.f = gd3Var;
        this.g = proxy;
        this.h = proxySelector;
        xw0 xw0Var = new xw0();
        xw0Var.g(sSLSocketFactory != null ? "https" : "http");
        xw0Var.d(str);
        if (1 > i || i >= 65536) {
            s.c(vi0.g("unexpected port: ", i));
            throw null;
        }
        xw0Var.e = i;
        this.i = xw0Var.b();
        this.j = wg3.i(list);
        this.k = wg3.i(list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(q5 q5Var) {
        q5Var.getClass();
        return t11.l(this.a, q5Var.a) && t11.l(this.f, q5Var.f) && t11.l(this.j, q5Var.j) && t11.l(this.k, q5Var.k) && t11.l(this.h, q5Var.h) && t11.l(this.g, q5Var.g) && t11.l(this.c, q5Var.c) && t11.l(this.d, q5Var.d) && t11.l(this.e, q5Var.e) && this.i.e == q5Var.i.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return t11.l(this.i, q5Var.i) && a(q5Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + hk1.f(this.i.i, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        yw0 yw0Var = this.i;
        sb.append(yw0Var.d);
        sb.append(':');
        sb.append(yw0Var.e);
        sb.append(", ");
        Proxy proxy = this.g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.h;
        }
        return hk1.i(sb, str, '}');
    }
}
