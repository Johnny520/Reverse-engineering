package p033;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p018.InterfaceC6914;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7070 implements InterfaceC6914 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f17547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final X509TrustManager f17548;

    public C7070(X509TrustManager x509TrustManager, Method method) {
        this.f17548 = x509TrustManager;
        this.f17547 = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7070)) {
            return false;
        }
        C7070 c7070 = (C7070) obj;
        return this.f17548.equals(c7070.f17548) && this.f17547.equals(c7070.f17547);
    }

    public final int hashCode() {
        return this.f17547.hashCode() + (this.f17548.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f17548 + ", findByIssuerAndSignatureMethod=" + this.f17547 + ')';
    }

    @Override // p018.InterfaceC6914
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final X509Certificate mo11999(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f17547.invoke(this.f17548, x509Certificate);
            objInvoke.getClass();
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }
}
