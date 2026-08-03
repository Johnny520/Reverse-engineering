package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: gu */
/* JADX INFO: loaded from: classes.dex */
public final class C1471gu extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0584Ni f5214a;

    public C1471gu(C0584Ni r1) {
        this.f5214a = r1;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C0584Ni r0 = this.f5214a;
        C1369eg r1 = C1369eg.f4899c;     // Catch: GeneralSecurityException -> L5
        String r2 = (String) r0.f1894c;     // Catch: GeneralSecurityException -> L5
        Mac r12 = (Mac) r1.f4900a.m2582a(r2);     // Catch: GeneralSecurityException -> L5
        r12.init((SecretKeySpec) r0.f1895d);     // Catch: GeneralSecurityException -> L5
        return r12;
    L5:
        e = move-exception;
        throw new IllegalStateException(e);
    }
}
