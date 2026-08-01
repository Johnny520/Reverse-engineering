package p007B0;

import android.os.Build;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import com.bumptech.glide.AbstractC1926h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import p000A.C0066i0;
import p002A1.AbstractC0116E;
import p002A1.AbstractC0122K;
import p002A1.AbstractC0142o;
import p002A1.C0115D;
import p002A1.C0120I;
import p002A1.C0126O;
import p002A1.InterfaceC0124M;
import p011B4.AbstractC0231b;
import p014C1.C0240b;
import p019D1.AbstractC0261b;
import p019D1.C0262c;
import p027E4.AbstractC0300N;
import p027E4.C0314b;
import p027E4.C0316c;
import p027E4.ExecutorC0312a;
import p029F0.InterfaceC0430v;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p048I1.C0780e;
import p061L2.AbstractC0973m;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p117X2.AbstractC1678w;
import p117X2.C1660e;
import p118X3.C1708r;
import p118X3.C1709s;
import p118X3.C1714x;
import p118X3.C1715y;
import p118X3.InterfaceC1694d;
import p119Y.C1727k;
import p121Y1.C1753n;
import p123Y3.AbstractC1776g;
import p123Y3.ThreadFactoryC1775f;
import p127Z2.AbstractC1784a;
import p132a3.C1804d;
import p136b0.C1843e;
import p138b4.C1869n;
import p138b4.RunnableC1866k;
import p154e2.C2029h;
import p169h0.InterfaceC2207p;
import p173h4.AbstractC2263d;
import p175i0.C2275j;
import p175i0.InterfaceC2272g;
import p176i1.C2307w;
import p197m.AbstractC2542b;
import p197m.C2531P;
import p197m.C2532Q;
import p203n.AbstractC2670o;
import p203n.InterfaceC2662j0;
import p203n.InterfaceC2678w;
import p208n4.InterfaceC2720s;
import p208n4.InterfaceC2721t;
import p208n4.InterfaceC2722u;
import p215o4.C2804c;
import p215o4.C2805d;

