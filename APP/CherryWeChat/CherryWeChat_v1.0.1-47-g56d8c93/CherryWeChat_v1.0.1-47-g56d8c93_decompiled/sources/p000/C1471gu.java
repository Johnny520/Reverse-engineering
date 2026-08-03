package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: gu */
/* JADX INFO: loaded from: classes.dex */
public final class C1471gu extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0584Ni f5214a;

    public C1471gu(C0584Ni c0584Ni) {
        this.f5214a = c0584Ni;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C0584Ni c0584Ni = this.f5214a;
        try {
            C1369eg c1369eg = C1369eg.f4899c;
            Mac mac = (Mac) c1369eg.f4900a.m2582a((String) c0584Ni.f1894c);
            mac.init((SecretKeySpec) c0584Ni.f1895d);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
