package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Ov */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0640Ov {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f2045a = null;

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f2046b = null;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f2047c = null;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f2048d = null;

    static {
        Logger.getLogger(AbstractC0640Ov.class.getName());
        f2045a = new AtomicReference(new C1103Zm());
        f2046b = new ConcurrentHashMap();
        f2047c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f2048d = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m1255a(String r4, Map r5, boolean r6) {
        monitor-enter(AbstractC0640Ov.class);
        if (r6 == true) goto L37;
    L14:
        if (r6 == true) goto L16;
    L35:
        monitor-exit(AbstractC0640Ov.class);
        return;
    L16:
        if (((C1103Zm) f2045a.get()).f3495a.containsKey(r4) == false) goto L25;
        Iterator r52 = r5.entrySet().iterator();     // Catch: Throwable -> L12
    L19:
        if (r52.hasNext() == false) goto L35;
        Map.Entry r62 = (Map.Entry) r52.next();     // Catch: Throwable -> L12
        if (f2048d.containsKey(r62.getKey()) == true) goto L19;
        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) r62.getKey()) + " from an existing key manager of type " + r4);     // Catch: Throwable -> L12
    L25:
        Iterator r42 = r5.entrySet().iterator();     // Catch: Throwable -> L12
    L27:
        if (r42.hasNext() == false) goto L35;
        Map.Entry r53 = (Map.Entry) r42.next();     // Catch: Throwable -> L12
        if (f2048d.containsKey(r53.getKey()) == false) goto L27;
        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) r53.getKey()));     // Catch: Throwable -> L12
    L37:
        ConcurrentHashMap r2 = f2047c;     // Catch: Throwable -> L12
        if (r2.containsKey(r4) == false) goto L14;
        if (((Boolean) r2.get(r4)).booleanValue() == true) goto L14;
        throw new GeneralSecurityException("New keys are already disallowed for key type " + r4);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static Object m1256b(AbstractC0828TB r3, Class r4) {
        C2430qu r0 = (C2430qu) C2729xs.f9326b.f9327a.get();
        r0.getClass();
        C2387pu r1 = new C2387pu(r3.getClass(), r4);
        HashMap r42 = r0.f8524a;
        if (r42.containsKey(r1) == false) goto L17;
        switch(((C2207lu) r42.get(r1)).f7694b.f8552a) {
            case 0: goto L11;
            default: goto L6;
        };
    L6:
        C0156Dk r32 = (C0156Dk) r3;
        C2352p9 r43 = new C2352p9();
        if (AbstractC2374ph.m4806c(2) == false) goto L10;
    L13:
        return r43;
    L10:
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    L11:
        C2301o1 r33 = (C2301o1) r3;
        r43 = new C2352p9();
        if (AbstractC2374ph.m4805b(1) == true) goto L13;
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    L17:
        throw new GeneralSecurityException("No PrimitiveConstructor for " + r1 + " available");
    }

    /* JADX INFO: renamed from: c */
    public static Object m1257c(String r3, AbstractC2744y6 r4, Class r5) {
        C1103Zm r0 = (C1103Zm) f2045a.get();
        r0.getClass();
        C1060Ym r32 = r0.m2025a(r3);
        Set r02 = r32.f3368a.f5509b.keySet();
        AbstractC1551in r33 = r32.f3368a;
        if (r02.contains(r5) == true) goto L33;
        StringBuilder r03 = new StringBuilder("Primitive type ");
        r03.append(r5.getName());
        r03.append(" not supported by key manager of type ");
        r03.append(r33.getClass());
        r03.append(", supported primitives: ");
        Set r34 = r33.f5509b.keySet();
        StringBuilder r52 = new StringBuilder();
        Iterator r35 = r34.iterator();
        boolean r1 = true;
    L26:
        if (r35.hasNext() == false) goto L31;
        Class r2 = (Class) r35.next();
        if (r1 == true) goto L30;
        r52.append(", ");
    L30:
        r52.append(r2.getCanonicalName());
        r1 = false;
        goto L26
    L31:
        r03.append(r52.toString());
        throw new GeneralSecurityException(r03.toString());
    L33:
    L21:
        e = move-exception;
        throw new GeneralSecurityException("Primitive type not supported", e);
    L6:
        if (r33.f5509b.keySet().contains(r5) == false) goto L8;
    L35:
        AbstractC0043B r42 = r33.mo2974f(r4);     // Catch: C0673Pl -> L18
        if (Void.class.equals(r5) == true) goto L17;
        r33.mo2975g(r42);     // Catch: C0673Pl -> L18
        return r33.m2971c(r42, r5);
    L17:
        throw new GeneralSecurityException("Cannot create a primitive for Void");     // Catch: C0673Pl -> L18
    L18:
        e = move-exception;
        throw new GeneralSecurityException("Failures parsing proto of type ".concat(r33.f5508a.getName()), e);
    L8:
        if (Void.class.equals(r5) == true) goto L35;
        throw new IllegalArgumentException("Given internalKeyMananger " + r33.toString() + " does not support primitive class " + r5.getName());     // Catch: IllegalArgumentException -> L21
    }

    /* JADX INFO: renamed from: d */
    public static Object m1258d(String r2, byte[] r3) {
        C2701x6 r0 = AbstractC2744y6.f9369b;
        return m1257c(r2, AbstractC2744y6.m5328c(r3, 0, r3.length), InterfaceC1435g1.class);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized C0931Vm m1259e(C1376en r5) {
        monitor-enter(AbstractC0640Ov.class);
        AbstractC1551in r2 = ((C1103Zm) f2045a.get()).m2025a(r5.m2666B()).f3368a;     // Catch: Throwable -> L9
        C1017Xm r3 = new C1017Xm(r2, r2.f5510c);     // Catch: Throwable -> L9
        if (((Boolean) f2047c.get(r5.m2666B())).booleanValue() == false) goto L12;
        C0931Vm r52 = r3.m1914k(r5.m2667C());     // Catch: Throwable -> L9
        monitor-exit(AbstractC0640Ov.class);
        return r52;
    L12:
        throw new GeneralSecurityException("newKey-operation not permitted for key type " + r5.m2666B());     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m1260f(AbstractC1551in r7, boolean r8) {
        monitor-enter(AbstractC0640Ov.class);
        AtomicReference r2 = f2045a;     // Catch: Throwable -> L7
        C1103Zm r1 = new C1103Zm((C1103Zm) r2.get());     // Catch: Throwable -> L7
        r1.m2026b(r7);     // Catch: Throwable -> L7
        String r3 = r7.mo2970b();     // Catch: Throwable -> L7
        if (r8 == false) goto L9;
        Map r4 = r7.mo2972d().mo5006c();     // Catch: Throwable -> L7
    L10:
        m1255a(r3, r4, r8);     // Catch: Throwable -> L7
        if (((C1103Zm) r2.get()).f3495a.containsKey(r3) == true) goto L15;
        f2046b.put(r3, new C0668Pg(29));     // Catch: Throwable -> L7
        if (r8 == false) goto L15;
        m1261g(r3, r7.mo2972d().mo5006c());     // Catch: Throwable -> L7
    L15:
        f2047c.put(r3, Boolean.valueOf(r8));     // Catch: Throwable -> L7
        r2.set(r1);     // Catch: Throwable -> L7
        monitor-exit(AbstractC0640Ov.class);
        return;
    L9:
        r4 = Collections.EMPTY_MAP;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: g */
    public static void m1261g(String r7, Map r8) {
        Iterator r82 = r8.entrySet().iterator();
    L4:
        if (r82.hasNext() == false) goto L20;
        Map.Entry r0 = (Map.Entry) r82.next();
        String r1 = (String) r0.getKey();
        byte[] r2 = ((AbstractC0043B) ((C1508hn) r0.getValue()).f5344a).m66e();
        int r02 = ((C1508hn) r0.getValue()).f5345b;
        C1333dn r4 = C1376en.m2660D();
        r4.m5038e();
        C1376en.m2661w((C1376en) r4.f8871b, r7);
        C2701x6 r22 = AbstractC2744y6.m5328c(r2, 0, r2.length);
        r4.m5038e();
        C1376en.m2662x((C1376en) r4.f8871b, r22);
        int r03 = AbstractC0213Ey.m424v(r02);
        if (r03 != 0) goto L8;
        EnumC2773yt r04 = EnumC2773yt.f9418c;
    L19:
        r4.m5038e();
        C1376en.m2663y((C1376en) r4.f8871b, r04);
        C1420fn r3 = new C1420fn((C1376en) r4.m5035b());
        f2048d.put(r1, r3);
        goto L4
    L8:
        if (r03 != 1) goto L10;
        r04 = EnumC2773yt.f9419d;
        goto L19
    L10:
        if (r03 != 2) goto L12;
        r04 = EnumC2773yt.f9420e;
        goto L19
    L12:
        if (r03 != 3) goto L15;
        r04 = EnumC2773yt.f9421f;
        goto L19
    L15:
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m1262h(InterfaceC2602uu r4) {
        monitor-enter(AbstractC0640Ov.class);
        C2729xs r1 = C2729xs.f9326b;     // Catch: Throwable -> L13
        monitor-enter(r1);     // Catch: Throwable -> L13
        C0649P3 r2 = new C0649P3((C2430qu) r1.f9327a.get());     // Catch: Throwable -> L10
        r2.m1285P(r4);     // Catch: Throwable -> L10
        C2430qu r42 = new C2430qu(r2);     // Catch: Throwable -> L10
        r1.f9327a.set(r42);     // Catch: Throwable -> L10
        monitor-exit(r1);     // Catch: Throwable -> L13
        monitor-exit(AbstractC0640Ov.class);
        return;
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;
    }
}
