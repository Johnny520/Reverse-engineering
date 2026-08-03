package vg;

import ac.AbstractC0063p;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1866o2;
import p119i2.C1954y;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p162l3.C2463q;
import p218og.AbstractC3156t;
import p249qg.AbstractC3565g0;
import p249qg.AbstractC3569h1;
import p249qg.AbstractC3591p;
import p249qg.AbstractC3603v;
import p249qg.C3584m1;
import p249qg.C3585n;
import p249qg.C3593q;
import p249qg.InterfaceC3595r;
import p249qg.InterfaceC3596r0;
import p276sf.C3960g;
import p276sf.C3967n;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: vg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4552a {

    /* JADX INFO: renamed from: a */
    public static final C2463q f15013a = new C2463q("CLOSED", 1);

    /* JADX INFO: renamed from: b */
    public static final C2463q f15014b = new C2463q("UNDEFINED", 1);

    /* JADX INFO: renamed from: c */
    public static final C2463q f15015c = new C2463q("REUSABLE_CLAIMED", 1);

    /* JADX INFO: renamed from: d */
    public static final C2463q f15016d = new C2463q("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: e */
    public static final C1954y f15017e = new C1954y(29);

    /* JADX INFO: renamed from: f */
    public static final C4571t f15018f = new C4571t(0);

    /* JADX INFO: renamed from: g */
    public static final C4571t f15019g = new C4571t(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m8982a(int i9) {
        if (i9 >= 1) {
            return;
        }
        C2104o.m5291q(AbstractC0921a.m2249l(i9, "Expected positive parallelism level, but got "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final Object m8983b(AbstractC4568q abstractC4568q, long j3, InterfaceC1235p interfaceC1235p) {
        while (true) {
            if (abstractC4568q.f15053c >= j3 && !abstractC4568q.mo8996c()) {
                return abstractC4568q;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC4553b.f15020a;
            Object obj = atomicReferenceFieldUpdater.get(abstractC4568q);
            C2463q c2463q = f15013a;
            if (obj == c2463q) {
                return c2463q;
            }
            AbstractC4568q abstractC4568q2 = (AbstractC4568q) ((AbstractC4553b) obj);
            if (abstractC4568q2 == null) {
                abstractC4568q2 = (AbstractC4568q) interfaceC1235p.invoke(Long.valueOf(abstractC4568q.f15053c + 1), abstractC4568q);
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC4568q, null, abstractC4568q2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC4568q) != null) {
                        break;
                    }
                }
                if (abstractC4568q.mo8996c()) {
                    abstractC4568q.m8997d();
                }
            }
            abstractC4568q = abstractC4568q2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final AbstractC4568q m8984c(Object obj) {
        if (obj != f15013a) {
            return (AbstractC4568q) obj;
        }
        C2104o.m5276A("Does not contain segment");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m8985d(Throwable th2, InterfaceC5561g interfaceC5561g) {
        Throwable runtimeException;
        Iterator it = AbstractC4555d.f15023a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC3595r) it.next()).mo4455m(th2, interfaceC5561g);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    AbstractC0063p.m412e(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC0063p.m412e(th2, new C4556e(interfaceC5561g));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m8986e(Object obj) {
        return obj == f15013a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final Object m8987f(Object obj, Object obj2) {
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
    public static final void m8988g(InterfaceC5561g interfaceC5561g, Object obj) {
        if (obj == f15016d) {
            return;
        }
        if (!(obj instanceof C4573v)) {
            Object objMo2061k = interfaceC5561g.mo2061k(f15018f, null);
            objMo2061k.getClass();
            Trace.endSection();
            return;
        }
        C4573v c4573v = (C4573v) obj;
        AbstractC1866o2[] abstractC1866o2Arr = c4573v.f15061c;
        int length = abstractC1866o2Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i9 = length - 1;
            abstractC1866o2Arr[length].getClass();
            Trace.endSection();
            if (i9 < 0) {
                return;
            } else {
                length = i9;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8989h(Object obj, InterfaceC5557c interfaceC5557c) {
        InterfaceC3596r0 interfaceC3596r0;
        if (!(interfaceC5557c instanceof C4557f)) {
            interfaceC5557c.resumeWith(obj);
            return;
        }
        C4557f c4557f = (C4557f) interfaceC5557c;
        AbstractC3591p abstractC3591p = c4557f.f15026j;
        AbstractC6038c abstractC6038c = c4557f.f15027k;
        Throwable thM8182b = C3960g.m8182b(obj);
        Object c3585n = thM8182b == null ? obj : new C3585n(thM8182b, false);
        if (abstractC3591p.mo7542x(abstractC6038c.getContext())) {
            c4557f.f15028l = c3585n;
            c4557f.f11551i = 1;
            abstractC3591p.mo7538w(abstractC6038c.getContext(), c4557f);
            return;
        }
        AbstractC3565g0 abstractC3565g0M7527a = AbstractC3569h1.m7527a();
        if (abstractC3565g0M7527a.f11569i >= 4294967296L) {
            c4557f.f15028l = c3585n;
            c4557f.f11551i = 1;
            abstractC3565g0M7527a.m7522A(c4557f);
            return;
        }
        abstractC3565g0M7527a.m7523B(true);
        try {
            interfaceC3596r0 = (InterfaceC3596r0) abstractC6038c.getContext().mo2062s(C3593q.f11607h);
        } finally {
            try {
            } finally {
            }
        }
        if (interfaceC3596r0 == null || interfaceC3596r0.mo7486b()) {
            Object obj2 = c4557f.f15029m;
            InterfaceC5561g context = abstractC6038c.getContext();
            Object objM8993l = m8993l(context, obj2);
            C3584m1 c3584m1M7569w = objM8993l != f15016d ? AbstractC3603v.m7569w(abstractC6038c, context, objM8993l) : null;
            try {
                abstractC6038c.resumeWith(obj);
            } finally {
                if (c3584m1M7569w == null || c3584m1M7569w.m7540d0()) {
                    m8988g(context, objM8993l);
                }
            }
        }
        c4557f.resumeWith(AbstractC1089i.m2785q(interfaceC3596r0.mo7489h()));
        while (abstractC3565g0M7527a.m7525D()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final long m8990i(String str, long j3, long j4, long j5) {
        String property;
        int i9 = AbstractC4570s.f15055a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j3;
        }
        Long lM6743g0 = AbstractC3156t.m6743g0(property);
        if (lM6743g0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM6743g0.longValue();
        if (j4 <= jLongValue && jLongValue <= j5) {
            return jLongValue;
        }
        StringBuilder sbM2259v = AbstractC0921a.m2259v("System property '", str, "' should be in range ", j4);
        AbstractC2091b.m5172s(sbM2259v, "..", j5, ", but is '");
        sbM2259v.append(jLongValue);
        sbM2259v.append('\'');
        throw new IllegalStateException(sbM2259v.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m8991j(int i9, int i10, String str) {
        return (int) m8990i(str, i9, 1, (i10 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final Object m8992k(InterfaceC5561g interfaceC5561g) {
        Object objMo2061k = interfaceC5561g.mo2061k(f15017e, 0);
        objMo2061k.getClass();
        return objMo2061k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final Object m8993l(InterfaceC5561g interfaceC5561g, Object obj) {
        if (obj == null) {
            obj = m8992k(interfaceC5561g);
        }
        if (obj == 0) {
            return f15016d;
        }
        if (obj instanceof Integer) {
            return interfaceC5561g.mo2061k(f15019g, new C4573v(((Number) obj).intValue(), interfaceC5561g));
        }
        Trace.beginSection(null);
        return C3967n.f12976a;
    }
}
