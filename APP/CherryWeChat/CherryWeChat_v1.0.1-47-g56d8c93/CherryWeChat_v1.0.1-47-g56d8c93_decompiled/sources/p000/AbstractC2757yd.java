package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: yd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2757yd {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9386a = 0;

    static {
        C2481s1[] c2481s1Arr = {new C2481s1(6, InterfaceC2714xd.class)};
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
            AbstractC0640Ov.m1262h(C0020Ad.f38b);
            if (AbstractC1489hB.m2848a()) {
                return;
            }
            AbstractC0640Ov.m1260f(new C2567u1(C2302o2.class, new C2481s1[]{new C2481s1(6, InterfaceC2714xd.class)}, 6), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
