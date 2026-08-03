package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: zs */
/* JADX INFO: loaded from: classes.dex */
public final class C2815zs {

    /* JADX INFO: renamed from: b */
    public static final C2815zs f9535b = new C2815zs();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9536a = new AtomicReference(new C0470Kx(new C2428qs(8)));

    /* JADX INFO: renamed from: a */
    public final AbstractC0828TB m5449a(C0252Fu c0252Fu) {
        C2610v1 c2610v1;
        C2610v1 c2610v12;
        AtomicReference atomicReference = this.f9536a;
        C0470Kx c0470Kx = (C0470Kx) atomicReference.get();
        c0470Kx.getClass();
        C2787z6 c2787z6 = (C2787z6) c0252Fu.f820b;
        if (!c0470Kx.f1526b.containsKey(new C0384Ix(C0252Fu.class, c2787z6))) {
            try {
                C0460Kn c0460Kn = new C0460Kn();
                ((EnumC0888Um) c0252Fu.f822d).ordinal();
                return c0460Kn;
            } catch (GeneralSecurityException e) {
                throw new C0232Fa("Creating a LegacyProtoKey failed", e);
            }
        }
        C0470Kx c0470Kx2 = (C0470Kx) atomicReference.get();
        c0470Kx2.getClass();
        C0384Ix c0384Ix = new C0384Ix(C0252Fu.class, c2787z6);
        HashMap map = c0470Kx2.f1526b;
        if (!map.containsKey(c0384Ix)) {
            throw new GeneralSecurityException("No Key Parser for requested key type " + c0384Ix + " available");
        }
        switch (((C1148an) map.get(c0384Ix)).f3644b.f8552a) {
            case 1:
                if (!((String) c0252Fu.f819a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    C2258n1 c2258n1M4592D = C2258n1.m4592D((AbstractC2744y6) c0252Fu.f821c, C0839Tg.m1660a());
                    if (c2258n1M4592D.m4597B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2656w4 c2656w4 = new C2656w4(2);
                    c2656w4.f9196b = null;
                    c2656w4.f9197c = null;
                    c2656w4.f9198d = C2610v1.f9005f;
                    c2656w4.m5197G(c2258n1M4592D.m4598z().size());
                    int iM5303y = c2258n1M4592D.m4596A().m5303y();
                    if (iM5303y < 10 || 16 < iM5303y) {
                        throw new GeneralSecurityException(AbstractC2374ph.m4812i(iM5303y, "Invalid tag size for AesCmacParameters: "));
                    }
                    c2656w4.f9197c = Integer.valueOf(iM5303y);
                    c2656w4.f9198d = AbstractC2782z1.m5354a((EnumC2773yt) c0252Fu.f823e);
                    C2653w1 c2653w1M5201e = c2656w4.m5201e();
                    C2656w4 c2656w42 = new C2656w4(1);
                    c2656w42.f9197c = null;
                    c2656w42.f9198d = null;
                    c2656w42.f9196b = c2653w1M5201e;
                    c2656w42.f9197c = new C1017Xm(13, C2787z6.m5359a(c2258n1M4592D.m4598z().m5329g()));
                    c2656w42.f9198d = (Integer) c0252Fu.f824f;
                    return c2656w42.m5200d();
                } catch (C0673Pl | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            case 2:
                if (!((String) c0252Fu.f819a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    C0604O1 c0604o1M1179D = C0604O1.m1179D((AbstractC2744y6) c0252Fu.f821c, C0839Tg.m1660a());
                    if (c0604o1M1179D.m1184B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2610v1 c2610v13 = C2610v1.f9008i;
                    int size = c0604o1M1179D.m1185z().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int iM1704y = c0604o1M1179D.m1183A().m1704y();
                    if (iM1704y != 12 && iM1704y != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iM1704y)));
                    }
                    EnumC2773yt enumC2773yt = (EnumC2773yt) c0252Fu.f823e;
                    int iOrdinal = enumC2773yt.ordinal();
                    if (iOrdinal == 1) {
                        c2610v13 = C2610v1.f9006g;
                    } else if (iOrdinal == 2) {
                        c2610v13 = C2610v1.f9007h;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC2773yt.m5345b());
                        }
                        c2610v13 = C2610v1.f9007h;
                    }
                    C0775S1 c0775s1 = new C0775S1(size, iM1704y, 16, c2610v13);
                    C2656w4 c2656w43 = new C2656w4(3);
                    c2656w43.f9197c = null;
                    c2656w43.f9198d = null;
                    c2656w43.f9196b = c0775s1;
                    c2656w43.f9197c = new C1017Xm(13, C2787z6.m5359a(c0604o1M1179D.m1185z().m5329g()));
                    c2656w43.f9198d = (Integer) c0252Fu.f824f;
                    return c2656w43.m5202f();
                } catch (C0673Pl unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 3:
                if (!((String) c0252Fu.f819a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    C1033Y1 c1033y1M1966B = C1033Y1.m1966B((AbstractC2744y6) c0252Fu.f821c, C0839Tg.m1660a());
                    if (c1033y1M1966B.m1970z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2610v1 c2610v14 = C2610v1.f9011l;
                    int size2 = c1033y1M1966B.m1969y().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    EnumC2773yt enumC2773yt2 = (EnumC2773yt) c0252Fu.f823e;
                    int iOrdinal2 = enumC2773yt2.ordinal();
                    if (iOrdinal2 == 1) {
                        c2610v14 = C2610v1.f9009j;
                    } else if (iOrdinal2 == 2) {
                        c2610v14 = C2610v1.f9010k;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC2773yt2.m5345b());
                        }
                        c2610v14 = C2610v1.f9010k;
                    }
                    C1243c2 c1243c2 = new C1243c2(size2, 12, 16, c2610v14);
                    C2656w4 c2656w44 = new C2656w4(4);
                    c2656w44.f9197c = null;
                    c2656w44.f9198d = null;
                    c2656w44.f9196b = c1243c2;
                    c2656w44.f9197c = new C1017Xm(13, C2787z6.m5359a(c1033y1M1966B.m1969y().m5329g()));
                    c2656w44.f9198d = (Integer) c0252Fu.f824f;
                    return c2656w44.m5203g();
                } catch (C0673Pl unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 4:
                if (!((String) c0252Fu.f819a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    C1436g2 c1436g2M2746B = C1436g2.m2746B((AbstractC2744y6) c0252Fu.f821c, C0839Tg.m1660a());
                    if (c1436g2M2746B.m2750z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2610v1 c2610v15 = C2610v1.f9014o;
                    int size3 = c1436g2M2746B.m2749y().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    EnumC2773yt enumC2773yt3 = (EnumC2773yt) c0252Fu.f823e;
                    int iOrdinal3 = enumC2773yt3.ordinal();
                    if (iOrdinal3 == 1) {
                        c2610v15 = C2610v1.f9012m;
                    } else if (iOrdinal3 == 2) {
                        c2610v15 = C2610v1.f9013n;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC2773yt3.m5345b());
                        }
                        c2610v15 = C2610v1.f9013n;
                    }
                    C2125k2 c2125k2 = new C2125k2(size3, c2610v15);
                    C2656w4 c2656w45 = new C2656w4(5);
                    c2656w45.f9197c = null;
                    c2656w45.f9198d = null;
                    c2656w45.f9196b = c2125k2;
                    c2656w45.f9197c = new C1017Xm(13, C2787z6.m5359a(c1436g2M2746B.m2749y().m5329g()));
                    c2656w45.f9198d = (Integer) c0252Fu.f824f;
                    return c2656w45.m5204h();
                } catch (C0673Pl unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 5:
                if (!((String) c0252Fu.f819a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    C1353e7 c1353e7M2624B = C1353e7.m2624B((AbstractC2744y6) c0252Fu.f821c, C0839Tg.m1660a());
                    if (c1353e7M2624B.m2628z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    EnumC2773yt enumC2773yt4 = (EnumC2773yt) c0252Fu.f823e;
                    int iOrdinal4 = enumC2773yt4.ordinal();
                    if (iOrdinal4 == 1) {
                        c2610v1 = C2610v1.f9015p;
                    } else if (iOrdinal4 == 2) {
                        c2610v1 = C2610v1.f9016q;
                    } else if (iOrdinal4 == 3) {
                        c2610v1 = C2610v1.f9017r;
                    } else {
                        if (iOrdinal4 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC2773yt4.m5345b());
                        }
                        c2610v1 = C2610v1.f9016q;
                    }
                    return C1397f7.m2673N(c2610v1, new C1017Xm(13, C2787z6.m5359a(c1353e7M2624B.m2627y().m5329g())), (Integer) c0252Fu.f824f);
                } catch (C0673Pl unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 6:
            case 7:
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
            default:
                if (!((String) c0252Fu.f819a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    C0875UF c0875ufM1712B = C0875UF.m1712B((AbstractC2744y6) c0252Fu.f821c, C0839Tg.m1660a());
                    if (c0875ufM1712B.m1716z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    EnumC2773yt enumC2773yt5 = (EnumC2773yt) c0252Fu.f823e;
                    int iOrdinal5 = enumC2773yt5.ordinal();
                    if (iOrdinal5 == 1) {
                        c2610v12 = C2610v1.f8999E;
                    } else if (iOrdinal5 == 2) {
                        c2610v12 = C2610v1.f9000F;
                    } else if (iOrdinal5 == 3) {
                        c2610v12 = C2610v1.f9001G;
                    } else {
                        if (iOrdinal5 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC2773yt5.m5345b());
                        }
                        c2610v12 = C2610v1.f9000F;
                    }
                    return C0918VF.m1766N(c2610v12, new C1017Xm(13, C2787z6.m5359a(c0875ufM1712B.m1715y().m5329g())), (Integer) c0252Fu.f824f);
                } catch (C0673Pl unused6) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 10:
                if (!((String) c0252Fu.f819a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    C0113Ck c0113CkM174E = C0113Ck.m174E((AbstractC2744y6) c0252Fu.f821c, C0839Tg.m1660a());
                    if (c0113CkM174E.m181C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2428qs c2428qs = new C2428qs();
                    c2428qs.f8520a = null;
                    c2428qs.f8521b = null;
                    c2428qs.f8522c = null;
                    c2428qs.f8523d = C2610v1.f8995A;
                    c2428qs.f8520a = Integer.valueOf(c0113CkM174E.m179A().size());
                    c2428qs.f8521b = Integer.valueOf(c0113CkM174E.m180B().m818A());
                    c2428qs.f8522c = AbstractC0414Jk.m863a(c0113CkM174E.m180B().m819z());
                    c2428qs.f8523d = AbstractC0414Jk.m864b((EnumC2773yt) c0252Fu.f823e);
                    C0285Gk c0285GkM4871i = c2428qs.m4871i();
                    C2656w4 c2656w46 = new C2656w4(14);
                    c2656w46.f9197c = null;
                    c2656w46.f9198d = null;
                    c2656w46.f9196b = c0285GkM4871i;
                    c2656w46.f9197c = new C1017Xm(13, C2787z6.m5359a(c0113CkM174E.m179A().m5329g()));
                    c2656w46.f9198d = (Integer) c0252Fu.f824f;
                    return c2656w46.m5205j();
                } catch (C0673Pl | IllegalArgumentException unused7) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5450b(C1148an c1148an) {
        C2428qs c2428qs = new C2428qs((C0470Kx) this.f9536a.get());
        c2428qs.m4887y(c1148an);
        this.f9536a.set(new C0470Kx(c2428qs));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5451c(C1228bn c1228bn) {
        C2428qs c2428qs = new C2428qs((C0470Kx) this.f9536a.get());
        c2428qs.m4888z(c1228bn);
        this.f9536a.set(new C0470Kx(c2428qs));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5452d(C0337Ht c0337Ht) {
        C2428qs c2428qs = new C2428qs((C0470Kx) this.f9536a.get());
        c2428qs.m4862A(c0337Ht);
        this.f9536a.set(new C0470Kx(c2428qs));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m5453e(C0380It c0380It) {
        C2428qs c2428qs = new C2428qs((C0470Kx) this.f9536a.get());
        c2428qs.m4863B(c0380It);
        this.f9536a.set(new C0470Kx(c2428qs));
    }
}
