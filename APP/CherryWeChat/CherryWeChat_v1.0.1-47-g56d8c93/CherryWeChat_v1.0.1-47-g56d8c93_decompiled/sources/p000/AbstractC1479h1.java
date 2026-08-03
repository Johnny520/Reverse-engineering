package p000;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1479h1 {
    static {
        C2481s1[] c2481s1Arr = {new C2481s1(1, InterfaceC1435g1.class)};
        HashMap map = new HashMap();
        C2481s1 c2481s1 = c2481s1Arr[0];
        Class cls = c2481s1.f8716a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
        }
        map.put(cls, c2481s1);
        Class cls2 = c2481s1Arr[0].f8716a;
        Collections.unmodifiableMap(map);
        C2481s1[] c2481s1Arr2 = {new C2481s1(4, InterfaceC1435g1.class)};
        HashMap map2 = new HashMap();
        C2481s1 c2481s12 = c2481s1Arr2[0];
        Class cls3 = c2481s12.f8716a;
        if (map2.containsKey(cls3)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
        }
        map2.put(cls3, c2481s12);
        Class cls4 = c2481s1Arr2[0].f8716a;
        Collections.unmodifiableMap(map2);
        C2481s1[] c2481s1Arr3 = {new C2481s1(5, InterfaceC1435g1.class)};
        HashMap map3 = new HashMap();
        C2481s1 c2481s13 = c2481s1Arr3[0];
        Class cls5 = c2481s13.f8716a;
        if (map3.containsKey(cls5)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls5.getCanonicalName());
        }
        map3.put(cls5, c2481s13);
        Class cls6 = c2481s1Arr3[0].f8716a;
        Collections.unmodifiableMap(map3);
        C2481s1[] c2481s1Arr4 = {new C2481s1(3, InterfaceC1435g1.class)};
        HashMap map4 = new HashMap();
        C2481s1 c2481s14 = c2481s1Arr4[0];
        Class cls7 = c2481s14.f8716a;
        if (map4.containsKey(cls7)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls7.getCanonicalName());
        }
        map4.put(cls7, c2481s14);
        Class cls8 = c2481s1Arr4[0].f8716a;
        Collections.unmodifiableMap(map4);
        C2481s1[] c2481s1Arr5 = {new C2481s1(9, InterfaceC1435g1.class)};
        HashMap map5 = new HashMap();
        C2481s1 c2481s15 = c2481s1Arr5[0];
        Class cls9 = c2481s15.f8716a;
        if (map5.containsKey(cls9)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls9.getCanonicalName());
        }
        map5.put(cls9, c2481s15);
        Class cls10 = c2481s1Arr5[0].f8716a;
        Collections.unmodifiableMap(map5);
        C2481s1[] c2481s1Arr6 = {new C2481s1(10, InterfaceC1435g1.class)};
        HashMap map6 = new HashMap();
        C2481s1 c2481s16 = c2481s1Arr6[0];
        Class cls11 = c2481s16.f8716a;
        if (map6.containsKey(cls11)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls11.getCanonicalName());
        }
        map6.put(cls11, c2481s16);
        Class cls12 = c2481s1Arr6[0].f8716a;
        Collections.unmodifiableMap(map6);
        C2481s1[] c2481s1Arr7 = {new C2481s1(7, InterfaceC1435g1.class)};
        HashMap map7 = new HashMap();
        C2481s1 c2481s17 = c2481s1Arr7[0];
        Class cls13 = c2481s17.f8716a;
        if (map7.containsKey(cls13)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls13.getCanonicalName());
        }
        map7.put(cls13, c2481s17);
        Class cls14 = c2481s1Arr7[0].f8716a;
        Collections.unmodifiableMap(map7);
        C2481s1[] c2481s1Arr8 = {new C2481s1(11, InterfaceC1435g1.class)};
        HashMap map8 = new HashMap();
        C2481s1 c2481s18 = c2481s1Arr8[0];
        Class cls15 = c2481s18.f8716a;
        if (map8.containsKey(cls15)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls15.getCanonicalName());
        }
        map8.put(cls15, c2481s18);
        Class cls16 = c2481s1Arr8[0].f8716a;
        Collections.unmodifiableMap(map8);
        int i = C0726Qv.CONFIG_NAME_FIELD_NUMBER;
        try {
            m2837a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2837a() {
        AbstractC0640Ov.m1262h(C2172l1.f7566b);
        AbstractC0934Vp.m1794a();
        AbstractC0640Ov.m1260f(new C2567u1(C0045B1.class, new C2481s1[]{new C2481s1(1, InterfaceC1435g1.class)}, 2), true);
        AbstractC0640Ov.m1260f(new C2567u1(C1033Y1.class, new C2481s1[]{new C2481s1(4, InterfaceC1435g1.class)}, 4), true);
        C0380It c0380It = AbstractC1305d2.f4749a;
        C2815zs c2815zs = C2815zs.f9535b;
        c2815zs.m5453e(AbstractC1305d2.f4749a);
        c2815zs.m5452d(AbstractC1305d2.f4750b);
        c2815zs.m5451c(AbstractC1305d2.f4751c);
        c2815zs.m5450b(AbstractC1305d2.f4752d);
        if (AbstractC1489hB.m2848a()) {
            return;
        }
        AbstractC0640Ov.m1260f(new C2567u1(C0604O1.class, new C2481s1[]{new C2481s1(3, InterfaceC1435g1.class)}, 3), true);
        c2815zs.m5453e(AbstractC0904V1.f2814a);
        c2815zs.m5452d(AbstractC0904V1.f2815b);
        c2815zs.m5451c(AbstractC0904V1.f2816c);
        c2815zs.m5450b(AbstractC0904V1.f2817d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            AbstractC0640Ov.m1260f(new C2567u1(C1436g2.class, new C2481s1[]{new C2481s1(5, InterfaceC1435g1.class)}, 5), true);
            c2815zs.m5453e(AbstractC2173l2.f7567a);
            c2815zs.m5452d(AbstractC2173l2.f7568b);
            c2815zs.m5451c(AbstractC2173l2.f7569c);
            c2815zs.m5450b(AbstractC2173l2.f7570d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        AbstractC0640Ov.m1260f(new C2567u1(C1353e7.class, new C2481s1[]{new C2481s1(7, InterfaceC1435g1.class)}, 7), true);
        C0380It c0380It2 = AbstractC2086j7.f7348a;
        C2815zs c2815zs2 = C2815zs.f9535b;
        c2815zs2.m5453e(AbstractC2086j7.f7348a);
        c2815zs2.m5452d(AbstractC2086j7.f7349b);
        c2815zs2.m5451c(AbstractC2086j7.f7350c);
        c2815zs2.m5450b(AbstractC2086j7.f7351d);
        AbstractC0640Ov.m1260f(new C2567u1(C2595un.class, new C2481s1[]{new C2481s1(9, InterfaceC1435g1.class)}, 8), true);
        AbstractC0640Ov.m1260f(new C2567u1(C2810zn.class, new C2481s1[]{new C2481s1(10, InterfaceC1435g1.class)}, 9), true);
        AbstractC0640Ov.m1260f(new C2567u1(C0875UF.class, new C2481s1[]{new C2481s1(11, InterfaceC1435g1.class)}, 10), true);
        c2815zs2.m5453e(AbstractC1047YF.f3342a);
        c2815zs2.m5452d(AbstractC1047YF.f3343b);
        c2815zs2.m5451c(AbstractC1047YF.f3344c);
        c2815zs2.m5450b(AbstractC1047YF.f3345d);
    }
}
