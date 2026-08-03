package p000;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: dg */
/* JADX INFO: loaded from: classes.dex */
public final class C1326dg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4801a;

    /* JADX INFO: renamed from: b */
    public final C2220m6 f4802b;

    public /* synthetic */ C1326dg(C2220m6 c2220m6, int i) {
        this.f4801a = i;
        this.f4802b = c2220m6;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2582a(String str) throws GeneralSecurityException {
        switch (this.f4801a) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 2; i++) {
                    Provider provider = Security.getProvider(strArr[i]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                Iterator it = arrayList.iterator();
                Exception exc = null;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C2220m6 c2220m6 = this.f4802b;
                    if (!zHasNext) {
                        return c2220m6.m4470h(str, null);
                    }
                    try {
                        return c2220m6.m4470h(str, (Provider) it.next());
                    } catch (Exception e) {
                        if (exc == null) {
                            exc = e;
                        }
                    }
                }
                break;
            case 1:
                return this.f4802b.m4470h(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < 3; i2++) {
                    Provider provider2 = Security.getProvider(strArr2[i2]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                Exception exc2 = null;
                while (it2.hasNext()) {
                    try {
                        return this.f4802b.m4470h(str, (Provider) it2.next());
                    } catch (Exception e2) {
                        if (exc2 == null) {
                            exc2 = e2;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc2);
        }
    }
}
