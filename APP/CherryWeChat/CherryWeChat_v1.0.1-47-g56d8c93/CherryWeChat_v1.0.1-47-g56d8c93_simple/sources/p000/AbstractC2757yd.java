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
        C2481s1[] r0 = {new C2481s1(6, InterfaceC2714xd.class)};
        HashMap r3 = new HashMap();
        C2481s1 r5 = r0[0];
        Class r6 = r5.f8716a;
        if (r3.containsKey(r6) == true) goto L14;
        r3.put(r6, r5);
        Class r02 = r0[0].f8716a;
        Collections.unmodifiableMap(r3);
        int r03 = C0726Qv.CONFIG_NAME_FIELD_NUMBER;
        AbstractC0640Ov.m1262h(C0020Ad.f38b);     // Catch: GeneralSecurityException -> L10
        if (AbstractC1489hB.m2848a() == false) goto L8;
        return;
    L8:
        AbstractC0640Ov.m1260f(new C2567u1(C2302o2.class, new C2481s1[]{new C2481s1(6, InterfaceC2714xd.class)}, 6), true);     // Catch: GeneralSecurityException -> L10
        return;
    L10:
        e = move-exception;
        throw new ExceptionInInitializerError(e);
    L14:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r6.getCanonicalName());
    }
}
