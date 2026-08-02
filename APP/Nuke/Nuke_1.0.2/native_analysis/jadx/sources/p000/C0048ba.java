package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: ba */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0048ba implements l43 {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f750a;

    /* JADX INFO: renamed from: b */
    public final Method f751b;

    public C0048ba(X509TrustManager x509TrustManager, Method method) {
        this.f750a = x509TrustManager;
        this.f751b = method;
    }

    @Override // p000.l43
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo504a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f751b.invoke(this.f750a, x509Certificate);
            objInvoke.getClass();
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0048ba)) {
            return false;
        }
        C0048ba c0048ba = (C0048ba) obj;
        return this.f750a.equals(c0048ba.f750a) && this.f751b.equals(c0048ba.f751b);
    }

    public final int hashCode() {
        return this.f751b.hashCode() + (this.f750a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f750a + ", findByIssuerAndSignatureMethod=" + this.f751b + ')';
    }
}
