package p173h4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p117X2.AbstractC1665j;
import p196l4.InterfaceC2515d;

/* JADX INFO: renamed from: h4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2261b implements InterfaceC2515d {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f7400a;

    /* JADX INFO: renamed from: b */
    public final Method f7401b;

    public C2261b(X509TrustManager x509TrustManager, Method method) {
        this.f7400a = x509TrustManager;
        this.f7401b = method;
    }

    @Override // p196l4.InterfaceC2515d
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo4119a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f7401b.invoke(this.f7400a, x509Certificate);
            AbstractC1665j.m2983c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e5) {
            throw new AssertionError("unable to get issues and signature", e5);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2261b)) {
            return false;
        }
        C2261b c2261b = (C2261b) obj;
        return AbstractC1665j.m2981a(this.f7400a, c2261b.f7400a) && AbstractC1665j.m2981a(this.f7401b, c2261b.f7401b);
    }

    public final int hashCode() {
        return this.f7401b.hashCode() + (this.f7400a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f7400a + ", findByIssuerAndSignatureMethod=" + this.f7401b + ')';
    }
}
