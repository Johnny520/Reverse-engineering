package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2524t1 extends AbstractC2614v5 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8821b = 0;

    public /* synthetic */ C2524t1(Class cls) {
        super(cls);
    }

    @Override // p000.AbstractC2614v5
    /* JADX INFO: renamed from: a */
    public final AbstractC0043B mo5005a(AbstractC0043B abstractC0043B) {
        switch (this.f8821b) {
            case 0:
                C2395q1 c2395q1 = (C2395q1) abstractC0043B;
                C2215m1 c2215m1M4591C = C2258n1.m4591C();
                c2215m1M4591C.m5038e();
                C2258n1.m4593w((C2258n1) c2215m1M4591C.f8871b);
                byte[] bArrM2297a = AbstractC1192av.m2297a(c2395q1.m4827y());
                C2701x6 c2701x6M5328c = AbstractC2744y6.m5328c(bArrM2297a, 0, bArrM2297a.length);
                c2215m1M4591C.m5038e();
                C2258n1.m4594x((C2258n1) c2215m1M4591C.f8871b, c2701x6M5328c);
                C2739y1 c2739y1M4828z = c2395q1.m4828z();
                c2215m1M4591C.m5038e();
                C2258n1.m4595y((C2258n1) c2215m1M4591C.f8871b, c2739y1M4828z);
                return (C2258n1) c2215m1M4591C.m5035b();
            case 1:
                C0131D1 c0131d1 = (C0131D1) abstractC0043B;
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
                Collections.unmodifiableMap(map);
                C0389J1 c0389j1M228y = c0131d1.m228y();
                C0260G1 c0260g1M646D = C0303H1.m646D();
                C0475L1 c0475l1M826A = c0389j1M228y.m826A();
                c0260g1M646D.m5038e();
                C0303H1.m648x((C0303H1) c0260g1M646D.f8871b, c0475l1M826A);
                byte[] bArrM2297a2 = AbstractC1192av.m2297a(c0389j1M228y.m827z());
                C2701x6 c2701x6M5328c2 = AbstractC2744y6.m5328c(bArrM2297a2, 0, bArrM2297a2.length);
                c0260g1M646D.m5038e();
                C0303H1.m649y((C0303H1) c0260g1M646D.f8871b, c2701x6M5328c2);
                c0260g1M646D.m5038e();
                C0303H1.m647w((C0303H1) c0260g1M646D.f8871b);
                C0303H1 c0303h1 = (C0303H1) c0260g1M646D.m5035b();
                C2481s1[] c2481s1Arr2 = {new C2481s1(8, InterfaceC0891Up.class)};
                HashMap map2 = new HashMap();
                for (C2481s1 c2481s12 : c2481s1Arr2) {
                    Class cls3 = c2481s12.f8716a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                    map2.put(cls3, c2481s12);
                }
                if (c2481s1Arr2.length > 0) {
                    Class cls4 = c2481s1Arr2[0].f8716a;
                }
                Collections.unmodifiableMap(map2);
                C0242Fk c0242FkM229z = c0131d1.m229z();
                C0070Bk c0070BkM173D = C0113Ck.m173D();
                c0070BkM173D.m5038e();
                C0113Ck.m175w((C0113Ck) c0070BkM173D.f8871b);
                C0371Ik c0371IkM513A = c0242FkM229z.m513A();
                c0070BkM173D.m5038e();
                C0113Ck.m176x((C0113Ck) c0070BkM173D.f8871b, c0371IkM513A);
                byte[] bArrM2297a3 = AbstractC1192av.m2297a(c0242FkM229z.m514z());
                C2701x6 c2701x6M5328c3 = AbstractC2744y6.m5328c(bArrM2297a3, 0, bArrM2297a3.length);
                c0070BkM173D.m5038e();
                C0113Ck.m177y((C0113Ck) c0070BkM173D.f8871b, c2701x6M5328c3);
                C0113Ck c0113Ck = (C0113Ck) c0070BkM173D.m5035b();
                C0002A1 c0002a1M68C = C0045B1.m68C();
                c0002a1M68C.m5038e();
                C0045B1.m71x((C0045B1) c0002a1M68C.f8871b, c0303h1);
                c0002a1M68C.m5038e();
                C0045B1.m72y((C0045B1) c0002a1M68C.f8871b, c0113Ck);
                c0002a1M68C.m5038e();
                C0045B1.m70w((C0045B1) c0002a1M68C.f8871b);
                return (C0045B1) c0002a1M68C.m5035b();
            case 2:
                C0732R1 c0732r1 = (C0732R1) abstractC0043B;
                C0561N1 c0561n1M1178C = C0604O1.m1178C();
                byte[] bArrM2297a4 = AbstractC1192av.m2297a(c0732r1.m1529y());
                C2701x6 c2701x6M5328c4 = AbstractC2744y6.m5328c(bArrM2297a4, 0, bArrM2297a4.length);
                c0561n1M1178C.m5038e();
                C0604O1.m1182y((C0604O1) c0561n1M1178C.f8871b, c2701x6M5328c4);
                C0861U1 c0861u1M1530z = c0732r1.m1530z();
                c0561n1M1178C.m5038e();
                C0604O1.m1181x((C0604O1) c0561n1M1178C.f8871b, c0861u1M1530z);
                c0561n1M1178C.m5038e();
                C0604O1.m1180w((C0604O1) c0561n1M1178C.f8871b);
                return (C0604O1) c0561n1M1178C.m5035b();
            case 3:
                C0990X1 c0990x1M1965A = C1033Y1.m1965A();
                byte[] bArrM2297a5 = AbstractC1192av.m2297a(((C1200b2) abstractC0043B).m2322x());
                C2701x6 c2701x6M5328c5 = AbstractC2744y6.m5328c(bArrM2297a5, 0, bArrM2297a5.length);
                c0990x1M1965A.m5038e();
                C1033Y1.m1968x((C1033Y1) c0990x1M1965A.f8871b, c2701x6M5328c5);
                c0990x1M1965A.m5038e();
                C1033Y1.m1967w((C1033Y1) c0990x1M1965A.f8871b);
                return (C1033Y1) c0990x1M1965A.m5035b();
            case 4:
                C1392f2 c1392f2M2745A = C1436g2.m2745A();
                byte[] bArrM2297a6 = AbstractC1192av.m2297a(((C2081j2) abstractC0043B).m4245x());
                C2701x6 c2701x6M5328c6 = AbstractC2744y6.m5328c(bArrM2297a6, 0, bArrM2297a6.length);
                c1392f2M2745A.m5038e();
                C1436g2.m2748x((C1436g2) c1392f2M2745A.f8871b, c2701x6M5328c6);
                c1392f2M2745A.m5038e();
                C1436g2.m2747w((C1436g2) c1392f2M2745A.f8871b);
                return (C1436g2) c1392f2M2745A.m5035b();
            case 5:
                C2259n2 c2259n2M4674A = C2302o2.m4674A();
                byte[] bArrM2297a7 = AbstractC1192av.m2297a(((C2396q2) abstractC0043B).m4832x());
                C2701x6 c2701x6M5328c7 = AbstractC2744y6.m5328c(bArrM2297a7, 0, bArrM2297a7.length);
                c2259n2M4674A.m5038e();
                C2302o2.m4677x((C2302o2) c2259n2M4674A.f8871b, c2701x6M5328c7);
                c2259n2M4674A.m5038e();
                C2302o2.m4676w((C2302o2) c2259n2M4674A.f8871b);
                return (C2302o2) c2259n2M4674A.m5035b();
            case 6:
                C1310d7 c1310d7M2623A = C1353e7.m2623A();
                c1310d7M2623A.m5038e();
                C1353e7.m2625w((C1353e7) c1310d7M2623A.f8871b);
                byte[] bArrM2297a8 = AbstractC1192av.m2297a(32);
                C2701x6 c2701x6M5328c8 = AbstractC2744y6.m5328c(bArrM2297a8, 0, bArrM2297a8.length);
                c1310d7M2623A.m5038e();
                C1353e7.m2626x((C1353e7) c1310d7M2623A.f8871b, c2701x6M5328c8);
                return (C1353e7) c1310d7M2623A.m5035b();
            case 7:
                C0242Fk c0242Fk = (C0242Fk) abstractC0043B;
                C0070Bk c0070BkM173D2 = C0113Ck.m173D();
                c0070BkM173D2.m5038e();
                C0113Ck.m175w((C0113Ck) c0070BkM173D2.f8871b);
                C0371Ik c0371IkM513A2 = c0242Fk.m513A();
                c0070BkM173D2.m5038e();
                C0113Ck.m176x((C0113Ck) c0070BkM173D2.f8871b, c0371IkM513A2);
                byte[] bArrM2297a9 = AbstractC1192av.m2297a(c0242Fk.m514z());
                C2701x6 c2701x6M5328c9 = AbstractC2744y6.m5328c(bArrM2297a9, 0, bArrM2297a9.length);
                c0070BkM173D2.m5038e();
                C0113Ck.m177y((C0113Ck) c0070BkM173D2.f8871b, c2701x6M5328c9);
                return (C0113Ck) c0070BkM173D2.m5035b();
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                C2552tn c2552tnM5102A = C2595un.m5102A();
                c2552tnM5102A.m5038e();
                C2595un.m5105x((C2595un) c2552tnM5102A.f8871b, (C2638vn) abstractC0043B);
                c2552tnM5102A.m5038e();
                C2595un.m5104w((C2595un) c2552tnM5102A.f8871b);
                return (C2595un) c2552tnM5102A.m5035b();
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                C2767yn c2767ynM5433A = C2810zn.m5433A();
                c2767ynM5433A.m5038e();
                C2810zn.m5436x((C2810zn) c2767ynM5433A.f8871b, (C0030An) abstractC0043B);
                c2767ynM5433A.m5038e();
                C2810zn.m5435w((C2810zn) c2767ynM5433A.f8871b);
                return (C2810zn) c2767ynM5433A.m5035b();
            default:
                C0832TF c0832tfM1711A = C0875UF.m1711A();
                c0832tfM1711A.m5038e();
                C0875UF.m1713w((C0875UF) c0832tfM1711A.f8871b);
                byte[] bArrM2297a10 = AbstractC1192av.m2297a(32);
                C2701x6 c2701x6M5328c10 = AbstractC2744y6.m5328c(bArrM2297a10, 0, bArrM2297a10.length);
                c0832tfM1711A.m5038e();
                C0875UF.m1714x((C0875UF) c0832tfM1711A.f8871b, c2701x6M5328c10);
                return (C0875UF) c0832tfM1711A.m5035b();
        }
    }

    @Override // p000.AbstractC2614v5
    /* JADX INFO: renamed from: c */
    public Map mo5006c() {
        switch (this.f8821b) {
            case 0:
                HashMap map = new HashMap();
                C2344p1 c2344p1M4823A = C2395q1.m4823A();
                c2344p1M4823A.m5038e();
                C2395q1.m4825w((C2395q1) c2344p1M4823A.f8871b);
                C2696x1 c2696x1M5302z = C2739y1.m5302z();
                c2696x1M5302z.m5038e();
                C2739y1.m5300w((C2739y1) c2696x1M5302z.f8871b);
                C2739y1 c2739y1 = (C2739y1) c2696x1M5302z.m5035b();
                c2344p1M4823A.m5038e();
                C2395q1.m4826x((C2395q1) c2344p1M4823A.f8871b, c2739y1);
                map.put("AES_CMAC", new C1508hn((C2395q1) c2344p1M4823A.m5035b(), 1));
                C2344p1 c2344p1M4823A2 = C2395q1.m4823A();
                c2344p1M4823A2.m5038e();
                C2395q1.m4825w((C2395q1) c2344p1M4823A2.f8871b);
                C2696x1 c2696x1M5302z2 = C2739y1.m5302z();
                c2696x1M5302z2.m5038e();
                C2739y1.m5300w((C2739y1) c2696x1M5302z2.f8871b);
                C2739y1 c2739y12 = (C2739y1) c2696x1M5302z2.m5035b();
                c2344p1M4823A2.m5038e();
                C2395q1.m4826x((C2395q1) c2344p1M4823A2.f8871b, c2739y12);
                map.put("AES256_CMAC", new C1508hn((C2395q1) c2344p1M4823A2.m5035b(), 1));
                C2344p1 c2344p1M4823A3 = C2395q1.m4823A();
                c2344p1M4823A3.m5038e();
                C2395q1.m4825w((C2395q1) c2344p1M4823A3.f8871b);
                C2696x1 c2696x1M5302z3 = C2739y1.m5302z();
                c2696x1M5302z3.m5038e();
                C2739y1.m5300w((C2739y1) c2696x1M5302z3.f8871b);
                C2739y1 c2739y13 = (C2739y1) c2696x1M5302z3.m5035b();
                c2344p1M4823A3.m5038e();
                C2395q1.m4826x((C2395q1) c2344p1M4823A3.f8871b, c2739y13);
                map.put("AES256_CMAC_RAW", new C1508hn((C2395q1) c2344p1M4823A3.m5035b(), 3));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                map2.put("AES128_CTR_HMAC_SHA256", C2567u1.m5072i(16, 16, 1));
                map2.put("AES128_CTR_HMAC_SHA256_RAW", C2567u1.m5072i(16, 16, 3));
                map2.put("AES256_CTR_HMAC_SHA256", C2567u1.m5072i(32, 32, 1));
                map2.put("AES256_CTR_HMAC_SHA256_RAW", C2567u1.m5072i(32, 32, 3));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                map3.put("AES128_EAX", C2567u1.m5071h(16, 1));
                map3.put("AES128_EAX_RAW", C2567u1.m5071h(16, 3));
                map3.put("AES256_EAX", C2567u1.m5071h(32, 1));
                map3.put("AES256_EAX_RAW", C2567u1.m5071h(32, 3));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM", C2567u1.m5073j(16, 1));
                map4.put("AES128_GCM_RAW", C2567u1.m5073j(16, 3));
                map4.put("AES256_GCM", C2567u1.m5073j(32, 1));
                map4.put("AES256_GCM_RAW", C2567u1.m5073j(32, 3));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                map5.put("AES128_GCM_SIV", C2567u1.m5074k(16, 1));
                map5.put("AES128_GCM_SIV_RAW", C2567u1.m5074k(16, 3));
                map5.put("AES256_GCM_SIV", C2567u1.m5074k(32, 1));
                map5.put("AES256_GCM_SIV_RAW", C2567u1.m5074k(32, 3));
                return Collections.unmodifiableMap(map5);
            case 5:
                HashMap map6 = new HashMap();
                C2345p2 c2345p2M4830y = C2396q2.m4830y();
                c2345p2M4830y.m5038e();
                C2396q2.m4829w((C2396q2) c2345p2M4830y.f8871b);
                map6.put("AES256_SIV", new C1508hn((C2396q2) c2345p2M4830y.m5035b(), 1));
                C2345p2 c2345p2M4830y2 = C2396q2.m4830y();
                c2345p2M4830y2.m5038e();
                C2396q2.m4829w((C2396q2) c2345p2M4830y2.f8871b);
                map6.put("AES256_SIV_RAW", new C1508hn((C2396q2) c2345p2M4830y2.m5035b(), 3));
                return Collections.unmodifiableMap(map6);
            case 6:
                HashMap map7 = new HashMap();
                map7.put("CHACHA20_POLY1305", new C1508hn(C1485h7.m2846w(), 1));
                map7.put("CHACHA20_POLY1305_RAW", new C1508hn(C1485h7.m2846w(), 3));
                return Collections.unmodifiableMap(map7);
            case 7:
                HashMap map8 = new HashMap();
                EnumC2463rk enumC2463rk = EnumC2463rk.SHA256;
                map8.put("HMAC_SHA256_128BITTAG", C2567u1.m5075l(32, 16, enumC2463rk, 1));
                map8.put("HMAC_SHA256_128BITTAG_RAW", C2567u1.m5075l(32, 16, enumC2463rk, 3));
                map8.put("HMAC_SHA256_256BITTAG", C2567u1.m5075l(32, 32, enumC2463rk, 1));
                map8.put("HMAC_SHA256_256BITTAG_RAW", C2567u1.m5075l(32, 32, enumC2463rk, 3));
                EnumC2463rk enumC2463rk2 = EnumC2463rk.SHA512;
                map8.put("HMAC_SHA512_128BITTAG", C2567u1.m5075l(64, 16, enumC2463rk2, 1));
                map8.put("HMAC_SHA512_128BITTAG_RAW", C2567u1.m5075l(64, 16, enumC2463rk2, 3));
                map8.put("HMAC_SHA512_256BITTAG", C2567u1.m5075l(64, 32, enumC2463rk2, 1));
                map8.put("HMAC_SHA512_256BITTAG_RAW", C2567u1.m5075l(64, 32, enumC2463rk2, 3));
                map8.put("HMAC_SHA512_512BITTAG", C2567u1.m5075l(64, 64, enumC2463rk2, 1));
                map8.put("HMAC_SHA512_512BITTAG_RAW", C2567u1.m5075l(64, 64, enumC2463rk2, 3));
                return Collections.unmodifiableMap(map8);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
            default:
                return super.mo5006c();
            case 10:
                HashMap map9 = new HashMap();
                map9.put("XCHACHA20_POLY1305", new C1508hn(C0961WF.m1837w(), 1));
                map9.put("XCHACHA20_POLY1305_RAW", new C1508hn(C0961WF.m1837w(), 3));
                return Collections.unmodifiableMap(map9);
        }
    }

    @Override // p000.AbstractC2614v5
    /* JADX INFO: renamed from: e */
    public final AbstractC0043B mo5007e(AbstractC2744y6 abstractC2744y6) {
        switch (this.f8821b) {
            case 0:
                return C2395q1.m4824B(abstractC2744y6, C0839Tg.m1660a());
            case 1:
                return C0131D1.m225B(abstractC2744y6, C0839Tg.m1660a());
            case 2:
                return C0732R1.m1526B(abstractC2744y6, C0839Tg.m1660a());
            case 3:
                return C1200b2.m2321z(abstractC2744y6, C0839Tg.m1660a());
            case 4:
                return C2081j2.m4244z(abstractC2744y6, C0839Tg.m1660a());
            case 5:
                return C2396q2.m4831z(abstractC2744y6, C0839Tg.m1660a());
            case 6:
                return C1485h7.m2847x(abstractC2744y6, C0839Tg.m1660a());
            case 7:
                return C0242Fk.m509C(abstractC2744y6, C0839Tg.m1660a());
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return C2638vn.m5164y(abstractC2744y6, C0839Tg.m1660a());
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return C0030An.m42A(abstractC2744y6, C0839Tg.m1660a());
            default:
                return C0961WF.m1838x(abstractC2744y6, C0839Tg.m1660a());
        }
    }

    @Override // p000.AbstractC2614v5
    /* JADX INFO: renamed from: f */
    public final void mo5008f(AbstractC0043B abstractC0043B) throws GeneralSecurityException {
        switch (this.f8821b) {
            case 0:
                C2395q1 c2395q1 = (C2395q1) abstractC0043B;
                C2567u1.m5076m(c2395q1.m4828z());
                if (c2395q1.m4827y() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                return;
            case 1:
                C0131D1 c0131d1 = (C0131D1) abstractC0043B;
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
                Collections.unmodifiableMap(map);
                C0389J1 c0389j1M228y = c0131d1.m228y();
                AbstractC0100CD.m146a(c0389j1M228y.m827z());
                C0475L1 c0475l1M826A = c0389j1M228y.m826A();
                if (c0475l1M826A.m931y() < 12 || c0475l1M826A.m931y() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                C2481s1[] c2481s1Arr2 = {new C2481s1(8, InterfaceC0891Up.class)};
                HashMap map2 = new HashMap();
                for (C2481s1 c2481s12 : c2481s1Arr2) {
                    Class cls3 = c2481s12.f8716a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                    map2.put(cls3, c2481s12);
                }
                if (c2481s1Arr2.length > 0) {
                    Class cls4 = c2481s1Arr2[0].f8716a;
                }
                Collections.unmodifiableMap(map2);
                C0242Fk c0242FkM229z = c0131d1.m229z();
                if (c0242FkM229z.m514z() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C2567u1.m5077n(c0242FkM229z.m513A());
                AbstractC0100CD.m146a(c0131d1.m228y().m827z());
                return;
            case 2:
                C0732R1 c0732r1 = (C0732R1) abstractC0043B;
                AbstractC0100CD.m146a(c0732r1.m1529y());
                if (c0732r1.m1530z().m1704y() != 12 && c0732r1.m1530z().m1704y() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                AbstractC0100CD.m146a(((C1200b2) abstractC0043B).m2322x());
                return;
            case 4:
                AbstractC0100CD.m146a(((C2081j2) abstractC0043B).m4245x());
                return;
            case 5:
                C2396q2 c2396q2 = (C2396q2) abstractC0043B;
                if (c2396q2.m4832x() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + c2396q2.m4832x() + ". Valid keys must have 64 bytes.");
            case 6:
                return;
            case 7:
                C0242Fk c0242Fk = (C0242Fk) abstractC0043B;
                if (c0242Fk.m514z() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C2567u1.m5077n(c0242Fk.m513A());
                return;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                C0030An c0030An = (C0030An) abstractC0043B;
                if (c0030An.m46y().isEmpty() || !c0030An.m47z()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            default:
                return;
        }
    }

    public C2524t1(C2567u1 c2567u1, byte b, char c) {
        super(C2638vn.class);
    }

    public C2524t1(C2567u1 c2567u1, byte b, int i) {
        super(C0030An.class);
    }

    public C2524t1(C2567u1 c2567u1, char c) {
        super(C1200b2.class);
    }

    public C2524t1(C2567u1 c2567u1, byte b) {
        super(C0732R1.class);
    }

    public C2524t1(C2567u1 c2567u1, byte b, boolean z) {
        super(C1485h7.class);
    }

    public C2524t1(C2567u1 c2567u1, int i) {
        super(C2081j2.class);
    }

    public C2524t1(C2567u1 c2567u1, byte b, short s) {
        super(C0961WF.class);
    }

    public C2524t1(C2567u1 c2567u1, short s) {
        super(C2396q2.class);
    }

    public C2524t1(C2567u1 c2567u1) {
        super(C0131D1.class);
    }

    public C2524t1(C2567u1 c2567u1, byte b, byte b2) {
        super(C0242Fk.class);
    }
}
