package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Ov */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0640Ov {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f2045a;

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f2046b;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f2047c;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f2048d;

    static {
        Logger.getLogger(AbstractC0640Ov.class.getName());
        f2045a = new AtomicReference(new C1103Zm());
        f2046b = new ConcurrentHashMap();
        f2047c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f2048d = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m1255a(String str, Map map, boolean z) {
        if (z) {
            try {
                ConcurrentHashMap concurrentHashMap = f2047c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z) {
            if (((C1103Zm) f2045a.get()).f3495a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f2048d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f2048d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m1256b(AbstractC0828TB abstractC0828TB, Class cls) {
        C2352p9 c2352p9;
        C2430qu c2430qu = (C2430qu) C2729xs.f9326b.f9327a.get();
        c2430qu.getClass();
        C2387pu c2387pu = new C2387pu(abstractC0828TB.getClass(), cls);
        HashMap map = c2430qu.f8524a;
        if (!map.containsKey(c2387pu)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + c2387pu + " available");
        }
        switch (((C2207lu) map.get(c2387pu)).f7694b.f8552a) {
            case 0:
                c2352p9 = new C2352p9();
                if (!AbstractC2374ph.m4805b(1)) {
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return c2352p9;
            default:
                c2352p9 = new C2352p9();
                if (!AbstractC2374ph.m4806c(2)) {
                    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return c2352p9;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m1257c(String str, AbstractC2744y6 abstractC2744y6, Class cls) {
        C1103Zm c1103Zm = (C1103Zm) f2045a.get();
        c1103Zm.getClass();
        C1060Ym c1060YmM2025a = c1103Zm.m2025a(str);
        Set setKeySet = c1060YmM2025a.f3368a.f5509b.keySet();
        AbstractC1551in abstractC1551in = c1060YmM2025a.f3368a;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(abstractC1551in.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet2 = abstractC1551in.f5509b.keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : setKeySet2) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!abstractC1551in.f5509b.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1551in.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                AbstractC0043B abstractC0043BMo2974f = abstractC1551in.mo2974f(abstractC2744y6);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                abstractC1551in.mo2975g(abstractC0043BMo2974f);
                return abstractC1551in.m2971c(abstractC0043BMo2974f, cls);
            } catch (C0673Pl e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(abstractC1551in.f5508a.getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m1258d(String str, byte[] bArr) {
        C2701x6 c2701x6 = AbstractC2744y6.f9369b;
        return m1257c(str, AbstractC2744y6.m5328c(bArr, 0, bArr.length), InterfaceC1435g1.class);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized C0931Vm m1259e(C1376en c1376en) {
        C1017Xm c1017Xm;
        AbstractC1551in abstractC1551in = ((C1103Zm) f2045a.get()).m2025a(c1376en.m2666B()).f3368a;
        c1017Xm = new C1017Xm(abstractC1551in, abstractC1551in.f5510c);
        if (!((Boolean) f2047c.get(c1376en.m2666B())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + c1376en.m2666B());
        }
        return c1017Xm.m1914k(c1376en.m2667C());
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m1260f(AbstractC1551in abstractC1551in, boolean z) {
        try {
            AtomicReference atomicReference = f2045a;
            C1103Zm c1103Zm = new C1103Zm((C1103Zm) atomicReference.get());
            c1103Zm.m2026b(abstractC1551in);
            String strMo2970b = abstractC1551in.mo2970b();
            m1255a(strMo2970b, z ? abstractC1551in.mo2972d().mo5006c() : Collections.EMPTY_MAP, z);
            if (!((C1103Zm) atomicReference.get()).f3495a.containsKey(strMo2970b)) {
                f2046b.put(strMo2970b, new C0668Pg(29));
                if (z) {
                    m1261g(strMo2970b, abstractC1551in.mo2972d().mo5006c());
                }
            }
            f2047c.put(strMo2970b, Boolean.valueOf(z));
            atomicReference.set(c1103Zm);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1261g(String str, Map map) {
        EnumC2773yt enumC2773yt;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] bArrM66e = ((AbstractC0043B) ((C1508hn) entry.getValue()).f5344a).m66e();
            int i = ((C1508hn) entry.getValue()).f5345b;
            C1333dn c1333dnM2660D = C1376en.m2660D();
            c1333dnM2660D.m5038e();
            C1376en.m2661w((C1376en) c1333dnM2660D.f8871b, str);
            C2701x6 c2701x6M5328c = AbstractC2744y6.m5328c(bArrM66e, 0, bArrM66e.length);
            c1333dnM2660D.m5038e();
            C1376en.m2662x((C1376en) c1333dnM2660D.f8871b, c2701x6M5328c);
            int iM424v = AbstractC0213Ey.m424v(i);
            if (iM424v == 0) {
                enumC2773yt = EnumC2773yt.TINK;
            } else if (iM424v == 1) {
                enumC2773yt = EnumC2773yt.LEGACY;
            } else if (iM424v == 2) {
                enumC2773yt = EnumC2773yt.RAW;
            } else {
                if (iM424v != 3) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                enumC2773yt = EnumC2773yt.CRUNCHY;
            }
            c1333dnM2660D.m5038e();
            C1376en.m2663y((C1376en) c1333dnM2660D.f8871b, enumC2773yt);
            f2048d.put(str2, new C1420fn((C1376en) c1333dnM2660D.m5035b()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m1262h(InterfaceC2602uu interfaceC2602uu) {
        C2729xs c2729xs = C2729xs.f9326b;
        synchronized (c2729xs) {
            C0649P3 c0649p3 = new C0649P3((C2430qu) c2729xs.f9327a.get());
            c0649p3.m1285P(interfaceC2602uu);
            c2729xs.f9327a.set(new C2430qu(c0649p3));
        }
    }
}