/* JADX INFO: renamed from: B0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0173F implements InterfaceC2272g, InterfaceC2662j0, InterfaceC2721t {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f611d;

    /* JADX INFO: renamed from: e */
    public Object f612e;

    /* JADX INFO: renamed from: f */
    public Object f613f;

    /* JADX INFO: renamed from: g */
    public Object f614g;

    /* JADX INFO: renamed from: h */
    public Object f615h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0173F(int i5, Object obj) {
        this.f611d = i5;
        this.f612e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m246l(C0173F c0173f, RunnableC1866k runnableC1866k, C1869n c1869n, RunnableC1866k runnableC1866k2, int i5) {
        C0066i0 c0066i0;
        if ((i5 & 1) != 0) {
            runnableC1866k = null;
        }
        if ((i5 & 2) != 0) {
            c1869n = null;
        }
        if ((i5 & 4) != 0) {
            runnableC1866k2 = null;
        }
        c0173f.getClass();
        TimeZone timeZone = AbstractC1776g.f6076a;
        boolean zIsShutdown = ((ThreadPoolExecutor) c0173f.m251f()).isShutdown();
        synchronized (c0173f) {
            if (c1869n != null) {
                try {
                    if (!((ArrayDeque) c0173f.f615h).remove(c1869n)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (runnableC1866k2 != null) {
                runnableC1866k2.f6322e.decrementAndGet();
                if (!((ArrayDeque) c0173f.f614g).remove(runnableC1866k2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (runnableC1866k != null) {
                ((ArrayDeque) c0173f.f613f).add(runnableC1866k);
                RunnableC1866k runnableC1866kM252g = c0173f.m252g(runnableC1866k.f6323f.f6327e.f5712a.f5871d);
                if (runnableC1866kM252g != null) {
                    runnableC1866k.f6322e = runnableC1866kM252g.f6322e;
                }
            }
            if ((c1869n != null || runnableC1866k2 != null) && (zIsShutdown || ((ArrayDeque) c0173f.f614g).isEmpty())) {
                ((ArrayDeque) c0173f.f615h).isEmpty();
            }
            int i6 = 29;
            if (zIsShutdown) {
                List listM2024e0 = AbstractC0973m.m2024e0((ArrayDeque) c0173f.f613f);
                ((ArrayDeque) c0173f.f613f).clear();
                c0066i0 = new C0066i0(i6, listM2024e0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) c0173f.f613f).iterator();
                AbstractC1665j.m2984d(it, "iterator(...)");
                while (it.hasNext()) {
                    RunnableC1866k runnableC1866k3 = (RunnableC1866k) it.next();
                    if (((ArrayDeque) c0173f.f614g).size() >= 64) {
                        break;
                    }
                    if (runnableC1866k3.f6322e.get() < 5) {
                        it.remove();
                        runnableC1866k3.f6322e.incrementAndGet();
                        arrayList.add(runnableC1866k3);
                        ((ArrayDeque) c0173f.f614g).add(runnableC1866k3);
                    }
                }
                c0066i0 = new C0066i0(i6, arrayList);
            }
        }
        int size = ((List) c0066i0.f297e).size();
        boolean z5 = true;
        for (int i7 = 0; i7 < size; i7++) {
            RunnableC1866k runnableC1866k4 = (RunnableC1866k) ((List) c0066i0.f297e).get(i7);
            if (runnableC1866k4 == runnableC1866k) {
                z5 = false;
            } else {
                runnableC1866k4.f6323f.f6329g.getClass();
            }
            if (zIsShutdown) {
                runnableC1866k4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                runnableC1866k4.f6323f.m3355l(interruptedIOException);
                runnableC1866k4.f6321d.m52u(interruptedIOException);
            } else {
                ExecutorService executorServiceM251f = c0173f.m251f();
                runnableC1866k4.getClass();
                C1869n c1869n2 = runnableC1866k4.f6323f;
                AbstractC1665j.m2985e(c1869n2.f6326d.f5917a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceM251f).execute(runnableC1866k4);
                    } catch (RejectedExecutionException e5) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e5);
                        runnableC1866k4.f6323f.m3355l(interruptedIOException2);
                        runnableC1866k4.f6321d.m52u(interruptedIOException2);
                        C0173F c0173f2 = c1869n2.f6326d.f5917a;
                        c0173f2.getClass();
                        m246l(c0173f2, null, null, runnableC1866k4, 3);
                    }
                } catch (Throwable th2) {
                    C0173F c0173f3 = c1869n2.f6326d.f5917a;
                    c0173f3.getClass();
                    m246l(c0173f3, null, null, runnableC1866k4, 3);
                    throw th2;
                }
            }
        }
        if (!z5 || runnableC1866k == null) {
            return;
        }
        runnableC1866k.f6323f.f6329g.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: b */
    public long mo247b(AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        int iMo4625b = abstractC2670o.mo4625b();
        long jMax = 0;
        for (int i5 = 0; i5 < iMo4625b; i5++) {
            jMax = Math.max(jMax, ((C1753n) this.f612e).m3108B(i5).mo4637d(abstractC2670o.mo4624a(i5), abstractC2670o2.mo4624a(i5), abstractC2670o3.mo4624a(i5)));
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m248c(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        C1708r c1708r = new C1708r();
        c1708r.m3045c(null, str);
        C1709s c1709sM3043a = c1708r.m3043a();
        if ("".equals(c1709sM3043a.f5873f.get(r0.size() - 1))) {
            this.f613f = c1709sM3043a;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + c1709sM3043a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public C0240b m249d() {
        ArrayList arrayList = (ArrayList) this.f614g;
        if (((C1709s) this.f613f) == null) {
            throw new IllegalStateException("Base URL required.");
        }
        Object c1715y = (InterfaceC1694d) this.f612e;
        if (c1715y == null) {
            c1715y = new C1715y(new C1714x());
        }
        ExecutorC0312a executorC0312a = AbstractC0300N.f960a;
        C0314b c0314b = AbstractC0300N.f962c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f615h);
        List listMo529b = c0314b.mo529b(executorC0312a);
        arrayList2.addAll(listMo529b);
        List listMo530c = c0314b.mo530c();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + listMo530c.size());
        arrayList3.add(new C0316c(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listMo530c);
        C1709s c1709s = (C1709s) this.f613f;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        listMo529b.size();
        C0240b c0240b = new C0240b();
        c0240b.f808a = new ConcurrentHashMap();
        c0240b.f809b = c1715y;
        c0240b.f810c = c1709s;
        c0240b.f811d = listUnmodifiableList;
        c0240b.f812e = listUnmodifiableList2;
        return c0240b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: e */
    public void m250e(C0200n c0200n, boolean z5) {
        C0174G c0174g = (C0174G) this.f615h;
        ?? r12 = c0200n.f696a;
        int size = r12.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((C0209w) r12.get(i5)).m321b()) {
                m260t(c0200n);
                return;
            }
        }
        InterfaceC0430v interfaceC0430v = (InterfaceC0430v) this.f612e;
        if (interfaceC0430v == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        AbstractC0208v.m318h(c0200n, interfaceC0430v.mo638R(0L), new C0171D(0, this, c0174g), false);
        if (((EnumC0170C) this.f613f) == EnumC0170C.f603e) {
            if (z5) {
                int size2 = r12.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((C0209w) r12.get(i6)).m320a();
                }
            }
            C2029h c2029h = c0200n.f697b;
            if (c2029h != null) {
                c2029h.f6762e = !c0174g.f618c;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public synchronized ExecutorService m251f() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f612e) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = AbstractC1776g.f6077b + " Dispatcher";
                AbstractC1665j.m2985e(str, "name");
                this.f612e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC1775f(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f612e;
            AbstractC1665j.m2982b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public RunnableC1866k m252g(String str) {
        Iterator it = ((ArrayDeque) this.f614g).iterator();
        AbstractC1665j.m2984d(it, "iterator(...)");
        while (it.hasNext()) {
            RunnableC1866k runnableC1866k = (RunnableC1866k) it.next();
            if (AbstractC1665j.m2981a(runnableC1866k.f6323f.f6327e.f5712a.f5871d, str)) {
                return runnableC1866k;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f613f).iterator();
        AbstractC1665j.m2984d(it2, "iterator(...)");
        while (it2.hasNext()) {
            RunnableC1866k runnableC1866k2 = (RunnableC1866k) it2.next();
            if (AbstractC1665j.m2981a(runnableC1866k2.f6323f.f6327e.f5712a.f5871d, str)) {
                return runnableC1866k2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public C1804d m253h() {
        Matcher matcher = (Matcher) this.f612e;
        return AbstractC1926h.m3557J(matcher.start(), matcher.end());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public AbstractC2670o m254i(long j5, AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2) {
        if (((AbstractC2670o) this.f614g) == null) {
            this.f614g = abstractC2670o.mo4626c();
        }
        AbstractC2670o abstractC2670o3 = (AbstractC2670o) this.f614g;
        if (abstractC2670o3 == null) {
            AbstractC1665j.m2991k("velocityVector");
            throw null;
        }
        int iMo4625b = abstractC2670o3.mo4625b();
        for (int i5 = 0; i5 < iMo4625b; i5++) {
            AbstractC2670o abstractC2670o4 = (AbstractC2670o) this.f614g;
            if (abstractC2670o4 == null) {
                AbstractC1665j.m2991k("velocityVector");
                throw null;
            }
            C1753n c1753n = (C1753n) this.f612e;
            abstractC2670o.getClass();
            long j6 = j5 / 1000000;
            C2531P c2531pM4470a = ((C2532Q) c1753n.f6028e).m4470a(abstractC2670o2.mo4624a(i5));
            long j7 = c2531pM4470a.f8096c;
            abstractC2670o4.mo4628e((((Math.signum(c2531pM4470a.f8094a) * AbstractC2542b.m4473a(j7 > 0 ? j6 / j7 : 1.0f).f8113b) * c2531pM4470a.f8095b) / j7) * 1000.0f, i5);
        }
        AbstractC2670o abstractC2670o5 = (AbstractC2670o) this.f614g;
        if (abstractC2670o5 != null) {
            return abstractC2670o5;
        }
        AbstractC1665j.m2991k("velocityVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public AbstractC0122K m255j(C1660e c1660e, String str) {
        AbstractC0122K abstractC0122K;
        boolean zIsInstance;
        AbstractC0122K abstractC0122KMo168a;
        AbstractC1665j.m2985e(str, "key");
        synchronized (((C0115D) this.f615h)) {
            try {
                C0126O c0126o = (C0126O) this.f612e;
                c0126o.getClass();
                abstractC0122K = (AbstractC0122K) c0126o.f518a.get(str);
                Class clsM3239y = c1660e.f5699a;
                AbstractC1665j.m2985e(clsM3239y, "jClass");
                Map map = C1660e.f5698b;
                AbstractC1665j.m2983c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                Integer num = (Integer) map.get(clsM3239y);
                if (num != null) {
                    zIsInstance = AbstractC1678w.m2999c(num.intValue(), abstractC0122K);
                } else {
                    if (clsM3239y.isPrimitive()) {
                        clsM3239y = AbstractC1784a.m3239y(AbstractC1676u.m2995a(clsM3239y));
                    }
                    zIsInstance = clsM3239y.isInstance(abstractC0122K);
                }
                if (zIsInstance) {
                    InterfaceC0124M interfaceC0124M = (InterfaceC0124M) this.f613f;
                    if (interfaceC0124M instanceof C0120I) {
                        C0120I c0120i = (C0120I) interfaceC0124M;
                        AbstractC1665j.m2982b(abstractC0122K);
                        AbstractC0142o abstractC0142o = c0120i.f509d;
                        if (abstractC0142o != null) {
                            C0780e c0780e = c0120i.f510e;
                            AbstractC1665j.m2982b(c0780e);
                            AbstractC0116E.m159a(abstractC0122K, c0780e, abstractC0142o);
                        }
                    }
                    AbstractC1665j.m2983c(abstractC0122K, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    C0262c c0262c = new C0262c((AbstractC0261b) this.f614g);
                    c0262c.f854a.put(AbstractC0116E.f498d, str);
                    InterfaceC0124M interfaceC0124M2 = (InterfaceC0124M) this.f613f;
                    try {
                        try {
                            abstractC0122KMo168a = interfaceC0124M2.mo149b(c1660e, c0262c);
                        } catch (AbstractMethodError unused) {
                            abstractC0122KMo168a = interfaceC0124M2.mo169c(AbstractC1784a.m3238x(c1660e), c0262c);
                        }
                    } catch (AbstractMethodError unused2) {
                        abstractC0122KMo168a = interfaceC0124M2.mo168a(AbstractC1784a.m3238x(c1660e));
                    }
                    abstractC0122K = abstractC0122KMo168a;
                    C0126O c0126o2 = (C0126O) this.f612e;
                    c0126o2.getClass();
                    AbstractC1665j.m2985e(abstractC0122K, "viewModel");
                    AbstractC0122K abstractC0122K2 = (AbstractC0122K) c0126o2.f518a.put(str, abstractC0122K);
                    if (abstractC0122K2 != null) {
                        abstractC0122K2.m173a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC0122K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: m */
    public AbstractC2670o mo256m(AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        if (((AbstractC2670o) this.f615h) == null) {
            this.f615h = abstractC2670o3.mo4626c();
        }
        AbstractC2670o abstractC2670o4 = (AbstractC2670o) this.f615h;
        if (abstractC2670o4 == null) {
            AbstractC1665j.m2991k("endVelocityVector");
            throw null;
        }
        int iMo4625b = abstractC2670o4.mo4625b();
        for (int i5 = 0; i5 < iMo4625b; i5++) {
            AbstractC2670o abstractC2670o5 = (AbstractC2670o) this.f615h;
            if (abstractC2670o5 == null) {
                AbstractC1665j.m2991k("endVelocityVector");
                throw null;
            }
            abstractC2670o5.mo4628e(((C1753n) this.f612e).m3108B(i5).mo4638e(abstractC2670o.mo4624a(i5), abstractC2670o2.mo4624a(i5), abstractC2670o3.mo4624a(i5)), i5);
        }
        AbstractC2670o abstractC2670o6 = (AbstractC2670o) this.f615h;
        if (abstractC2670o6 != null) {
            return abstractC2670o6;
        }
        AbstractC1665j.m2991k("endVelocityVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m257n() {
        try {
            AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
            if (Build.FINGERPRINT != null) {
                throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            }
            throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
        } catch (Throwable th) {
            ((CountDownLatch) this.f613f).countDown();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: o */
    public AbstractC2670o mo258o(long j5, AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        if (((AbstractC2670o) this.f614g) == null) {
            this.f614g = abstractC2670o3.mo4626c();
        }
        AbstractC2670o abstractC2670o4 = (AbstractC2670o) this.f614g;
        if (abstractC2670o4 == null) {
            AbstractC1665j.m2991k("velocityVector");
            throw null;
        }
        int iMo4625b = abstractC2670o4.mo4625b();
        for (int i5 = 0; i5 < iMo4625b; i5++) {
            AbstractC2670o abstractC2670o5 = (AbstractC2670o) this.f614g;
            if (abstractC2670o5 == null) {
                AbstractC1665j.m2991k("velocityVector");
                throw null;
            }
            abstractC2670o5.mo4628e(((C1753n) this.f612e).m3108B(i5).mo4636c(j5, abstractC2670o.mo4624a(i5), abstractC2670o2.mo4624a(i5), abstractC2670o3.mo4624a(i5)), i5);
        }
        AbstractC2670o abstractC2670o6 = (AbstractC2670o) this.f614g;
        if (abstractC2670o6 != null) {
            return abstractC2670o6;
        }
        AbstractC1665j.m2991k("velocityVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2721t
    /* JADX INFO: renamed from: p */
    public InterfaceC2720s mo47p() {
        return (C2804c) this.f615h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2721t
    /* JADX INFO: renamed from: q */
    public InterfaceC2722u mo48q() {
        return (C2805d) this.f614g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: r */
    public AbstractC2670o mo259r(long j5, AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        if (((AbstractC2670o) this.f613f) == null) {
            this.f613f = abstractC2670o.mo4626c();
        }
        AbstractC2670o abstractC2670o4 = (AbstractC2670o) this.f613f;
        if (abstractC2670o4 == null) {
            AbstractC1665j.m2991k("valueVector");
            throw null;
        }
        int iMo4625b = abstractC2670o4.mo4625b();
        for (int i5 = 0; i5 < iMo4625b; i5++) {
            AbstractC2670o abstractC2670o5 = (AbstractC2670o) this.f613f;
            if (abstractC2670o5 == null) {
                AbstractC1665j.m2991k("valueVector");
                throw null;
            }
            abstractC2670o5.mo4628e(((C1753n) this.f612e).m3108B(i5).mo4635b(j5, abstractC2670o.mo4624a(i5), abstractC2670o2.mo4624a(i5), abstractC2670o3.mo4624a(i5)), i5);
        }
        AbstractC2670o abstractC2670o6 = (AbstractC2670o) this.f613f;
        if (abstractC2670o6 != null) {
            return abstractC2670o6;
        }
        AbstractC1665j.m2991k("valueVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public void m260t(C0200n c0200n) {
        if (((EnumC0170C) this.f613f) == EnumC0170C.f603e) {
            InterfaceC0430v interfaceC0430v = (InterfaceC0430v) this.f612e;
            if (interfaceC0430v == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            AbstractC0208v.m318h(c0200n, interfaceC0430v.mo638R(0L), new C0172E(0, (C0174G) this.f615h), true);
        }
        this.f613f = EnumC0170C.f604f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f611d) {
            case 10:
                String string = ((Socket) this.f612e).toString();
                AbstractC1665j.m2984d(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0173F(C0126O c0126o, InterfaceC0124M interfaceC0124M, AbstractC0261b abstractC0261b) {
        this.f611d = 1;
        AbstractC1665j.m2985e(c0126o, "store");
        AbstractC1665j.m2985e(abstractC0261b, "defaultExtras");
        this.f612e = c0126o;
        this.f613f = interfaceC0124M;
        this.f614g = abstractC0261b;
        this.f615h = new C0115D(9);
    }

    public C0173F(Socket socket) {
        this.f611d = 10;
        this.f612e = socket;
        this.f613f = new AtomicInteger();
        this.f614g = new C2805d(this);
        this.f615h = new C2804c(this);
    }

    public C0173F(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, C2275j c2275j) {
        this.f611d = 6;
        this.f612e = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f613f = c2275j;
        AutofillManager autofillManager = (AutofillManager) viewTreeObserverOnGlobalLayoutListenerC0772y.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f614g = autofillManager;
            viewTreeObserverOnGlobalLayoutListenerC0772y.setImportantForAutofill(1);
            AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0772y.getAutofillId();
            if (autofillId != null) {
                this.f615h = autofillId;
                return;
            }
            throw AbstractC0231b.m396g("Required value was null.");
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }

    public C0173F(C0174G c0174g) {
        this.f611d = 0;
        this.f615h = c0174g;
        this.f613f = EnumC0170C.f602d;
    }

    public C0173F(Matcher matcher, CharSequence charSequence) {
        this.f611d = 5;
        AbstractC1665j.m2985e(charSequence, "input");
        this.f612e = matcher;
        this.f613f = charSequence;
        this.f614g = new C1727k(1, this);
    }

    public C0173F(int i5) {
        this.f611d = i5;
        switch (i5) {
            case 4:
                this.f613f = new ArrayDeque();
                this.f614g = new ArrayDeque();
                this.f615h = new ArrayDeque();
                break;
            case 7:
                this.f611d = 7;
                this.f612e = new AtomicBoolean(false);
                this.f613f = new CountDownLatch(1);
                this.f615h = "PublicSuffixDatabase.list";
                break;
            case 11:
                this.f612e = new ReentrantReadWriteLock();
                this.f614g = new HashMap();
                break;
            default:
                this.f614g = new ArrayList();
                this.f615h = new ArrayList();
                break;
        }
    }

    public C0173F(InterfaceC1599a interfaceC1599a, InterfaceC2207p interfaceC2207p, C2307w c2307w, C1843e c1843e) {
        this.f611d = 3;
        this.f612e = interfaceC1599a;
        this.f613f = interfaceC2207p;
        this.f614g = c2307w;
        this.f615h = c1843e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0173F(InterfaceC2678w interfaceC2678w) {
        this(8, new C1753n(17, interfaceC2678w));
        this.f611d = 8;
    }
}
