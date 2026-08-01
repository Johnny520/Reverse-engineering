package p190k3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p011B4.AbstractC0231b;
import p074O2.InterfaceC1051i;
import p092S0.C1287y;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p149d3.AbstractC1983k;
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

    /* JADX INFO: renamed from: a */
    public static final void m4373a(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("Expected positive parallelism level, but got ", i5).toString());
        }
    }

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

    /* JADX INFO: renamed from: c */
    public static final AbstractC2470r m4375c(Object obj) {
        if (obj != f7917a) {
            return (AbstractC2470r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

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

    /* JADX INFO: renamed from: e */
    public static final boolean m4377e(Object obj) {
        return obj == f7917a;
    }

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

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4380h(p074O2.InterfaceC1046d r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof p190k3.C2458f
            if (r0 == 0) goto Lae
            k3.f r9 = (p190k3.C2458f) r9
            f3.p r0 = r9.f7930g
            Q2.c r1 = r9.f7931h
            java.lang.Throwable r2 = p056K2.AbstractC0885k.m1902a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            f3.n r3 = new f3.n
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            O2.i r2 = r1.mo275e()
            boolean r2 = r0.mo3975E(r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.f7932i = r3
            r9.f7028f = r4
            O2.i r10 = r1.mo275e()
            r0.mo1207D(r10, r9)
            return
        L2f:
            f3.L r0 = p160f3.AbstractC2144k0.m3973a()
            long r5 = r0.f7043f
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.f7932i = r3
            r9.f7028f = r4
            r0.m3899H(r9)
            goto La8
        L46:
            r0.m3901J(r4)
            O2.i r2 = r1.mo275e()     // Catch: java.lang.Throwable -> L69
            f3.q r3 = p160f3.C2155q.f7102e     // Catch: java.lang.Throwable -> L69
            O2.g r2 = r2.mo1166C(r3)     // Catch: java.lang.Throwable -> L69
            f3.S r2 = (p160f3.InterfaceC2115S) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.mo3904b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.mo3907n()     // Catch: java.lang.Throwable -> L69
            K2.j r10 = p127Z2.AbstractC1784a.m3229o(r10)     // Catch: java.lang.Throwable -> L69
            r9.mo278i(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r9.f7933j     // Catch: java.lang.Throwable -> L69
            O2.i r3 = r1.mo275e()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = m4384l(r3, r2)     // Catch: java.lang.Throwable -> L69
            Y1.n r5 = p190k3.AbstractC2453a.f7920d     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            f3.p0 r5 = p160f3.AbstractC2162v.m4000v(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.mo278i(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.m3977g0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            m4379g(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.m3902L()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.m3898G(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.m3977g0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            m4379g(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.m3881h(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.m3898G(r4)
            throw r9
        Lae:
            r9.mo278i(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p190k3.AbstractC2453a.m4380h(O2.d, java.lang.Object):void");
    }

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

    /* JADX INFO: renamed from: j */
    public static int m4382j(int i5, int i6, String str) {
        return (int) m4381i(str, i5, 1, (i6 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: k */
    public static final Object m4383k(InterfaceC1051i interfaceC1051i) {
        Object objMo1165A = interfaceC1051i.mo1165A(f7921e, 0);
        AbstractC1665j.m2982b(objMo1165A);
        return objMo1165A;
    }

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
