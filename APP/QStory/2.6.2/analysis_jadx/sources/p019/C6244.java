package p019;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p003.InterfaceC6094;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6244 implements InterfaceC6094 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f17198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final X509TrustManager f17199;

    public C6244(X509TrustManager x509TrustManager, Method method) {
        this.f17199 = x509TrustManager;
        this.f17198 = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6244)) {
            return false;
        }
        C6244 c6244 = (C6244) obj;
        return this.f17199.equals(c6244.f17199) && this.f17198.equals(c6244.f17198);
    }

    public final int hashCode() {
        return this.f17198.hashCode() + (this.f17199.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f17199 + ", findByIssuerAndSignatureMethod=" + this.f17198 + ')';
    }

    @Override // p003.InterfaceC6094
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final X509Certificate mo11448(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f17198.invoke(this.f17199, x509Certificate);
            objInvoke.getClass();
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }
}
