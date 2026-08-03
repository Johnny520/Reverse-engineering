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

    public /* synthetic */ C1326dg(C2220m6 r1, int r2) {
        this.f4801a = r2;
        this.f4802b = r1;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2582a(String r6) {
        switch(this.f4801a) {
            case 0: goto L24;
            case 1: goto L23;
            default: goto L4;
        };
    L4:
        String[] r0 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList r1 = new ArrayList();
        int r2 = 0;
    L6:
        if (r2 >= 3) goto L11;
        Provider r3 = Security.getProvider(r0[r2]);
        if (r3 == null) goto L10;
        r1.add(r3);
    L10:
        r2 = r2 + 1;
        goto L6
    L11:
        Iterator r02 = r1.iterator();
        Exception r12 = null;
    L13:
        if (r02.hasNext() == false) goto L21;
        return this.f4802b.m4470h(r6, (Provider) r02.next());
    L17:
        e = move-exception;
        if (r12 != null) goto L13;
        r12 = e;
        goto L13
    L21:
        throw new GeneralSecurityException("No good Provider found.", r12);
    L24:
        String[] r03 = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList r13 = new ArrayList();
        int r22 = 0;
    L26:
        if (r22 >= 2) goto L31;
        Provider r32 = Security.getProvider(r03[r22]);
        if (r32 == null) goto L30;
        r13.add(r32);
    L30:
        r22 = r22 + 1;
        goto L26
    L31:
        Iterator r04 = r13.iterator();
        Exception r23 = null;
    L32:
        boolean r33 = r04.hasNext();
        C2220m6 r4 = this.f4802b;
        if (r33 == false) goto L41;
        return r4.m4470h(r6, (Provider) r04.next());
    L37:
        e = move-exception;
        if (r23 != null) goto L32;
        r23 = e;
        goto L32
    L41:
        return r4.m4470h(r6, null);
    L23:
        return this.f4802b.m4470h(r6, null);
    }
}
