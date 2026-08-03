package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2481s1 {

    /* JADX INFO: renamed from: a */
    public final Class f8716a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8717b;

    public C2481s1(int i, Class cls) {
        this.f8717b = i;
        this.f8716a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4966a(AbstractC0043B abstractC0043B) throws GeneralSecurityException {
        switch (this.f8717b) {
            case 0:
                C2258n1 c2258n1 = (C2258n1) abstractC0043B;
                return new C1515hu(new C2656w4(c2258n1.m4598z().m5329g()), c2258n1.m4596A().m5303y());
            case 1:
                C0045B1 c0045b1 = (C0045B1) abstractC0043B;
                C2481s1[] c2481s1Arr = {new C2481s1(2, InterfaceC1506hl.class)};
                HashMap map = new HashMap();
                for (C2481s1 c2481s1 : c2481s1Arr) {
                    Class cls = c2481s1.f8716a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                    map.put(cls, c2481s1);
                }
                if (c2481s1Arr.length > 0) {
                    Class cls2 = c2481s1Arr[0].f8716a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                C0303H1 c0303h1M75z = c0045b1.m75z();
                C2481s1 c2481s12 = (C2481s1) mapUnmodifiableMap.get(InterfaceC1506hl.class);
                if (c2481s12 == null) {
                    throw new IllegalArgumentException("Requested primitive class " + InterfaceC1506hl.class.getCanonicalName() + " not supported.");
                }
                InterfaceC1506hl interfaceC1506hl = (InterfaceC1506hl) c2481s12.m4966a(c0303h1M75z);
                C2481s1[] c2481s1Arr2 = {new C2481s1(8, InterfaceC0891Up.class)};
                HashMap map2 = new HashMap();
                for (C2481s1 c2481s13 : c2481s1Arr2) {
                    Class cls3 = c2481s13.f8716a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                    map2.put(cls3, c2481s13);
                }
                if (c2481s1Arr2.length > 0) {
                    Class cls4 = c2481s1Arr2[0].f8716a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                C0113Ck c0113CkM73A = c0045b1.m73A();
                C2481s1 c2481s14 = (C2481s1) mapUnmodifiableMap2.get(InterfaceC0891Up.class);
                if (c2481s14 != null) {
                    return new C0795Sf(interfaceC1506hl, (InterfaceC0891Up) c2481s14.m4966a(c0113CkM73A), c0045b1.m73A().m180B().m818A());
                }
                throw new IllegalArgumentException("Requested primitive class " + InterfaceC0891Up.class.getCanonicalName() + " not supported.");
            case 2:
                C0303H1 c0303h1 = (C0303H1) abstractC0043B;
                return new C0217F1(c0303h1.m652B().m931y(), c0303h1.m651A().m5329g());
            case 3:
                C0604O1 c0604o1 = (C0604O1) abstractC0043B;
                return new C0518M1(c0604o1.m1183A().m1704y(), c0604o1.m1185z().m5329g());
            case 4:
                return new C0947W1(0, ((C1033Y1) abstractC0043B).m1969y().m5329g());
            case 5:
                return new C1348e2(((C1436g2) abstractC0043B).m2749y().m5329g());
            case 6:
                return new C2216m2(((C2302o2) abstractC0043B).m4678y().m5329g());
            case 7:
                return new C0947W1(2, ((C1353e7) abstractC0043B).m2627y().m5329g());
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                C0113Ck c0113Ck = (C0113Ck) abstractC0043B;
                EnumC2463rk enumC2463rkM819z = c0113Ck.m180B().m819z();
                SecretKeySpec secretKeySpec = new SecretKeySpec(c0113Ck.m179A().m5329g(), "HMAC");
                int iM818A = c0113Ck.m180B().m818A();
                int iOrdinal = enumC2463rkM819z.ordinal();
                if (iOrdinal == 1) {
                    return new C1515hu(new C0584Ni("HMACSHA1", secretKeySpec), iM818A);
                }
                if (iOrdinal == 2) {
                    return new C1515hu(new C0584Ni("HMACSHA384", secretKeySpec), iM818A);
                }
                if (iOrdinal == 3) {
                    return new C1515hu(new C0584Ni("HMACSHA256", secretKeySpec), iM818A);
                }
                if (iOrdinal == 4) {
                    return new C1515hu(new C0584Ni("HMACSHA512", secretKeySpec), iM818A);
                }
                if (iOrdinal == 5) {
                    return new C1515hu(new C0584Ni("HMACSHA224", secretKeySpec), iM818A);
                }
                throw new GeneralSecurityException("unknown hash");
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                String strM5165x = ((C2595un) abstractC0043B).m5106y().m5165x();
                return AbstractC2681wn.m5250a(strM5165x).m328c(strM5165x);
            case 10:
                C2810zn c2810zn = (C2810zn) abstractC0043B;
                String strM46y = c2810zn.m5437y().m46y();
                return new C2724xn(c2810zn.m5437y().m45x(), AbstractC2681wn.m5250a(strM46y).m328c(strM46y));
            default:
                return new C0947W1(3, ((C0875UF) abstractC0043B).m1715y().m5329g());
        }
    }
}
