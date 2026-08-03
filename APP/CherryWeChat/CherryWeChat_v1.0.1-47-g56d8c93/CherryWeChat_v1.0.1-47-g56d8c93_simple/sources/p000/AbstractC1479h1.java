package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1479h1 {
    static {
        C2481s1[] r0 = {new C2481s1(1, InterfaceC1435g1.class)};
        HashMap r1 = new HashMap();
        C2481s1 r4 = r0[0];
        Class r5 = r4.f8716a;
        if (r1.containsKey(r5) == true) goto L39;
        r1.put(r5, r4);
        Class r02 = r0[0].f8716a;
        Collections.unmodifiableMap(r1);
        C2481s1[] r03 = {new C2481s1(4, InterfaceC1435g1.class)};
        HashMap r12 = new HashMap();
        C2481s1 r42 = r03[0];
        Class r52 = r42.f8716a;
        if (r12.containsKey(r52) == true) goto L37;
        r12.put(r52, r42);
        Class r04 = r03[0].f8716a;
        Collections.unmodifiableMap(r12);
        C2481s1[] r05 = {new C2481s1(5, InterfaceC1435g1.class)};
        HashMap r13 = new HashMap();
        C2481s1 r43 = r05[0];
        Class r53 = r43.f8716a;
        if (r13.containsKey(r53) == true) goto L35;
        r13.put(r53, r43);
        Class r06 = r05[0].f8716a;
        Collections.unmodifiableMap(r13);
        C2481s1[] r07 = {new C2481s1(3, InterfaceC1435g1.class)};
        HashMap r14 = new HashMap();
        C2481s1 r44 = r07[0];
        Class r54 = r44.f8716a;
        if (r14.containsKey(r54) == true) goto L33;
        r14.put(r54, r44);
        Class r08 = r07[0].f8716a;
        Collections.unmodifiableMap(r14);
        C2481s1[] r09 = {new C2481s1(9, InterfaceC1435g1.class)};
        HashMap r15 = new HashMap();
        C2481s1 r45 = r09[0];
        Class r55 = r45.f8716a;
        if (r15.containsKey(r55) == true) goto L31;
        r15.put(r55, r45);
        Class r010 = r09[0].f8716a;
        Collections.unmodifiableMap(r15);
        C2481s1[] r011 = {new C2481s1(10, InterfaceC1435g1.class)};
        HashMap r16 = new HashMap();
        C2481s1 r46 = r011[0];
        Class r56 = r46.f8716a;
        if (r16.containsKey(r56) == true) goto L29;
        r16.put(r56, r46);
        Class r012 = r011[0].f8716a;
        Collections.unmodifiableMap(r16);
        C2481s1[] r013 = {new C2481s1(7, InterfaceC1435g1.class)};
        HashMap r17 = new HashMap();
        C2481s1 r47 = r013[0];
        Class r57 = r47.f8716a;
        if (r17.containsKey(r57) == true) goto L27;
        r17.put(r57, r47);
        Class r014 = r013[0].f8716a;
        Collections.unmodifiableMap(r17);
        C2481s1[] r015 = {new C2481s1(11, InterfaceC1435g1.class)};
        HashMap r18 = new HashMap();
        C2481s1 r2 = r015[0];
        Class r48 = r2.f8716a;
        if (r18.containsKey(r48) == true) goto L25;
        r18.put(r48, r2);
        Class r016 = r015[0].f8716a;
        Collections.unmodifiableMap(r18);
        int r017 = C0726Qv.CONFIG_NAME_FIELD_NUMBER;
        m2837a();     // Catch: GeneralSecurityException -> L21
        return;
    L21:
        e = move-exception;
        throw new ExceptionInInitializerError(e);
    L25:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r48.getCanonicalName());
    L27:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r57.getCanonicalName());
    L29:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r56.getCanonicalName());
    L31:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r55.getCanonicalName());
    L33:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r54.getCanonicalName());
    L35:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r53.getCanonicalName());
    L37:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r52.getCanonicalName());
    L39:
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + r5.getCanonicalName());
    }

    /* JADX INFO: renamed from: a */
    public static void m2837a() {
        AbstractC0640Ov.m1262h(C2172l1.f7566b);
        AbstractC0934Vp.m1794a();
        AbstractC0640Ov.m1260f(new C2567u1(C0045B1.class, new C2481s1[]{new C2481s1(1, InterfaceC1435g1.class)}, 2), true);
        AbstractC0640Ov.m1260f(new C2567u1(C1033Y1.class, new C2481s1[]{new C2481s1(4, InterfaceC1435g1.class)}, 4), true);
        C0380It r0 = AbstractC1305d2.f4749a;
        C2815zs r02 = C2815zs.f9535b;
        r02.m5453e(AbstractC1305d2.f4749a);
        r02.m5452d(AbstractC1305d2.f4750b);
        r02.m5451c(AbstractC1305d2.f4751c);
        r02.m5450b(AbstractC1305d2.f4752d);
        if (AbstractC1489hB.m2848a() == false) goto L5;
        return;
    L5:
        AbstractC0640Ov.m1260f(new C2567u1(C0604O1.class, new C2481s1[]{new C2481s1(3, InterfaceC1435g1.class)}, 3), true);
        r02.m5453e(AbstractC0904V1.f2814a);
        r02.m5452d(AbstractC0904V1.f2815b);
        r02.m5451c(AbstractC0904V1.f2816c);
        r02.m5450b(AbstractC0904V1.f2817d);
        Cipher.getInstance("AES/GCM-SIV/NoPadding");     // Catch: Throwable -> L10
        AbstractC0640Ov.m1260f(new C2567u1(C1436g2.class, new C2481s1[]{new C2481s1(5, InterfaceC1435g1.class)}, 5), true);
        r02.m5453e(AbstractC2173l2.f7567a);
        r02.m5452d(AbstractC2173l2.f7568b);
        r02.m5451c(AbstractC2173l2.f7569c);
        r02.m5450b(AbstractC2173l2.f7570d);
    L8:
        AbstractC0640Ov.m1260f(new C2567u1(C1353e7.class, new C2481s1[]{new C2481s1(7, InterfaceC1435g1.class)}, 7), true);
        C0380It r03 = AbstractC2086j7.f7348a;
        C2815zs r04 = C2815zs.f9535b;
        r04.m5453e(AbstractC2086j7.f7348a);
        r04.m5452d(AbstractC2086j7.f7349b);
        r04.m5451c(AbstractC2086j7.f7350c);
        r04.m5450b(AbstractC2086j7.f7351d);
        AbstractC0640Ov.m1260f(new C2567u1(C2595un.class, new C2481s1[]{new C2481s1(9, InterfaceC1435g1.class)}, 8), true);
        AbstractC0640Ov.m1260f(new C2567u1(C2810zn.class, new C2481s1[]{new C2481s1(10, InterfaceC1435g1.class)}, 9), true);
        AbstractC0640Ov.m1260f(new C2567u1(C0875UF.class, new C2481s1[]{new C2481s1(11, InterfaceC1435g1.class)}, 10), true);
        r04.m5453e(AbstractC1047YF.f3342a);
        r04.m5452d(AbstractC1047YF.f3343b);
        r04.m5451c(AbstractC1047YF.f3344c);
        r04.m5450b(AbstractC1047YF.f3345d);
    }
}
