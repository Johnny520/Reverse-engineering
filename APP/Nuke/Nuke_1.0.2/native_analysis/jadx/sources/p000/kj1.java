package p000;

import android.content.ContentResolver;
import android.os.Build;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class kj1 implements InterfaceC0544oi, ys2, hi2, h01, aa3 {

    /* JADX INFO: renamed from: m */
    public static final i51 f5591m = new i51(5);

    /* JADX INFO: renamed from: n */
    public static final b83 f5592n = new b83(2);

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5593h;

    /* JADX INFO: renamed from: i */
    public Object f5594i;

    /* JADX INFO: renamed from: j */
    public Object f5595j;

    /* JADX INFO: renamed from: k */
    public Object f5596k;

    /* JADX INFO: renamed from: l */
    public Object f5597l;

    public kj1(int i) {
        this.f5593h = i;
        switch (i) {
            case 4:
                this.f5594i = new AtomicBoolean(false);
                this.f5595j = new CountDownLatch(1);
                this.f5597l = "PublicSuffixDatabase.list";
                break;
            case 5:
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
            case 8:
            case 9:
            default:
                this.f5594i = new ReentrantReadWriteLock();
                this.f5596k = new HashMap();
                break;
            case 7:
                this.f5595j = new ArrayDeque();
                this.f5596k = new ArrayDeque();
                this.f5597l = new ArrayDeque();
                break;
            case 10:
                uc3 uc3Var = AbstractC0731te.f10696h;
                hn1 hn1Var = new hn1(2);
                fq1 fq1Var = fq1.f3109o;
                C0645r6 c0645r6 = new C0645r6(0, pp1.f8445a, pp1.class, "isSecurityMode", "isSecurityMode()Z", 0, 0, 4);
                this.f5594i = uc3Var;
                this.f5595j = hn1Var;
                this.f5596k = fq1Var;
                this.f5597l = c0645r6;
                break;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m2696H(kj1 kj1Var, p52 p52Var, s52 s52Var, p52 p52Var2, int i) {
        C0485n4 c0485n4;
        if ((i & 1) != 0) {
            p52Var = null;
        }
        if ((i & 2) != 0) {
            s52Var = null;
        }
        if ((i & 4) != 0) {
            p52Var2 = null;
        }
        kj1Var.getClass();
        TimeZone timeZone = wg3.f12507a;
        boolean zIsShutdown = ((ThreadPoolExecutor) kj1Var.m2711p()).isShutdown();
        synchronized (kj1Var) {
            if (s52Var != null) {
                try {
                    if (!((ArrayDeque) kj1Var.f5597l).remove(s52Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (p52Var2 != null) {
                p52Var2.f7983i.decrementAndGet();
                if (!((ArrayDeque) kj1Var.f5596k).remove(p52Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (p52Var != null) {
                ((ArrayDeque) kj1Var.f5595j).add(p52Var);
                p52 p52VarM2712u = kj1Var.m2712u(p52Var.f7984j.f9914i.f5390a.f13644d);
                if (p52VarM2712u != null) {
                    p52Var.f7983i = p52VarM2712u.f7983i;
                }
            }
            if ((s52Var != null || p52Var2 != null) && (zIsShutdown || ((ArrayDeque) kj1Var.f5596k).isEmpty())) {
                ((ArrayDeque) kj1Var.f5597l).isEmpty();
            }
            int i2 = 13;
            if (zIsShutdown) {
                List listM1148F0 = AbstractC0142du.m1148F0((ArrayDeque) kj1Var.f5595j);
                ((ArrayDeque) kj1Var.f5595j).clear();
                c0485n4 = new C0485n4(i2, listM1148F0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) kj1Var.f5595j).iterator();
                it.getClass();
                while (it.hasNext()) {
                    p52 p52Var3 = (p52) it.next();
                    if (((ArrayDeque) kj1Var.f5596k).size() >= 64) {
                        break;
                    }
                    if (p52Var3.f7983i.get() < 5) {
                        it.remove();
                        p52Var3.f7983i.incrementAndGet();
                        arrayList.add(p52Var3);
                        ((ArrayDeque) kj1Var.f5596k).add(p52Var3);
                    }
                }
                c0485n4 = new C0485n4(i2, arrayList);
            }
        }
        int size = ((List) c0485n4.f6983i).size();
        boolean z = true;
        for (int i3 = 0; i3 < size; i3++) {
            p52 p52Var4 = (p52) ((List) c0485n4.f6983i).get(i3);
            if (p52Var4 == p52Var) {
                z = false;
            } else {
                p52Var4.f7984j.f9916k.getClass();
            }
            if (zIsShutdown) {
                p52Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                s52 s52Var2 = p52Var4.f7984j;
                s52Var2.m4736l(interruptedIOException);
                p52Var4.f7982h.mo1066j(s52Var2, interruptedIOException);
            } else {
                ExecutorService executorServiceM2711p = kj1Var.m2711p();
                p52Var4.getClass();
                s52 s52Var3 = p52Var4.f7984j;
                s52Var3.f9913h.f2600a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceM2711p).execute(p52Var4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        s52 s52Var4 = p52Var4.f7984j;
                        s52Var4.m4736l(interruptedIOException2);
                        p52Var4.f7982h.mo1066j(s52Var4, interruptedIOException2);
                        kj1 kj1Var2 = s52Var3.f9913h.f2600a;
                        kj1Var2.getClass();
                        m2696H(kj1Var2, null, null, p52Var4, 3);
                    }
                } catch (Throwable th2) {
                    kj1 kj1Var3 = s52Var3.f9913h.f2600a;
                    kj1Var3.getClass();
                    m2696H(kj1Var3, null, null, p52Var4, 3);
                    throw th2;
                }
            }
        }
        if (!z || p52Var == null) {
            return;
        }
        p52Var.f7984j.f9916k.getClass();
    }

    /* JADX INFO: renamed from: A */
    public AbstractC0494nd m2697A(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2) {
        if (((AbstractC0494nd) this.f5596k) == null) {
            this.f5596k = abstractC0494nd.mo2479c();
        }
        AbstractC0494nd abstractC0494nd3 = (AbstractC0494nd) this.f5596k;
        if (abstractC0494nd3 == null) {
            t11.m5067S("velocityVector");
            throw null;
        }
        int iMo2478b = abstractC0494nd3.mo2478b();
        int i = 0;
        while (true) {
            AbstractC0494nd abstractC0494nd4 = (AbstractC0494nd) this.f5596k;
            if (i >= iMo2478b) {
                if (abstractC0494nd4 != null) {
                    return abstractC0494nd4;
                }
                t11.m5067S("velocityVector");
                throw null;
            }
            if (abstractC0494nd4 == null) {
                t11.m5067S("velocityVector");
                throw null;
            }
            hh1 hh1Var = (hh1) this.f5594i;
            abstractC0494nd.getClass();
            long j2 = j / 1000000;
            nj0 nj0VarM3569a = ((oj0) hh1Var.f4019i).m3569a(abstractC0494nd2.mo2477a(i));
            long j3 = nj0VarM3569a.f7181c;
            abstractC0494nd4.mo2481e((((Math.signum(nj0VarM3569a.f7179a) * AbstractC0875x8.m6045a(j3 > 0 ? j2 / j3 : 1.0f).f12392b) * nj0VarM3569a.f7180b) / j3) * 1000.0f, i);
            i++;
        }
    }

    /* JADX INFO: renamed from: B */
    public fb3 m2698B(C0067bt c0067bt, String str) {
        fb3 fb3Var;
        fb3 fb3VarMo2139a;
        synchronized (((ix2) this.f5597l)) {
            try {
                fb3Var = (fb3) ((kb3) this.f5594i).f5447a.get(str);
                if (c0067bt.m592d(fb3Var)) {
                    ib3 ib3Var = (ib3) this.f5595j;
                    if (ib3Var instanceof uc2) {
                        uc2 uc2Var = (uc2) ib3Var;
                        fb3Var.getClass();
                        ba1 ba1Var = uc2Var.f11233d;
                        if (ba1Var != null) {
                            qc2 qc2Var = uc2Var.f11234e;
                            qc2Var.getClass();
                            rp0.m4534T(fb3Var, qc2Var, ba1Var);
                        }
                    }
                    fb3Var.getClass();
                } else {
                    wj1 wj1Var = new wj1((s20) this.f5596k);
                    wj1Var.f9877a.put(AbstractC0570p7.f7998g, str);
                    ib3 ib3Var2 = (ib3) this.f5595j;
                    try {
                        try {
                            fb3VarMo2139a = ib3Var2.mo2319c(c0067bt, wj1Var);
                        } catch (AbstractMethodError unused) {
                            fb3VarMo2139a = ib3Var2.mo2139a(p40.m3741y(c0067bt));
                        }
                    } catch (AbstractMethodError unused2) {
                        fb3VarMo2139a = ib3Var2.mo2140b(p40.m3741y(c0067bt), wj1Var);
                    }
                    fb3Var = fb3VarMo2139a;
                    kb3 kb3Var = (kb3) this.f5594i;
                    kb3Var.getClass();
                    fb3Var.getClass();
                    fb3 fb3Var2 = (fb3) kb3Var.f5447a.put(str, fb3Var);
                    if (fb3Var2 != null) {
                        fb3Var2.m1595a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fb3Var;
    }

    /* JADX INFO: renamed from: C */
    public boolean m2699C(th2 th2Var) {
        String str;
        th2Var.getClass();
        if (th2Var.f10782k.m4492a().isEmpty()) {
            return true;
        }
        synchronized (this.f5595j) {
            str = (String) m2700D().get(th2Var.f10774c);
        }
        return t11.m5086l(str, rp0.m4541b0(th2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map m2700D() {
        Object x92Var;
        ow1 ow1Var;
        File file = (File) this.f5594i;
        Map map = (Map) this.f5597l;
        if (map != null) {
            return map;
        }
        try {
            if (file.exists()) {
                v31 v31Var = (v31) this.f5596k;
                String strM5900f0 = wi0.m5900f0(file);
                v31Var.getClass();
                j31 j31Var = (j31) v31Var.m5453a(o31.f7461a, strM5900f0);
                d41 d41Var = j31Var instanceof d41 ? (d41) j31Var : null;
                if (d41Var == null) {
                    x92Var = new LinkedHashMap();
                } else {
                    Set<Map.Entry> setEntrySet = d41Var.f1861h.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : setEntrySet) {
                        String str = (String) entry.getKey();
                        j31 j31Var2 = (j31) entry.getValue();
                        i41 i41Var = j31Var2 instanceof i41 ? (i41) j31Var2 : null;
                        if (i41Var != null) {
                            gz0 gz0Var = l31.f5905a;
                            String strMo2263a = i41Var instanceof z31 ? null : i41Var.mo2263a();
                            ow1Var = strMo2263a != null ? new ow1(str, strMo2263a) : null;
                        }
                        if (ow1Var != null) {
                            arrayList.add(ow1Var);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    we1.m5882w0(arrayList, linkedHashMap);
                    x92Var = linkedHashMap;
                }
            } else {
                x92Var = new LinkedHashMap();
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        Object linkedHashMap2 = x92Var;
        if (thM6237a != null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        Map map2 = (Map) linkedHashMap2;
        this.f5597l = map2;
        return map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v2, types: [x92] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Collection, java.util.LinkedHashSet] */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Set m2701E() {
        ?? x92Var;
        ?? linkedHashSet;
        String strMo2263a;
        File file = (File) this.f5594i;
        Set set = (Set) this.f5597l;
        if (set != null) {
            return set;
        }
        try {
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (file.isFile()) {
            v31 v31Var = (v31) this.f5596k;
            String strM5900f0 = wi0.m5900f0(file);
            v31Var.getClass();
            j31 j31Var = (j31) v31Var.m5453a(o31.f7461a, strM5900f0);
            z21 z21Var = j31Var instanceof z21 ? (z21) j31Var : null;
            if (z21Var == null) {
                linkedHashSet = new LinkedHashSet();
            } else {
                x92Var = new LinkedHashSet();
                for (j31 j31Var2 : z21Var.f13709h) {
                    i41 i41Var = j31Var2 instanceof i41 ? (i41) j31Var2 : null;
                    if (i41Var != null) {
                        gz0 gz0Var = l31.f5905a;
                        strMo2263a = i41Var instanceof z31 ? null : i41Var.mo2263a();
                        if (strMo2263a == null || pv2.m4006s0(strMo2263a)) {
                            strMo2263a = null;
                        }
                    }
                    if (strMo2263a != null) {
                        x92Var.add(strMo2263a);
                    }
                }
                linkedHashSet = x92Var;
            }
        } else {
            linkedHashSet = new LinkedHashSet();
        }
        Throwable thM6237a = y92.m6237a(linkedHashSet);
        ?? linkedHashSet2 = linkedHashSet;
        if (thM6237a != null) {
            linkedHashSet2 = new LinkedHashSet();
        }
        LinkedHashSet linkedHashSet3 = (LinkedHashSet) linkedHashSet2;
        this.f5597l = linkedHashSet3;
        return linkedHashSet3;
    }

    /* JADX INFO: renamed from: F */
    public void m2702F(Map map) throws IOException {
        File file = (File) this.f5594i;
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            C0676s.m4651j("Permission store file must have a parent directory.");
            return;
        }
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            C0676s.m4653l("Unable to create the script permission directory.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            i41 i41VarM2795c = l31.m2795c((String) entry.getValue());
            str.getClass();
            i41VarM2795c.getClass();
        }
        d41 d41Var = new d41(linkedHashMap);
        File fileCreateTempFile = File.createTempFile("perm", ".tmp", parentFile);
        try {
            fileCreateTempFile.getClass();
            wi0.m5902h0(fileCreateTempFile, ((v31) this.f5596k).m5454b(d41.Companion.serializer(), d41Var));
            try {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException unused) {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            this.f5597l = new LinkedHashMap(map);
        } finally {
            fileCreateTempFile.delete();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m2703G(Set set) throws IOException {
        File file = (File) this.f5594i;
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            C0676s.m4651j("Enabled script store file must have a parent directory.");
            return;
        }
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            C0676s.m4653l("Unable to create the enabled script store directory.");
            return;
        }
        List listM1170z0 = AbstractC0142du.m1170z0(set);
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(listM1170z0, 10));
        Iterator it = listM1170z0.iterator();
        while (it.hasNext()) {
            arrayList.add(l31.m2795c((String) it.next()));
        }
        z21 z21Var = new z21(arrayList);
        File fileCreateTempFile = File.createTempFile("script-enabled", ".tmp", parentFile);
        try {
            fileCreateTempFile.getClass();
            wi0.m5902h0(fileCreateTempFile, ((v31) this.f5596k).m5454b(z21.Companion.serializer(), z21Var));
            try {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException unused) {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            this.f5597l = AbstractC0142du.m1152J0(set);
        } finally {
            fileCreateTempFile.delete();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m2704I() {
        try {
            zz1 zz1Var = zz1.f14161a;
            if (Build.FINGERPRINT != null) {
                throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            }
            throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
        } catch (Throwable th) {
            ((CountDownLatch) this.f5595j).countDown();
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m2705J(String str, boolean z) {
        str.getClass();
        synchronized (this.f5595j) {
            try {
                Set setM1152J0 = AbstractC0142du.m1152J0(m2701E());
                if (z ? setM1152J0.add(str) : setM1152J0.remove(str)) {
                    m2703G(setM1152J0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m2706K(h12 h12Var) {
        if (((t12) this.f5595j) == t12.f10490i) {
            c61 c61Var = (c61) this.f5594i;
            if (c61Var == null) {
                C0676s.m4653l("layoutCoordinates not set");
                return;
            } else {
                s11.m4713p0(h12Var, c61Var.mo646M(0L), new C0798v5(17, (u12) this.f5597l), true);
            }
        }
        this.f5595j = t12.f10491j;
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: b */
    public long mo1171b(AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        int iMo2478b = abstractC0494nd.mo2478b();
        long jMax = 0;
        for (int i = 0; i < iMo2478b; i++) {
            jMax = Math.max(jMax, ((hh1) this.f5594i).m2191z(i).mo4879d(abstractC0494nd.mo2477a(i), abstractC0494nd2.mo2477a(i), abstractC0494nd3.mo2477a(i)));
        }
        return jMax;
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: c */
    public void mo176c(j23 j23Var) {
        kt2 kt2Var = j23Var.f4203i;
        oa0 oa0VarM125a = ab2.m125a(j23Var);
        za2 za2Var = j23Var.f4202h;
        AbstractC0147dz abstractC0147dz = j23Var.f2301l;
        int i = za2Var.f13815e;
        int i2 = za2Var.f13811a;
        if (i != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + za2Var.f13815e);
        }
        m2707f((C0898xt) this.f5596k);
        if (za2Var.f13816f) {
            m2707f(new f30(oa0VarM125a, kt2Var, j23Var.f4205k, abstractC0147dz));
            return;
        }
        r72 r72VarM2716y = m2716y();
        s72 s72VarM508c = bb2.m508c(j23Var, r72VarM2716y);
        if ((oa0VarM125a.f7602e || i2 == 43) == (r72VarM2716y != null)) {
            m2707f((i2 != 41 || oa0VarM125a.f7598a == 35) ? new f30(oa0VarM125a, kt2Var, s72VarM508c, abstractC0147dz) : new wq2(oa0VarM125a, kt2Var, s72VarM508c));
        } else {
            c80.m663A("Insn with result/move-result-pseudo mismatch ", j23Var);
        }
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: d */
    public void mo177d(xz1 xz1Var) {
        a40 wq2Var;
        za2 za2Var = xz1Var.f4202h;
        r72 r72Var = xz1Var.f4204j;
        int i = za2Var.f13811a;
        if (i == 54 || i == 56) {
            return;
        }
        kt2 kt2Var = xz1Var.f4203i;
        oa0 oa0VarM125a = ab2.m125a(xz1Var);
        int i2 = za2Var.f13815e;
        if (i2 == 1 || i2 == 2) {
            wq2Var = new wq2(oa0VarM125a, kt2Var, bb2.m508c(xz1Var, r72Var));
        } else {
            if (i2 == 3) {
                return;
            }
            if (i2 != 4) {
                if (i2 != 6) {
                    c80.m667j("shouldn't happen");
                    return;
                }
                wq2Var = new wq2(oa0VarM125a, kt2Var, bb2.m508c(xz1Var, r72Var));
            } else {
                wq2Var = new dy2(oa0VarM125a, kt2Var, bb2.m508c(xz1Var, r72Var), ((C0898xt[]) ((C0043b5) ((bb2) this.f5597l).f764e).f562i)[((C0964zj) this.f5595j).f13927c.m5598f(1)]);
            }
        }
        m2707f(wq2Var);
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: e */
    public void mo178e(wz1 wz1Var) {
        kt2 kt2Var = wz1Var.f4203i;
        AbstractC0147dz abstractC0147dz = wz1Var.f2301l;
        r72 r72Var = wz1Var.f4204j;
        oa0 oa0VarM125a = ab2.m125a(wz1Var);
        za2 za2Var = wz1Var.f4202h;
        int i = za2Var.f13811a;
        if (za2Var.f13815e != 1) {
            c80.m667j("shouldn't happen");
            return;
        }
        if (i != 3) {
            m2707f(new f30(oa0VarM125a, kt2Var, bb2.m508c(wz1Var, r72Var), abstractC0147dz));
            return;
        }
        bb2 bb2Var = (bb2) this.f5597l;
        if (bb2Var.f760a) {
            return;
        }
        m2707f(new wq2(oa0VarM125a, kt2Var, s72.m4747i(r72Var, r72.m4399e((bb2Var.f761b - bb2Var.f762c) + ((g30) abstractC0147dz).f4250h, r72Var.f9420i.mo22a()))));
    }

    /* JADX INFO: renamed from: f */
    public void m2707f(a40 a40Var) {
        ((sd0) ((dq1) this.f5594i).f2147i).m4795a(a40Var);
    }

    /* JADX INFO: renamed from: g */
    public synchronized jh1 m2708g(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (jj1 jj1Var : (ArrayList) this.f5594i) {
                if (((HashSet) this.f5596k).contains(jj1Var)) {
                    z = true;
                } else if (jj1Var.f5059a.isAssignableFrom(cls) && jj1Var.f5060b.isAssignableFrom(cls2)) {
                    ((HashSet) this.f5596k).add(jj1Var);
                    arrayList.add(jj1Var.f5061c.mo1330q(this));
                    ((HashSet) this.f5596k).remove(jj1Var);
                }
            }
            if (arrayList.size() > 1) {
                i51 i51Var = (i51) this.f5595j;
                C0043b5 c0043b5 = (C0043b5) this.f5597l;
                i51Var.getClass();
                return new C0733tg(2, arrayList, c0043b5);
            }
            if (arrayList.size() == 1) {
                return (jh1) arrayList.get(0);
            }
            if (z) {
                return f5592n;
            }
            throw new u72("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.f5596k).clear();
            throw th;
        }
    }

    @Override // p000.h01
    /* JADX INFO: renamed from: h */
    public void mo180h(k23 k23Var) {
        kt2 kt2Var = k23Var.f4203i;
        oa0 oa0VarM125a = ab2.m125a(k23Var);
        if (k23Var.f4202h.f13815e != 6) {
            c80.m667j("shouldn't happen");
            return;
        }
        r72 r72VarM2716y = m2716y();
        if (oa0VarM125a.f7602e != (r72VarM2716y != null)) {
            c80.m663A("Insn with result/move-result-pseudo mismatch", k23Var);
        } else {
            m2707f((C0898xt) this.f5596k);
            m2707f(new wq2(oa0VarM125a, kt2Var, bb2.m508c(k23Var, r72VarM2716y)));
        }
    }

    @Override // p000.hi2
    /* JADX INFO: renamed from: i */
    public Object mo2195i() {
        throw new fi2("NOT_SUPPORTED", "Media download is not supported by the current WeChat adapter.", 8, false);
    }

    @Override // p000.hi2
    /* JADX INFO: renamed from: j */
    public Object mo2196j(zj2 zj2Var) {
        if (((Boolean) ((xm0) this.f5597l).mo6a()).booleanValue()) {
            throw new fi2("MESSAGING_UNAVAILABLE", "Messaging is disabled while security mode is enabled.", 8, false);
        }
        yf2 yf2Var = zj2Var.f13930a;
        String str = yf2Var.f13438a;
        String str2 = yf2Var.f13440c;
        String str3 = yf2Var.f13439b;
        String str4 = yf2Var.f13441d;
        if (!str.equals("wechat")) {
            throw new fi2("NOT_SUPPORTED", "Only the WeChat platform is supported.", 8, false);
        }
        String str5 = (String) ((xm0) this.f5595j).mo6a();
        if (pv2.m4006s0(str5)) {
            throw new fi2("MESSAGING_UNAVAILABLE", "No active WeChat account is available.", 8, true);
        }
        if (!str3.equals(str5)) {
            throw new fi2("NOT_FOUND", "The requested WeChat account is not active.", 8, false);
        }
        if (!pv2.m4006s0(str2)) {
            for (int i = 0; i < str2.length(); i++) {
                if (!Character.isISOControl(str2.charAt(i))) {
                }
            }
            if (!str4.equals(wv2.m6005W(str2, "@chatroom", false) ? "group" : "private")) {
                throw new fi2("INVALID_ARGUMENT", "Conversation type does not match the WeChat conversation.", 8, false);
            }
            if (zj2Var.f13932c != null) {
                throw new fi2("NOT_SUPPORTED", "WeChat quoted replies are not supported yet.", 8, false);
            }
            String strM1165u0 = AbstractC0142du.m1165u0(zj2Var.f13931b, "", null, null, new eq1(this), 30);
            if (pv2.m4006s0(strM1165u0)) {
                throw new fi2("INVALID_ARGUMENT", "Text message content must not be blank.", 8, false);
            }
            try {
                ((uc3) this.f5594i).getClass();
                so2 so2VarM1838l = gd3.m1838l(str2, strM1165u0);
                if (so2VarM1838l instanceof ro2) {
                    return new ak2(((Number) ((xm0) this.f5596k).mo6a()).longValue(), yf2Var);
                }
                if (!(so2VarM1838l instanceof qo2)) {
                    c80.m675s();
                    return null;
                }
                int iOrdinal = ((qo2) so2VarM1838l).f9058a.f5131b.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    throw new fi2("INVALID_ARGUMENT", "WeChat rejected the message input.", 12, false);
                }
                if (iOrdinal == 7) {
                    throw new fi2("SEND_REJECTED", "WeChat did not accept the message task.", 8, true);
                }
                if (iOrdinal == 10 || iOrdinal == 11) {
                    throw new fi2("MESSAGING_UNAVAILABLE", "WeChat messaging is unavailable in the current host version.", 8, true);
                }
                throw new fi2("SEND_FAILED", "WeChat could not send the message.", 8, true);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                throw new fi2("MESSAGING_UNAVAILABLE", "WeChat messaging is unavailable in the current host version.", 8, true);
            }
        }
        throw new fi2("INVALID_ARGUMENT", "Conversation id is invalid.", 8, false);
    }

    @Override // p000.ys2
    /* JADX INFO: renamed from: l */
    public fr2 mo425l() {
        return (f60) this.f5597l;
    }

    /* JADX INFO: renamed from: m */
    public synchronized ArrayList m2709m(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (jj1 jj1Var : (ArrayList) this.f5594i) {
                if (!((HashSet) this.f5596k).contains(jj1Var) && jj1Var.f5059a.isAssignableFrom(cls)) {
                    ((HashSet) this.f5596k).add(jj1Var);
                    arrayList.add(jj1Var.f5061c.mo1330q(this));
                    ((HashSet) this.f5596k).remove(jj1Var);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @Override // p000.ys2
    /* JADX INFO: renamed from: n */
    public ht2 mo427n() {
        return (g60) this.f5596k;
    }

    /* JADX INFO: renamed from: o */
    public void m2710o(h12 h12Var, boolean z) {
        u12 u12Var = (u12) this.f5597l;
        List list = h12Var.f3776a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((o12) list.get(i)).m3464b()) {
                m2706K(h12Var);
                return;
            }
        }
        c61 c61Var = (c61) this.f5594i;
        if (c61Var == null) {
            C0676s.m4653l("layoutCoordinates not set");
            return;
        }
        s11.m4713p0(h12Var, c61Var.mo646M(0L), new C0196fa(7, this, u12Var), false);
        if (((t12) this.f5595j) == t12.f10490i) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((o12) list.get(i2)).m3463a();
                }
            }
            er2 er2Var = h12Var.f3777b;
            if (er2Var != null) {
                er2Var.f2576i = !u12Var.f11058c;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized ExecutorService m2711p() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f5594i) == null) {
                this.f5594i = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new vg3(wg3.f12508b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f5594i;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: q */
    public AbstractC0494nd mo737q(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        if (((AbstractC0494nd) this.f5596k) == null) {
            this.f5596k = abstractC0494nd3.mo2479c();
        }
        AbstractC0494nd abstractC0494nd4 = (AbstractC0494nd) this.f5596k;
        if (abstractC0494nd4 == null) {
            t11.m5067S("velocityVector");
            throw null;
        }
        int iMo2478b = abstractC0494nd4.mo2478b();
        int i = 0;
        while (true) {
            AbstractC0494nd abstractC0494nd5 = (AbstractC0494nd) this.f5596k;
            if (i >= iMo2478b) {
                if (abstractC0494nd5 != null) {
                    return abstractC0494nd5;
                }
                t11.m5067S("velocityVector");
                throw null;
            }
            if (abstractC0494nd5 == null) {
                t11.m5067S("velocityVector");
                throw null;
            }
            abstractC0494nd5.mo2481e(((hh1) this.f5594i).m2191z(i).mo4878c(j, abstractC0494nd.mo2477a(i), abstractC0494nd2.mo2477a(i), abstractC0494nd3.mo2477a(i)), i);
            i++;
        }
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: s */
    public AbstractC0494nd mo739s(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        if (((AbstractC0494nd) this.f5595j) == null) {
            this.f5595j = abstractC0494nd.mo2479c();
        }
        AbstractC0494nd abstractC0494nd4 = (AbstractC0494nd) this.f5595j;
        if (abstractC0494nd4 == null) {
            t11.m5067S("valueVector");
            throw null;
        }
        int iMo2478b = abstractC0494nd4.mo2478b();
        int i = 0;
        while (true) {
            AbstractC0494nd abstractC0494nd5 = (AbstractC0494nd) this.f5595j;
            if (i >= iMo2478b) {
                if (abstractC0494nd5 != null) {
                    return abstractC0494nd5;
                }
                t11.m5067S("valueVector");
                throw null;
            }
            if (abstractC0494nd5 == null) {
                t11.m5067S("valueVector");
                throw null;
            }
            abstractC0494nd5.mo2481e(((hh1) this.f5594i).m2191z(i).mo4877b(j, abstractC0494nd.mo2477a(i), abstractC0494nd2.mo2477a(i), abstractC0494nd3.mo2477a(i)), i);
            i++;
        }
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: t */
    public AbstractC0494nd mo2189t(AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        if (((AbstractC0494nd) this.f5597l) == null) {
            this.f5597l = abstractC0494nd3.mo2479c();
        }
        AbstractC0494nd abstractC0494nd4 = (AbstractC0494nd) this.f5597l;
        if (abstractC0494nd4 == null) {
            t11.m5067S("endVelocityVector");
            throw null;
        }
        int iMo2478b = abstractC0494nd4.mo2478b();
        int i = 0;
        while (true) {
            AbstractC0494nd abstractC0494nd5 = (AbstractC0494nd) this.f5597l;
            if (i >= iMo2478b) {
                if (abstractC0494nd5 != null) {
                    return abstractC0494nd5;
                }
                t11.m5067S("endVelocityVector");
                throw null;
            }
            if (abstractC0494nd5 == null) {
                t11.m5067S("endVelocityVector");
                throw null;
            }
            abstractC0494nd5.mo2481e(((hh1) this.f5594i).m2191z(i).mo4880e(abstractC0494nd.mo2477a(i), abstractC0494nd2.mo2477a(i), abstractC0494nd3.mo2477a(i)), i);
            i++;
        }
    }

    public String toString() {
        switch (this.f5593h) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                String string = ((Socket) this.f5594i).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public p52 m2712u(String str) {
        Iterator it = ((ArrayDeque) this.f5596k).iterator();
        it.getClass();
        while (it.hasNext()) {
            p52 p52Var = (p52) it.next();
            if (t11.m5086l(p52Var.f7984j.f9914i.f5390a.f13644d, str)) {
                return p52Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f5595j).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            p52 p52Var2 = (p52) it2.next();
            if (t11.m5086l(p52Var2.f7984j.f9914i.f5390a.f13644d, str)) {
                return p52Var2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0218, code lost:
    
        r2 = r5.size();
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021e, code lost:
    
        if (r3 >= r2) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0220, code lost:
    
        r5 = (p000.a40) ((java.util.ArrayList) r1.f10059f).get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x022c, code lost:
    
        if ((r5 instanceof p000.dy2) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022f, code lost:
    
        r6 = r5.f46b;
        r7 = (p000.dy2) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023a, code lost:
    
        if (r6.f7601d.mo3318r(r7) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0241, code lost:
    
        if (r6.f7599b != 40) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0243, code lost:
    
        r4 = r1.m4800f(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0247, code lost:
    
        if (r4 == null) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0249, code lost:
    
        ((java.util.ArrayList) r1.f10059f).set(r3, r5.mo64i(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0255, code lost:
    
        p000.c80.m676t("method too long");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025b, code lost:
    
        r5 = r3 + 1;
        r4 = (p000.C0898xt) ((java.util.ArrayList) r1.f10059f).get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0267, code lost:
    
        ((java.util.ArrayList) r1.f10059f).set(r3, new p000.dy2(p000.pa0.f8087I, r7.f47c, p000.s72.f9958j, r7.f2263e));
        ((java.util.ArrayList) r1.f10059f).add(r3, r7.m1209o(r4));
        r2 = r2 + 1;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0289, code lost:
    
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x028b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x028e, code lost:
    
        p000.C0676s.m4653l("unpaired TargetInsn");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0293, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0294, code lost:
    
        p000.C0676s.m4653l("unpaired TargetInsn (dangling)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0299, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2713v() {
        int i;
        int i2;
        int i3;
        int i4;
        oa0[] oa0VarArr;
        s72 s72Var;
        ArrayList arrayList;
        int i5;
        int i6;
        ss0 ss0Var;
        wq2 wq2VarM56h;
        int i7;
        C0970zp c0970zp;
        C0058bk c0058bk;
        int[] iArr;
        int i8;
        Object obj;
        int i9;
        r72 r72Var;
        r72 r72VarM5129e;
        r72 r72VarM5129e2;
        if (((b40) this.f5597l) != null) {
            return;
        }
        sd0 sd0Var = (sd0) this.f5594i;
        int i10 = sd0Var.f10055b;
        if (sd0Var.f10056c >= 0) {
            c80.m676t("already processed");
            return;
        }
        int size = ((ArrayList) sd0Var.f10059f).size();
        oa0[] oa0VarArr2 = new oa0[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            oa0VarArr2[i12] = ((a40) ((ArrayList) sd0Var.f10059f).get(i12)).f46b;
        }
        sd0Var.m4804j(oa0VarArr2);
        int i13 = sd0Var.f10058e;
        do {
            int i14 = ((sd0Var.f10056c + i10) + sd0Var.f10057d) - i13;
            Iterator it = ((ArrayList) sd0Var.f10059f).iterator();
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (it.hasNext()) {
                s72 s72Var2 = ((a40) it.next()).f48d;
                for (int i19 = 0; i19 < s72Var2.f5590i.length; i19++) {
                    r72 r72Var2 = (r72) s72Var2.m2693e(i19);
                    if (r72Var2.m4401f()) {
                        int i20 = r72Var2.f9419h;
                        boolean z = i20 >= i14;
                        if ((i20 & 1) == 0) {
                            if (z) {
                                i16++;
                            } else {
                                i18++;
                            }
                        } else if (z) {
                            i15++;
                        } else {
                            i17++;
                        }
                    }
                }
            }
            if (i15 > i16 && i17 > i18) {
                sd0Var.m4797c();
            } else if (i15 <= i16) {
                if (i17 <= i18) {
                    break;
                }
                sd0Var.m4797c();
                if (i13 != 0 && i16 > i15) {
                    sd0Var.m4796b();
                }
            } else {
                sd0Var.m4796b();
            }
        } while (sd0Var.m4804j(oa0VarArr2));
        int i21 = sd0Var.f10056c;
        ArrayList arrayList2 = (ArrayList) sd0Var.f10059f;
        if (i21 == 0) {
            int size2 = arrayList2.size();
            for (int i22 = 0; i22 < size2; i22++) {
                a40 a40Var = (a40) ((ArrayList) sd0Var.f10059f).get(i22);
                oa0 oa0Var = a40Var.f46b;
                oa0 oa0Var2 = oa0VarArr2[i22];
                if (oa0Var != oa0Var2) {
                    ((ArrayList) sd0Var.f10059f).set(i22, a40Var.mo64i(oa0Var2));
                }
            }
            i = i10;
            i2 = 1;
        } else {
            int size3 = arrayList2.size();
            ArrayList arrayList3 = new ArrayList(size3 * 2);
            ArrayList arrayList4 = new ArrayList();
            int i23 = 0;
            while (i23 < size3) {
                a40 a40VarMo66k = (a40) ((ArrayList) sd0Var.f10059f).get(i23);
                oa0 oa0Var3 = a40VarMo66k.f46b;
                kt2 kt2Var = a40VarMo66k.f47c;
                s72 s72Var3 = a40VarMo66k.f48d;
                oa0 oa0VarM4799e = oa0VarArr2[i23];
                if (oa0VarM4799e != null) {
                    i3 = i10;
                    i4 = size3;
                    oa0VarArr = oa0VarArr2;
                    arrayList = arrayList4;
                    i5 = i23;
                    wq2VarM56h = null;
                    ss0Var = null;
                } else {
                    oa0VarM4799e = sd0Var.m4799e(a40VarMo66k);
                    BitSet bitSetMo3320x = oa0VarM4799e.f7601d.mo3320x(a40VarMo66k);
                    boolean z2 = bitSetMo3320x.get(i11);
                    i3 = i10;
                    boolean z3 = oa0Var3.f7602e;
                    if (z3) {
                        bitSetMo3320x.set(i11);
                    }
                    Object[] objArr = s72Var3.f5590i;
                    i4 = size3;
                    int length = objArr.length - bitSetMo3320x.cardinality();
                    if (length == 0) {
                        oa0VarArr = oa0VarArr2;
                        arrayList = arrayList4;
                        i5 = i23;
                        s72Var = s72.f9958j;
                    } else {
                        oa0VarArr = oa0VarArr2;
                        s72Var = new s72(length);
                        arrayList = arrayList4;
                        i5 = i23;
                        int i24 = 0;
                        for (int i25 = 0; i25 < objArr.length; i25++) {
                            if (!bitSetMo3320x.get(i25)) {
                                s72Var.m2694f(i24, s72Var3.m2693e(i25));
                                i24++;
                            }
                        }
                        if (!s72Var3.f11990h) {
                            i6 = 0;
                            s72Var.f11990h = false;
                        }
                        if (z3) {
                            bitSetMo3320x.set(i6, z2);
                        }
                        ss0Var = s72Var.f5590i.length != 0 ? null : new ss0(kt2Var, s72Var);
                        if (z3 || bitSetMo3320x.get(i6)) {
                            wq2VarM56h = null;
                        } else {
                            r72 r72Var3 = (r72) s72Var3.m2693e(i6);
                            wq2VarM56h = a40.m56h(kt2Var, r72Var3, r72Var3.f9419h == 0 ? r72Var3 : r72.m4399e(i6, r72Var3.f9420i));
                        }
                        a40VarMo66k = a40VarMo66k.mo66k(s72Var3.m4748j(z3, bitSetMo3320x));
                    }
                    i6 = 0;
                    if (z3) {
                    }
                    if (s72Var.f5590i.length != 0) {
                    }
                    if (z3) {
                        wq2VarM56h = null;
                        a40VarMo66k = a40VarMo66k.mo66k(s72Var3.m4748j(z3, bitSetMo3320x));
                    }
                }
                if (ss0Var != null) {
                    arrayList3.add(ss0Var);
                }
                if (!(a40VarMo66k instanceof qg3) && arrayList.size() > 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((C0898xt) it2.next());
                    }
                    arrayList.clear();
                }
                if (oa0VarM4799e != oa0Var3) {
                    a40VarMo66k = a40VarMo66k.mo64i(oa0VarM4799e);
                }
                arrayList3.add(a40VarMo66k);
                if (wq2VarM56h != null) {
                    arrayList3.add(wq2VarM56h);
                }
                i23 = i5 + 1;
                i10 = i3;
                size3 = i4;
                oa0VarArr2 = oa0VarArr;
                arrayList4 = arrayList;
                i11 = 0;
            }
            i = i10;
            i2 = 1;
            sd0Var.f10059f = arrayList3;
        }
        do {
            int size4 = ((ArrayList) sd0Var.f10059f).size();
            int i26 = 0;
            int iMo58b = 0;
            while (true) {
                ArrayList arrayList5 = (ArrayList) sd0Var.f10059f;
                if (i26 >= size4) {
                    break;
                }
                a40 a40Var2 = (a40) arrayList5.get(i26);
                if (iMo58b < 0) {
                    a40Var2.getClass();
                    C0676s.m4651j("address < 0");
                    return;
                } else {
                    a40Var2.f45a = iMo58b;
                    iMo58b += a40Var2.mo58b();
                    i26++;
                }
            }
        } while (i7 != 0);
        ArrayList arrayList6 = (ArrayList) sd0Var.f10059f;
        int i27 = sd0Var.f10056c + i + sd0Var.f10057d;
        int size5 = arrayList6.size();
        b40 b40Var = new b40(size5, i27);
        for (int i28 = 0; i28 < size5; i28++) {
            b40Var.m2694f(i28, (a40) arrayList6.get(i28));
        }
        b40Var.f11990h = false;
        this.f5597l = b40Var;
        int i29 = i22.f4243j;
        int i30 = bc1.f777j;
        int length2 = b40Var.f5590i.length;
        C0611q9 c0611q9 = new C0611q9(length2);
        int i31 = 0;
        while (true) {
            Object obj2 = c0611q9.f8830c;
            if (i31 >= length2) {
                c0611q9.m4087a(Integer.MAX_VALUE, 0);
                ArrayList<ac1> arrayList7 = (ArrayList) obj2;
                int size6 = arrayList7.size();
                int i32 = size6 - c0611q9.f8829b;
                if (i32 == 0) {
                    int i33 = bc1.f777j;
                } else {
                    ac1[] ac1VarArr = new ac1[i32];
                    if (size6 == i32) {
                        arrayList7.toArray(ac1VarArr);
                    } else {
                        for (ac1 ac1Var : arrayList7) {
                        }
                    }
                    Arrays.sort(ac1VarArr);
                    bc1 bc1Var = new bc1(i32);
                    for (int i34 = 0; i34 < i32; i34++) {
                        ac1 ac1Var2 = ac1VarArr[i34];
                        bc1Var.m2694f(i34, null);
                    }
                    bc1Var.f11990h = false;
                }
                vu2 vu2Var = (vu2) this.f5595j;
                C0043b5 c0043b5 = (C0043b5) vu2Var.f12178a;
                int[] iArr2 = (int[]) vu2Var.f12179b;
                C0043b5 c0043b52 = (C0043b5) vu2Var.f12180c;
                int length3 = iArr2.length;
                C0058bk c0058bk2 = (C0058bk) c0043b5.f562i;
                ArrayList arrayList8 = new ArrayList(length3);
                C0855wp c0855wp = C0855wp.f12603j;
                int i35 = 0;
                C0964zj c0964zj = null;
                C0964zj c0964zj2 = null;
                while (i35 < length3) {
                    C0964zj c0964zjM553i = c0058bk2.m553i(iArr2[i35]);
                    j01 j01Var = c0964zjM553i.f13926b;
                    if (((kj0) j01Var.m2426h().f4202h.f13814d).f5590i.length != 0) {
                        v01 v01Var = c0964zjM553i.f13927c;
                        int i36 = v01Var.f11588j;
                        int i37 = c0964zjM553i.f13928d;
                        d63 d63VarMo2240e = j01Var.m2426h().mo2240e();
                        int length4 = ((kj0) d63VarMo2240e).f5590i.length;
                        if (length4 == 0) {
                            obj = C0855wp.f12603j;
                            c0058bk = c0058bk2;
                            iArr = iArr2;
                            i8 = length3;
                        } else {
                            c0058bk = c0058bk2;
                            if ((i37 == -1 && i36 != length4) || (i37 != -1 && (i36 != length4 + 1 || i37 != v01Var.m5598f(length4)))) {
                                c80.m667j("shouldn't happen: weird successors list");
                                return;
                            }
                            int i38 = 0;
                            while (true) {
                                if (i38 >= length4) {
                                    break;
                                }
                                if (d63VarMo2240e.getType(i38).equals(o43.f7486B)) {
                                    length4 = i38 + 1;
                                    break;
                                }
                                i38++;
                            }
                            C0855wp c0855wp2 = new C0855wp(length4);
                            int i39 = 0;
                            while (i39 < length4) {
                                c0855wp2.m2694f(i39, new C0818vp(new r30(d63VarMo2240e.getType(i39)), ((C0898xt[]) c0043b52.f562i)[v01Var.m5598f(i39)].m61e()));
                                i39++;
                                iArr2 = iArr2;
                                length3 = length3;
                            }
                            iArr = iArr2;
                            i8 = length3;
                            c0855wp2.f11990h = false;
                            obj = c0855wp2;
                        }
                        if (c0855wp.f5590i.length != 0) {
                            if (c0855wp.equals(obj)) {
                                if (c0964zj == null) {
                                    um2.m5516f("start == null");
                                    return;
                                } else if (((C0898xt[]) c0043b52.f564k)[c0964zjM553i.f13925a].m61e() - ((C0898xt[]) c0043b52.f563j)[c0964zj.f13925a].m61e() <= 65535) {
                                    c0964zj2 = c0964zjM553i;
                                }
                            }
                            if (c0855wp.f5590i.length != 0) {
                                arrayList8.add(new C0931yp(((C0898xt[]) c0043b52.f563j)[c0964zj.f13925a].m61e(), ((C0898xt[]) c0043b52.f564k)[c0964zj2.f13925a].m61e(), c0855wp));
                            }
                            c0964zj = c0964zjM553i;
                            c0964zj2 = c0964zj;
                            c0855wp = obj;
                        } else {
                            c0964zj = c0964zjM553i;
                            c0964zj2 = c0964zj;
                            c0855wp = obj;
                        }
                    } else {
                        c0058bk = c0058bk2;
                        iArr = iArr2;
                        i8 = length3;
                    }
                    i35++;
                    c0058bk2 = c0058bk;
                    iArr2 = iArr;
                    length3 = i8;
                }
                if (c0855wp.f5590i.length != 0) {
                    arrayList8.add(new C0931yp(((C0898xt[]) c0043b52.f563j)[c0964zj.f13925a].m61e(), ((C0898xt[]) c0043b52.f564k)[c0964zj2.f13925a].m61e(), c0855wp));
                }
                int size7 = arrayList8.size();
                if (size7 == 0) {
                    c0970zp = C0970zp.f14001j;
                } else {
                    C0970zp c0970zp2 = new C0970zp(size7);
                    for (int i40 = 0; i40 < size7; i40++) {
                        c0970zp2.m2694f(i40, (C0931yp) arrayList8.get(i40));
                    }
                    c0970zp2.f11990h = false;
                    c0970zp = c0970zp2;
                }
                this.f5596k = c0970zp;
                this.f5594i = null;
                this.f5595j = null;
                return;
            }
            a40 a40Var3 = (a40) b40Var.m2693e(i31);
            if (a40Var3 instanceof gc1) {
                a40Var3.m61e();
                throw null;
            }
            if (a40Var3 instanceof hc1) {
                int iM61e = a40Var3.m61e();
                r72 r72Var4 = null;
                int i41 = r72Var4.f9419h;
                r72 r72VarM4086d = C0611q9.m4086d(null);
                c0611q9.m4087a(iM61e, i41);
                r72 r72VarM5129e3 = ((t72) c0611q9.f8831d).m5129e(i41);
                if (r72VarM5129e3 == null) {
                    r72VarM4086d.getClass();
                } else {
                    if (r72VarM4086d.f9420i.mo22a().equals(r72VarM5129e3.f9420i.mo22a()) && r72VarM4086d.f9419h == r72VarM5129e3.f9419h) {
                        i9 = i2;
                    }
                    if (i9 == 0) {
                        r72[] r72VarArr = ((t72) c0611q9.f8831d).f10593i;
                        int length5 = r72VarArr.length;
                        int i42 = 0;
                        while (true) {
                            if (i42 >= length5) {
                                r72Var = null;
                                break;
                            }
                            r72Var = r72VarArr[i42];
                            if (r72Var != null && r72VarM4086d.f9420i.mo22a().equals(r72Var.f9420i.mo22a())) {
                                break;
                            } else {
                                i42++;
                            }
                        }
                        if (r72Var != null) {
                            c0611q9.m4088c(iM61e, 4, r72Var);
                        }
                        int i43 = ((int[]) c0611q9.f8832e)[i41];
                        if (r72VarM5129e3 != null) {
                            C0611q9.m4085b(iM61e, 3, r72VarM5129e3);
                            throw null;
                        }
                        if (i43 >= 0) {
                            ((ac1) ((ArrayList) obj2).get(i43)).getClass();
                            if (iM61e == 0) {
                                throw null;
                            }
                        }
                        if (i41 > 0 && (r72VarM5129e2 = ((t72) c0611q9.f8831d).m5129e(i41 - 1)) != null && r72VarM5129e2.m4401f()) {
                            c0611q9.m4088c(iM61e, 6, r72VarM5129e2);
                        }
                        if (r72VarM4086d.m4401f() && (r72VarM5129e = ((t72) c0611q9.f8831d).m5129e(i41 + 1)) != null) {
                            c0611q9.m4088c(iM61e, 5, r72VarM5129e);
                        }
                        C0611q9.m4085b(iM61e, i2, r72VarM4086d);
                        throw null;
                    }
                }
                i9 = 0;
                if (i9 == 0) {
                }
            }
            i31++;
            i2 = i2;
        }
    }

    /* JADX INFO: renamed from: w */
    public synchronized ArrayList m2714w(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (jj1 jj1Var : (ArrayList) this.f5594i) {
            if (!arrayList.contains(jj1Var.f5060b) && jj1Var.f5059a.isAssignableFrom(cls)) {
                arrayList.add(jj1Var.f5060b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public List m2715x() {
        if (((bf1) this.f5597l) == null) {
            this.f5597l = new bf1(this);
        }
        bf1 bf1Var = (bf1) this.f5597l;
        bf1Var.getClass();
        return bf1Var;
    }

    /* JADX INFO: renamed from: y */
    public r72 m2716y() {
        int i = ((C0964zj) this.f5595j).f13928d;
        if (i < 0) {
            return null;
        }
        i01 i01Var = (i01) ((C0058bk) ((C0043b5) ((bb2) this.f5597l).f763d).f562i).m553i(i).f13926b.m2693e(0);
        if (i01Var.f4202h.f13811a != 56) {
            return null;
        }
        return i01Var.f4204j;
    }

    /* JADX INFO: renamed from: z */
    public c11 m2717z() {
        Matcher matcher = (Matcher) this.f5594i;
        return ci0.m799X(matcher.start(), matcher.end());
    }

    public kj1(df2 df2Var, int i) {
        this.f5593h = 14;
        eg2 eg2Var = new eg2();
        df2Var = (i & 2) != 0 ? new df2(null, null, null, null, null, null, null, 1023) : df2Var;
        c60 c60Var = o90.f7590a;
        c60Var.getClass();
        this.f5594i = eg2Var;
        this.f5595j = df2Var;
        this.f5596k = c60Var;
        this.f5597l = new dq1(eg2Var);
    }

    public kj1(File file, int i) {
        this.f5593h = i;
        switch (i) {
            case 11:
                this.f5594i = file;
                this.f5595j = new Object();
                this.f5596k = AbstractC0691se.m4844o(new eq1(1));
                break;
            default:
                this.f5594i = file;
                this.f5595j = new Object();
                this.f5596k = AbstractC0691se.m4844o(new vi1(29));
                break;
        }
    }

    public /* synthetic */ kj1(int i, Object obj) {
        this.f5593h = i;
        this.f5594i = obj;
    }

    public kj1(kb3 kb3Var, ib3 ib3Var, s20 s20Var) {
        this.f5593h = 17;
        kb3Var.getClass();
        s20Var.getClass();
        this.f5594i = kb3Var;
        this.f5595j = ib3Var;
        this.f5596k = s20Var;
        this.f5597l = new ix2(0);
    }

    public kj1(C0043b5 c0043b5) {
        this.f5593h = 0;
        this.f5594i = new ArrayList();
        this.f5596k = new HashSet();
        this.f5597l = c0043b5;
        this.f5595j = f5591m;
    }

    public kj1(Socket socket) {
        this.f5593h = 6;
        this.f5594i = socket;
        this.f5595j = new AtomicInteger();
        this.f5596k = new g60(this);
        this.f5597l = new f60(this);
    }

    public kj1(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, C0735ti c0735ti) {
        this.f5593h = 3;
        this.f5594i = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f5595j = c0735ti;
        AutofillManager autofillManager = (AutofillManager) viewTreeObserverOnGlobalLayoutListenerC0045b7.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f5596k = autofillManager;
            viewTreeObserverOnGlobalLayoutListenerC0045b7.setImportantForAutofill(1);
            AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0045b7.getAutofillId();
            if (autofillId != null) {
                this.f5597l = autofillId;
                return;
            }
            throw vi0.m5686e("Required value was null.");
        }
        C0676s.m4653l("Autofill service could not be located.");
        throw null;
    }

    public kj1(u12 u12Var) {
        this.f5593h = 12;
        this.f5597l = u12Var;
        this.f5595j = t12.f10489h;
    }

    public kj1(ArrayList arrayList, l23 l23Var, td1 td1Var, ContentResolver contentResolver) {
        this.f5593h = 1;
        this.f5595j = l23Var;
        this.f5596k = td1Var;
        this.f5597l = contentResolver;
        this.f5594i = arrayList;
    }

    public kj1(Matcher matcher, CharSequence charSequence) {
        this.f5593h = 8;
        charSequence.getClass();
        this.f5594i = matcher;
        this.f5595j = charSequence;
        this.f5596k = new cf1(0, this);
    }

    public kj1(bb2 bb2Var, dq1 dq1Var) {
        this.f5593h = 13;
        this.f5597l = bb2Var;
        this.f5594i = dq1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kj1(sj0 sj0Var) {
        this(15, new hh1(26, sj0Var));
        this.f5593h = 15;
    }
}
