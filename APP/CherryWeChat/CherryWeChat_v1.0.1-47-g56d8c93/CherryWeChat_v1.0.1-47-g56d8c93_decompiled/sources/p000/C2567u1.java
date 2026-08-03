package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2567u1 extends AbstractC1551in {

    /* JADX INFO: renamed from: e */
    public static final C2207lu f8911e = new C2207lu(C2301o1.class, new C2438r1(0));

    /* JADX INFO: renamed from: f */
    public static final C2207lu f8912f = new C2207lu(C0156Dk.class, new C2438r1(9));

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2567u1(Class cls, C2481s1[] c2481s1Arr, int i) {
        super(cls, c2481s1Arr);
        this.f8913d = i;
    }

    /* JADX INFO: renamed from: h */
    public static C1508hn m5071h(int i, int i2) {
        C0690Q1 c0690q1M1525A = C0732R1.m1525A();
        c0690q1M1525A.m5038e();
        C0732R1.m1528x((C0732R1) c0690q1M1525A.f8871b, i);
        C0818T1 c0818t1M1703z = C0861U1.m1703z();
        c0818t1M1703z.m5038e();
        C0861U1.m1701w((C0861U1) c0818t1M1703z.f8871b);
        C0861U1 c0861u1 = (C0861U1) c0818t1M1703z.m5035b();
        c0690q1M1525A.m5038e();
        C0732R1.m1527w((C0732R1) c0690q1M1525A.f8871b, c0861u1);
        return new C1508hn((C0732R1) c0690q1M1525A.m5035b(), i2);
    }

    /* JADX INFO: renamed from: i */
    public static C1508hn m5072i(int i, int i2, int i3) {
        C0346I1 c0346i1M822B = C0389J1.m822B();
        C0432K1 c0432k1M930z = C0475L1.m930z();
        c0432k1M930z.m5038e();
        C0475L1.m928w((C0475L1) c0432k1M930z.f8871b);
        C0475L1 c0475l1 = (C0475L1) c0432k1M930z.m5035b();
        c0346i1M822B.m5038e();
        C0389J1.m823w((C0389J1) c0346i1M822B.f8871b, c0475l1);
        c0346i1M822B.m5038e();
        C0389J1.m824x((C0389J1) c0346i1M822B.f8871b, i);
        C0389J1 c0389j1 = (C0389J1) c0346i1M822B.m5035b();
        C0199Ek c0199EkM508B = C0242Fk.m508B();
        C0328Hk c0328HkM814B = C0371Ik.m814B();
        c0328HkM814B.m5038e();
        C0371Ik.m815w((C0371Ik) c0328HkM814B.f8871b, EnumC2463rk.SHA256);
        c0328HkM814B.m5038e();
        C0371Ik.m816x((C0371Ik) c0328HkM814B.f8871b, i2);
        C0371Ik c0371Ik = (C0371Ik) c0328HkM814B.m5035b();
        c0199EkM508B.m5038e();
        C0242Fk.m510w((C0242Fk) c0199EkM508B.f8871b, c0371Ik);
        c0199EkM508B.m5038e();
        C0242Fk.m511x((C0242Fk) c0199EkM508B.f8871b, 32);
        C0242Fk c0242Fk = (C0242Fk) c0199EkM508B.m5035b();
        C0088C1 c0088c1M224A = C0131D1.m224A();
        c0088c1M224A.m5038e();
        C0131D1.m226w((C0131D1) c0088c1M224A.f8871b, c0389j1);
        c0088c1M224A.m5038e();
        C0131D1.m227x((C0131D1) c0088c1M224A.f8871b, c0242Fk);
        return new C1508hn((C0131D1) c0088c1M224A.m5035b(), i3);
    }

    /* JADX INFO: renamed from: j */
    public static C1508hn m5073j(int i, int i2) {
        C1120a2 c1120a2M2320y = C1200b2.m2320y();
        c1120a2M2320y.m5038e();
        C1200b2.m2319w((C1200b2) c1120a2M2320y.f8871b, i);
        return new C1508hn((C1200b2) c1120a2M2320y.m5035b(), i2);
    }

    /* JADX INFO: renamed from: k */
    public static C1508hn m5074k(int i, int i2) {
        C1524i2 c1524i2M4243y = C2081j2.m4243y();
        c1524i2M4243y.m5038e();
        C2081j2.m4242w((C2081j2) c1524i2M4243y.f8871b, i);
        return new C1508hn((C2081j2) c1524i2M4243y.m5035b(), i2);
    }

    /* JADX INFO: renamed from: l */
    public static C1508hn m5075l(int i, int i2, EnumC2463rk enumC2463rk, int i3) {
        C0199Ek c0199EkM508B = C0242Fk.m508B();
        C0328Hk c0328HkM814B = C0371Ik.m814B();
        c0328HkM814B.m5038e();
        C0371Ik.m815w((C0371Ik) c0328HkM814B.f8871b, enumC2463rk);
        c0328HkM814B.m5038e();
        C0371Ik.m816x((C0371Ik) c0328HkM814B.f8871b, i2);
        C0371Ik c0371Ik = (C0371Ik) c0328HkM814B.m5035b();
        c0199EkM508B.m5038e();
        C0242Fk.m510w((C0242Fk) c0199EkM508B.f8871b, c0371Ik);
        c0199EkM508B.m5038e();
        C0242Fk.m511x((C0242Fk) c0199EkM508B.f8871b, i);
        return new C1508hn((C0242Fk) c0199EkM508B.m5035b(), i3);
    }

    /* JADX INFO: renamed from: m */
    public static void m5076m(C2739y1 c2739y1) {
        if (c2739y1.m5303y() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c2739y1.m5303y() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m5077n(C0371Ik c0371Ik) {
        if (c0371Ik.m818A() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = c0371Ik.m819z().ordinal();
        if (iOrdinal == 1) {
            if (c0371Ik.m818A() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (c0371Ik.m818A() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (c0371Ik.m818A() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (c0371Ik.m818A() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (c0371Ik.m818A() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: a */
    public int mo2969a() {
        switch (this.f8913d) {
            case 1:
                return 2;
            case 2:
                return 2;
            case 3:
            default:
                return super.mo2969a();
            case 4:
                return 2;
        }
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: b */
    public final String mo2970b() {
        switch (this.f8913d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: d */
    public final AbstractC2614v5 mo2972d() {
        switch (this.f8913d) {
            case 0:
                return new C2524t1(C2395q1.class);
            case 1:
                return new C2524t1(this, (byte) 0, (byte) 0);
            case 2:
                return new C2524t1(this);
            case 3:
                return new C2524t1(this, (byte) 0);
            case 4:
                return new C2524t1(this, (char) 0);
            case 5:
                return new C2524t1(this, 0);
            case 6:
                return new C2524t1(this, (short) 0);
            case 7:
                return new C2524t1(this, (byte) 0, false);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return new C2524t1(this, (byte) 0, (char) 0);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return new C2524t1(this, (byte) 0, 0);
            default:
                return new C2524t1(this, (byte) 0, (short) 0);
        }
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: e */
    public final EnumC0888Um mo2973e() {
        switch (this.f8913d) {
            case 0:
                return EnumC0888Um.SYMMETRIC;
            case 1:
                return EnumC0888Um.SYMMETRIC;
            case 2:
                return EnumC0888Um.SYMMETRIC;
            case 3:
                return EnumC0888Um.SYMMETRIC;
            case 4:
                return EnumC0888Um.SYMMETRIC;
            case 5:
                return EnumC0888Um.SYMMETRIC;
            case 6:
                return EnumC0888Um.SYMMETRIC;
            case 7:
                return EnumC0888Um.SYMMETRIC;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return EnumC0888Um.REMOTE;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return EnumC0888Um.REMOTE;
            default:
                return EnumC0888Um.SYMMETRIC;
        }
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: f */
    public final AbstractC0043B mo2974f(AbstractC2744y6 abstractC2744y6) {
        switch (this.f8913d) {
            case 0:
                return C2258n1.m4592D(abstractC2744y6, C0839Tg.m1660a());
            case 1:
                return C0113Ck.m174E(abstractC2744y6, C0839Tg.m1660a());
            case 2:
                return C0045B1.m69D(abstractC2744y6, C0839Tg.m1660a());
            case 3:
                return C0604O1.m1179D(abstractC2744y6, C0839Tg.m1660a());
            case 4:
                return C1033Y1.m1966B(abstractC2744y6, C0839Tg.m1660a());
            case 5:
                return C1436g2.m2746B(abstractC2744y6, C0839Tg.m1660a());
            case 6:
                return C2302o2.m4675B(abstractC2744y6, C0839Tg.m1660a());
            case 7:
                return C1353e7.m2624B(abstractC2744y6, C0839Tg.m1660a());
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return C2595un.m5103B(abstractC2744y6, C0839Tg.m1660a());
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return C2810zn.m5434B(abstractC2744y6, C0839Tg.m1660a());
            default:
                return C0875UF.m1712B(abstractC2744y6, C0839Tg.m1660a());
        }
    }

    @Override // p000.AbstractC1551in
    /* JADX INFO: renamed from: g */
    public final void mo2975g(AbstractC0043B abstractC0043B) throws GeneralSecurityException {
        switch (this.f8913d) {
            case 0:
                C2258n1 c2258n1 = (C2258n1) abstractC0043B;
                AbstractC0100CD.m148c(c2258n1.m4597B());
                if (c2258n1.m4598z().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                m5076m(c2258n1.m4596A());
                return;
            case 1:
                C0113Ck c0113Ck = (C0113Ck) abstractC0043B;
                AbstractC0100CD.m148c(c0113Ck.m181C());
                if (c0113Ck.m179A().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                m5077n(c0113Ck.m180B());
                return;
            case 2:
                C0045B1 c0045b1 = (C0045B1) abstractC0043B;
                AbstractC0100CD.m148c(c0045b1.m74B());
                C2481s1[] c2481s1Arr = {new C2481s1(2, InterfaceC1506hl.class)};
                HashMap map = new HashMap();
                C2481s1 c2481s1 = c2481s1Arr[0];
                Class cls = c2481s1.f8716a;
                if (map.containsKey(cls)) {
                    throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                }
                map.put(cls, c2481s1);
                Class cls2 = c2481s1Arr[0].f8716a;
                Collections.unmodifiableMap(map);
                C0303H1 c0303h1M75z = c0045b1.m75z();
                AbstractC0100CD.m148c(c0303h1M75z.m653C());
                AbstractC0100CD.m146a(c0303h1M75z.m651A().size());
                C0475L1 c0475l1M652B = c0303h1M75z.m652B();
                if (c0475l1M652B.m931y() < 12 || c0475l1M652B.m931y() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                C2481s1[] c2481s1Arr2 = {new C2481s1(8, InterfaceC0891Up.class)};
                HashMap map2 = new HashMap();
                C2481s1 c2481s12 = c2481s1Arr2[0];
                Class cls3 = c2481s12.f8716a;
                if (map2.containsKey(cls3)) {
                    throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                }
                map2.put(cls3, c2481s12);
                Class cls4 = c2481s1Arr2[0].f8716a;
                Collections.unmodifiableMap(map2);
                C0113Ck c0113CkM73A = c0045b1.m73A();
                AbstractC0100CD.m148c(c0113CkM73A.m181C());
                if (c0113CkM73A.m179A().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                m5077n(c0113CkM73A.m180B());
                return;
            case 3:
                C0604O1 c0604o1 = (C0604O1) abstractC0043B;
                AbstractC0100CD.m148c(c0604o1.m1184B());
                AbstractC0100CD.m146a(c0604o1.m1185z().size());
                if (c0604o1.m1183A().m1704y() != 12 && c0604o1.m1183A().m1704y() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 4:
                C1033Y1 c1033y1 = (C1033Y1) abstractC0043B;
                AbstractC0100CD.m148c(c1033y1.m1970z());
                AbstractC0100CD.m146a(c1033y1.m1969y().size());
                return;
            case 5:
                C1436g2 c1436g2 = (C1436g2) abstractC0043B;
                AbstractC0100CD.m148c(c1436g2.m2750z());
                AbstractC0100CD.m146a(c1436g2.m2749y().size());
                return;
            case 6:
                C2302o2 c2302o2 = (C2302o2) abstractC0043B;
                AbstractC0100CD.m148c(c2302o2.m4679z());
                if (c2302o2.m4678y().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + c2302o2.m4678y().size() + ". Valid keys must have 64 bytes.");
            case 7:
                C1353e7 c1353e7 = (C1353e7) abstractC0043B;
                AbstractC0100CD.m148c(c1353e7.m2628z());
                if (c1353e7.m2627y().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                AbstractC0100CD.m148c(((C2595un) abstractC0043B).m5107z());
                return;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                AbstractC0100CD.m148c(((C2810zn) abstractC0043B).m5438z());
                return;
            default:
                C0875UF c0875uf = (C0875UF) abstractC0043B;
                AbstractC0100CD.m148c(c0875uf.m1716z());
                if (c0875uf.m1715y().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2567u1() {
        super(C0113Ck.class, new C2481s1(8, InterfaceC0891Up.class));
        this.f8913d = 1;
    }
}
