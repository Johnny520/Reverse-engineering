package p017;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p002.InterfaceC6085;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6241 implements InterfaceC6085 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f17202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final X509TrustManager f17203;

    public C6241(X509TrustManager x509TrustManager, Method method) {
        this.f17203 = x509TrustManager;
        this.f17202 = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6241)) {
            return false;
        }
        C6241 c6241 = (C6241) obj;
        return this.f17203.equals(c6241.f17203) && this.f17202.equals(c6241.f17202);
    }

    public final int hashCode() {
        return this.f17202.hashCode() + (this.f17203.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f17203 + ", findByIssuerAndSignatureMethod=" + this.f17202 + ')';
    }

    @Override // p002.InterfaceC6085
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final X509Certificate mo11440(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f17202.invoke(this.f17203, x509Certificate);
            objInvoke.getClass();
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }
}
