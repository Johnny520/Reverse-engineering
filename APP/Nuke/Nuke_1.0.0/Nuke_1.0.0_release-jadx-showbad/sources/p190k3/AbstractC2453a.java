package p190k3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p011B4.AbstractC0231b;
import p056K2.AbstractC0885k;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p084Q2.AbstractC1178c;
import p092S0.C1287y;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p149d3.AbstractC1983k;
import p160f3.AbstractC2109L;
import p160f3.AbstractC2144k0;
import p160f3.AbstractC2153p;
import p160f3.AbstractC2162v;
import p160f3.C2149n;
import p160f3.C2154p0;
import p160f3.C2155q;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2142j0;
import p160f3.InterfaceC2157r;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: k3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2453a {

    /* JADX INFO: renamed from: a */
    public static final C1753n f7917a;

    /* JADX INFO: renamed from: b */
    public static final C1753n f7918b;

    /* JADX INFO: renamed from: c */
    public static final C1753n f7919c;

    /* JADX INFO: renamed from: d */
    public static final C1753n f7920d;

    /* JADX INFO: renamed from: e */
    public static final C1287y f7921e;

    /* JADX INFO: renamed from: f */
    public static final C1287y f7922f;

    /* JADX INFO: renamed from: g */
    public static final C1287y f7923g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 10;
        f7917a = new C1753n(i5, "CLOSED");
        f7918b = new C1753n(i5, "UNDEFINED");
        f7919c = new C1753n(i5, "REUSABLE_CLAIMED");
        f7920d = new C1753n(i5, "NO_THREAD_ELEMENTS");
        byte b2 = 0;
        f7921e = new C1287y(b2, 20);
        f7922f = new C1287y(b2, 21);
        f7923g = new C1287y(b2, 22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4373a(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("Expected positive parallelism level, but got ", i5).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final Object m4374b(AbstractC2470r abstractC2470r, long j5, InterfaceC1603e interfaceC1603e) {
        while (true) {
            if (abstractC2470r.f7958c >= j5 && !abstractC2470r.mo4387c()) {
                return abstractC2470r;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC2454b.f7924a;
            Object obj = atomicReferenceFieldUpdater.get(abstractC2470r);
            C1753n c1753n = f7917a;
            if (obj == c1753n) {
                return c1753n;
            }
            AbstractC2470r abstractC2470r2 = (AbstractC2470r) ((AbstractC2454b) obj);
            if (abstractC2470r2 == null) {
                abstractC2470r2 = (AbstractC2470r) interfaceC1603e.mo0g(Long.valueOf(abstractC2470r.f7958c + 1), abstractC2470r);
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2470r, null, abstractC2470r2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC2470r) != null) {
                        break;
                    }
                }
                if (abstractC2470r.mo4387c()) {
                    abstractC2470r.m4388d();
                }
            }
            abstractC2470r = abstractC2470r2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final AbstractC2470r m4375c(Object obj) {
        if (obj != f7917a) {
            return (AbstractC2470r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m4376d(InterfaceC1051i interfaceC1051i, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC2456d.f7927a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2157r) it.next()).mo2409h(interfaceC1051i, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC2352g.m4193f(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC2352g.m4193f(th, new C2457e(interfaceC1051i));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m4377e(Object obj) {
        return obj == f7917a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final Object m4378f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m4379g(InterfaceC1051i interfaceC1051i, Object obj) {
        if (obj == f7920d) {
            return;
        }
        if (!(obj instanceof C2474v)) {
            Object objMo1165A = interfaceC1051i.mo1165A(f7922f, null);
            AbstractC1665j.m2983c(objMo1165A, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0231b.m408s(objMo1165A);
            throw null;
        }
        C2474v c2474v = (C2474v) obj;
        InterfaceC2142j0[] interfaceC2142j0Arr = c2474v.f7964b;
        int length = interfaceC2142j0Arr.length - 1;
        if (length < 0) {
            return;
        }
        InterfaceC2142j0 interfaceC2142j0 = interfaceC2142j0Arr[length];
        AbstractC1665j.m2982b(null);
        Object obj2 = c2474v.f7963a[length];
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4380h(InterfaceC1046d interfaceC1046d, Object obj) {
        InterfaceC2115S interfaceC2115S;
        if (!(interfaceC1046d instanceof C2458f)) {
            interfaceC1046d.mo278i(obj);
            return;
        }
        C2458f c2458f = (C2458f) interfaceC1046d;
        AbstractC2153p abstractC2153p = c2458f.f7930g;
        AbstractC1178c abstractC1178c = c2458f.f7931h;
        Throwable thM1902a = AbstractC0885k.m1902a(obj);
        Object c2149n = thM1902a == null ? obj : new C2149n(thM1902a, false);
        if (abstractC2153p.mo3975E(abstractC1178c.mo275e())) {
            c2458f.f7932i = c2149n;
            c2458f.f7028f = 1;
            abstractC2153p.mo1207D(abstractC1178c.mo275e(), c2458f);
            return;
        }
        AbstractC2109L abstractC2109LM3973a = AbstractC2144k0.m3973a();
        if (abstractC2109LM3973a.f7043f >= 4294967296L) {
            c2458f.f7932i = c2149n;
            c2458f.f7028f = 1;
            abstractC2109LM3973a.m3899H(c2458f);
            return;
        }
        abstractC2109LM3973a.m3901J(true);
        try {
            interfaceC2115S = (InterfaceC2115S) abstractC1178c.mo275e().mo1166C(C2155q.f7102e);
        } finally {
            try {
            } finally {
            }
        }
        if (interfaceC2115S == null || interfaceC2115S.mo3904b()) {
            Object obj2 = c2458f.f7933j;
            InterfaceC1051i interfaceC1051iMo275e = abstractC1178c.mo275e();
            Object objM4384l = m4384l(interfaceC1051iMo275e, obj2);
            C2154p0 c2154p0M4000v = objM4384l != f7920d ? AbstractC2162v.m4000v(abstractC1178c, interfaceC1051iMo275e, objM4384l) : null;
            try {
                abstractC1178c.mo278i(obj);
            } finally {
                if (c2154p0M4000v == null || c2154p0M4000v.m3977g0()) {
                    m4379g(interfaceC1051iMo275e, objM4384l);
                }
            }
        }
        c2458f.mo278i(AbstractC1784a.m3229o(interfaceC2115S.mo3907n()));
        while (abstractC2109LM3973a.m3902L()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final long m4381i(String str, long j5, long j6, long j7) {
        String property;
        int i5 = AbstractC2472t.f7960a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j5;
        }
        Long lM3658U = AbstractC1983k.m3658U(property, 10);
        if (lM3658U == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM3658U.longValue();
        if (j6 <= jLongValue && jLongValue <= j7) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j6 + ".." + j7 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m4382j(int i5, int i6, String str) {
        return (int) m4381i(str, i5, 1, (i6 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final Object m4383k(InterfaceC1051i interfaceC1051i) {
        Object objMo1165A = interfaceC1051i.mo1165A(f7921e, 0);
        AbstractC1665j.m2982b(objMo1165A);
        return objMo1165A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final Object m4384l(InterfaceC1051i interfaceC1051i, Object obj) {
        if (obj == null) {
            obj = m4383k(interfaceC1051i);
        }
        if (obj == 0) {
            return f7920d;
        }
        if (obj instanceof Integer) {
            return interfaceC1051i.mo1165A(f7923g, new C2474v(((Number) obj).intValue(), interfaceC1051i));
        }
        AbstractC0231b.m408s(obj);
        throw null;
    }
}
