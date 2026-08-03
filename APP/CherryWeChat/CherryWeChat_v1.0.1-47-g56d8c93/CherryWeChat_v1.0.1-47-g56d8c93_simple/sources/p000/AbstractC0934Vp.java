package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: Vp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0934Vp {
    static {
        C2481s1[] r0 = {new C2481s1(8, InterfaceC0891Up.class)};
        HashMap r1 = new HashMap();
        C2481s1 r3 = r0[0];
        Class r4 = r3.f8716a;
        if (r1.containsKey(r4) == true) goto L11;
        r1.put(r4, r3);
        Class r02 = r0[0].f8716a;
        Collections.unmodifiableMap(r1);
        int r03 = C0726Qv.CONFIG_NAME_FIELD_NUMBER;
        m1794a();     // Catch: GeneralSecurityException -> L7
        return;
    L7:
        e = move-exception;
        throw new ExceptionInInitializerError(e);
    L11:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r4.getCanonicalName());
    }

    /* JADX INFO: renamed from: a */
    public static void m1794a() {
        AbstractC0640Ov.m1262h(C1063Yp.f3372c);
        AbstractC0640Ov.m1262h(C2403q9.f8421a);
        AbstractC0640Ov.m1260f(new C2567u1(), true);
        C0380It r0 = AbstractC0414Jk.f1386a;
        C2815zs r02 = C2815zs.f9535b;
        r02.m5453e(AbstractC0414Jk.f1386a);
        r02.m5452d(AbstractC0414Jk.f1387b);
        r02.m5451c(AbstractC0414Jk.f1388c);
        r02.m5450b(AbstractC0414Jk.f1389d);
        C2729xs r2 = C2729xs.f9326b;
        r2.m5295b(C2567u1.f8912f);
        if (AbstractC1489hB.m2848a() == false) goto L5;
        return;
    L5:
        AbstractC0640Ov.m1260f(new C2567u1(C2258n1.class, new C2481s1[]{new C2481s1(0, InterfaceC0891Up.class)}, 0), true);
        r02.m5453e(AbstractC2782z1.f9442a);
        r02.m5452d(AbstractC2782z1.f9443b);
        r02.m5451c(AbstractC2782z1.f9444c);
        r02.m5450b(AbstractC2782z1.f9445d);
        r2.m5295b(C2567u1.f8911e);
    }
}
