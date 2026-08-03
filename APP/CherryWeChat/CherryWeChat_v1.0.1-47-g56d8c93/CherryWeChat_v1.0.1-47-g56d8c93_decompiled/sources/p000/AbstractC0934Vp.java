package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: Vp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0934Vp {
    static {
        C2481s1[] c2481s1Arr = {new C2481s1(8, InterfaceC0891Up.class)};
        HashMap map = new HashMap();
        C2481s1 c2481s1 = c2481s1Arr[0];
        Class cls = c2481s1.f8716a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
        }
        map.put(cls, c2481s1);
        Class cls2 = c2481s1Arr[0].f8716a;
        Collections.unmodifiableMap(map);
        int i = C0726Qv.CONFIG_NAME_FIELD_NUMBER;
        try {
            m1794a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1794a() {
        AbstractC0640Ov.m1262h(C1063Yp.f3372c);
        AbstractC0640Ov.m1262h(C2403q9.f8421a);
        AbstractC0640Ov.m1260f(new C2567u1(), true);
        C0380It c0380It = AbstractC0414Jk.f1386a;
        C2815zs c2815zs = C2815zs.f9535b;
        c2815zs.m5453e(AbstractC0414Jk.f1386a);
        c2815zs.m5452d(AbstractC0414Jk.f1387b);
        c2815zs.m5451c(AbstractC0414Jk.f1388c);
        c2815zs.m5450b(AbstractC0414Jk.f1389d);
        C2729xs c2729xs = C2729xs.f9326b;
        c2729xs.m5295b(C2567u1.f8912f);
        if (AbstractC1489hB.m2848a()) {
            return;
        }
        AbstractC0640Ov.m1260f(new C2567u1(C2258n1.class, new C2481s1[]{new C2481s1(0, InterfaceC0891Up.class)}, 0), true);
        c2815zs.m5453e(AbstractC2782z1.f9442a);
        c2815zs.m5452d(AbstractC2782z1.f9443b);
        c2815zs.m5451c(AbstractC2782z1.f9444c);
        c2815zs.m5450b(AbstractC2782z1.f9445d);
        c2729xs.m5295b(C2567u1.f8911e);
    }
}
