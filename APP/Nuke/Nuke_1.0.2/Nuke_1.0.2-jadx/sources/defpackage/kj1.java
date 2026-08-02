package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class kj1 implements oi, ys2, hi2, h01, aa3 {
    public static final i51 m = new i51(5);
    public static final b83 n = new b83(2);
    public final /* synthetic */ int h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kj1(int i) {
        this.h = i;
        switch (i) {
            case 4:
                this.i = new AtomicBoolean(false);
                this.j = new CountDownLatch(1);
                this.l = "PublicSuffixDatabase.list";
                break;
            case 5:
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
            case 8:
            case 9:
            default:
                this.i = new ReentrantReadWriteLock();
                this.k = new HashMap();
                break;
            case 7:
                this.j = new ArrayDeque();
                this.k = new ArrayDeque();
                this.l = new ArrayDeque();
                break;
            case 10:
                uc3 uc3Var = te.h;
                hn1 hn1Var = new hn1(2);
                fq1 fq1Var = fq1.o;
                r6 r6Var = new r6(0, pp1.a, pp1.class, "isSecurityMode", "isSecurityMode()Z", 0, 0, 4);
                this.i = uc3Var;
                this.j = hn1Var;
                this.k = fq1Var;
                this.l = r6Var;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void H(kj1 kj1Var, p52 p52Var, s52 s52Var, p52 p52Var2, int i) {
        n4 n4Var;
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
        TimeZone timeZone = wg3.a;
        boolean zIsShutdown = ((ThreadPoolExecutor) kj1Var.p()).isShutdown();
        synchronized (kj1Var) {
            if (s52Var != null) {
                try {
                    if (!((ArrayDeque) kj1Var.l).remove(s52Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (p52Var2 != null) {
                p52Var2.i.decrementAndGet();
                if (!((ArrayDeque) kj1Var.k).remove(p52Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (p52Var != null) {
                ((ArrayDeque) kj1Var.j).add(p52Var);
                p52 p52VarU = kj1Var.u(p52Var.j.i.a.d);
                if (p52VarU != null) {
                    p52Var.i = p52VarU.i;
                }
            }
            if ((s52Var != null || p52Var2 != null) && (zIsShutdown || ((ArrayDeque) kj1Var.k).isEmpty())) {
                ((ArrayDeque) kj1Var.l).isEmpty();
            }
            int i2 = 13;
            if (zIsShutdown) {
                List listF0 = du.F0((ArrayDeque) kj1Var.j);
                ((ArrayDeque) kj1Var.j).clear();
                n4Var = new n4(i2, listF0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) kj1Var.j).iterator();
                it.getClass();
                while (it.hasNext()) {
                    p52 p52Var3 = (p52) it.next();
                    if (((ArrayDeque) kj1Var.k).size() >= 64) {
                        break;
                    }
                    if (p52Var3.i.get() < 5) {
                        it.remove();
                        p52Var3.i.incrementAndGet();
                        arrayList.add(p52Var3);
                        ((ArrayDeque) kj1Var.k).add(p52Var3);
                    }
                }
                n4Var = new n4(i2, arrayList);
            }
        }
        int size = ((List) n4Var.i).size();
        boolean z = true;
        for (int i3 = 0; i3 < size; i3++) {
            p52 p52Var4 = (p52) ((List) n4Var.i).get(i3);
            if (p52Var4 == p52Var) {
                z = false;
            } else {
                p52Var4.j.k.getClass();
            }
            if (zIsShutdown) {
                p52Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                s52 s52Var2 = p52Var4.j;
                s52Var2.l(interruptedIOException);
                p52Var4.h.j(s52Var2, interruptedIOException);
            } else {
                ExecutorService executorServiceP = kj1Var.p();
                p52Var4.getClass();
                s52 s52Var3 = p52Var4.j;
                s52Var3.h.a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceP).execute(p52Var4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        s52 s52Var4 = p52Var4.j;
                        s52Var4.l(interruptedIOException2);
                        p52Var4.h.j(s52Var4, interruptedIOException2);
                        kj1 kj1Var2 = s52Var3.h.a;
                        kj1Var2.getClass();
                        H(kj1Var2, null, null, p52Var4, 3);
                    }
                } catch (Throwable th2) {
                    kj1 kj1Var3 = s52Var3.h.a;
                    kj1Var3.getClass();
                    H(kj1Var3, null, null, p52Var4, 3);
                    throw th2;
                }
            }
        }
        if (!z || p52Var == null) {
            return;
        }
        p52Var.j.k.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nd A(long j, nd ndVar, nd ndVar2) {
        if (((nd) this.k) == null) {
            this.k = ndVar.c();
        }
        nd ndVar3 = (nd) this.k;
        if (ndVar3 == null) {
            t11.S("velocityVector");
            throw null;
        }
        int iB = ndVar3.b();
        int i = 0;
        while (true) {
            nd ndVar4 = (nd) this.k;
            if (i >= iB) {
                if (ndVar4 != null) {
                    return ndVar4;
                }
                t11.S("velocityVector");
                throw null;
            }
            if (ndVar4 == null) {
                t11.S("velocityVector");
                throw null;
            }
            hh1 hh1Var = (hh1) this.i;
            ndVar.getClass();
            long j2 = j / 1000000;
            nj0 nj0VarA = ((oj0) hh1Var.i).a(ndVar2.a(i));
            long j3 = nj0VarA.c;
            ndVar4.e((((Math.signum(nj0VarA.a) * x8.a(j3 > 0 ? j2 / j3 : 1.0f).b) * nj0VarA.b) / j3) * 1000.0f, i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fb3 B(bt btVar, String str) {
        fb3 fb3Var;
        fb3 fb3VarA;
        synchronized (((ix2) this.l)) {
            try {
                fb3Var = (fb3) ((kb3) this.i).a.get(str);
                if (btVar.d(fb3Var)) {
                    ib3 ib3Var = (ib3) this.j;
                    if (ib3Var instanceof uc2) {
                        uc2 uc2Var = (uc2) ib3Var;
                        fb3Var.getClass();
                        ba1 ba1Var = uc2Var.d;
                        if (ba1Var != null) {
                            qc2 qc2Var = uc2Var.e;
                            qc2Var.getClass();
                            rp0.T(fb3Var, qc2Var, ba1Var);
                        }
                    }
                    fb3Var.getClass();
                } else {
                    wj1 wj1Var = new wj1((s20) this.k);
                    wj1Var.a.put(p7.g, str);
                    ib3 ib3Var2 = (ib3) this.j;
                    try {
                        try {
                            fb3VarA = ib3Var2.c(btVar, wj1Var);
                        } catch (AbstractMethodError unused) {
                            fb3VarA = ib3Var2.a(p40.y(btVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        fb3VarA = ib3Var2.b(p40.y(btVar), wj1Var);
                    }
                    fb3Var = fb3VarA;
                    kb3 kb3Var = (kb3) this.i;
                    kb3Var.getClass();
                    fb3Var.getClass();
                    fb3 fb3Var2 = (fb3) kb3Var.a.put(str, fb3Var);
                    if (fb3Var2 != null) {
                        fb3Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fb3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean C(th2 th2Var) {
        String str;
        th2Var.getClass();
        if (th2Var.k.a().isEmpty()) {
            return true;
        }
        synchronized (this.j) {
            str = (String) D().get(th2Var.c);
        }
        return t11.l(str, rp0.b0(th2Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map D() {
        Object x92Var;
        ow1 ow1Var;
        File file = (File) this.i;
        Map map = (Map) this.l;
        if (map != null) {
            return map;
        }
        try {
            if (file.exists()) {
                v31 v31Var = (v31) this.k;
                String strF0 = wi0.f0(file);
                v31Var.getClass();
                j31 j31Var = (j31) v31Var.a(o31.a, strF0);
                d41 d41Var = j31Var instanceof d41 ? (d41) j31Var : null;
                if (d41Var == null) {
                    x92Var = new LinkedHashMap();
                } else {
                    Set<Map.Entry> setEntrySet = d41Var.h.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : setEntrySet) {
                        String str = (String) entry.getKey();
                        j31 j31Var2 = (j31) entry.getValue();
                        i41 i41Var = j31Var2 instanceof i41 ? (i41) j31Var2 : null;
                        if (i41Var != null) {
                            gz0 gz0Var = l31.a;
                            String strA = i41Var instanceof z31 ? null : i41Var.a();
                            ow1Var = strA != null ? new ow1(str, strA) : null;
                        }
                        if (ow1Var != null) {
                            arrayList.add(ow1Var);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    we1.w0(arrayList, linkedHashMap);
                    x92Var = linkedHashMap;
                }
            } else {
                x92Var = new LinkedHashMap();
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        Object linkedHashMap2 = x92Var;
        if (thA != null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        Map map2 = (Map) linkedHashMap2;
        this.l = map2;
        return map2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x0081 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Set E() {
        ?? x92Var;
        ?? linkedHashSet;
        String strA;
        File file = (File) this.i;
        Set set = (Set) this.l;
        if (set != null) {
            return set;
        }
        try {
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (file.isFile()) {
            v31 v31Var = (v31) this.k;
            String strF0 = wi0.f0(file);
            v31Var.getClass();
            j31 j31Var = (j31) v31Var.a(o31.a, strF0);
            z21 z21Var = j31Var instanceof z21 ? (z21) j31Var : null;
            if (z21Var == null) {
                linkedHashSet = new LinkedHashSet();
            } else {
                x92Var = new LinkedHashSet();
                for (j31 j31Var2 : z21Var.h) {
                    i41 i41Var = j31Var2 instanceof i41 ? (i41) j31Var2 : null;
                    if (i41Var != null) {
                        gz0 gz0Var = l31.a;
                        strA = i41Var instanceof z31 ? null : i41Var.a();
                        if (strA == null || pv2.s0(strA)) {
                            strA = null;
                        }
                    }
                    if (strA != null) {
                        x92Var.add(strA);
                    }
                }
                linkedHashSet = x92Var;
            }
        } else {
            linkedHashSet = new LinkedHashSet();
        }
        Throwable thA = y92.a(linkedHashSet);
        ?? linkedHashSet2 = linkedHashSet;
        if (thA != null) {
            linkedHashSet2 = new LinkedHashSet();
        }
        LinkedHashSet linkedHashSet3 = (LinkedHashSet) linkedHashSet2;
        this.l = linkedHashSet3;
        return linkedHashSet3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void F(Map map) throws IOException {
        File file = (File) this.i;
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            s.j("Permission store file must have a parent directory.");
            return;
        }
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            s.l("Unable to create the script permission directory.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            i41 i41VarC = l31.c((String) entry.getValue());
            str.getClass();
            i41VarC.getClass();
        }
        d41 d41Var = new d41(linkedHashMap);
        File fileCreateTempFile = File.createTempFile("perm", ".tmp", parentFile);
        try {
            fileCreateTempFile.getClass();
            wi0.h0(fileCreateTempFile, ((v31) this.k).b(d41.Companion.serializer(), d41Var));
            try {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException unused) {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            this.l = new LinkedHashMap(map);
        } finally {
            fileCreateTempFile.delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void G(Set set) throws IOException {
        File file = (File) this.i;
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            s.j("Enabled script store file must have a parent directory.");
            return;
        }
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            s.l("Unable to create the enabled script store directory.");
            return;
        }
        List listZ0 = du.z0(set);
        ArrayList arrayList = new ArrayList(eu.B(listZ0, 10));
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            arrayList.add(l31.c((String) it.next()));
        }
        z21 z21Var = new z21(arrayList);
        File fileCreateTempFile = File.createTempFile("script-enabled", ".tmp", parentFile);
        try {
            fileCreateTempFile.getClass();
            wi0.h0(fileCreateTempFile, ((v31) this.k).b(z21.Companion.serializer(), z21Var));
            try {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException unused) {
                Files.move(fileCreateTempFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            this.l = du.J0(set);
        } finally {
            fileCreateTempFile.delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void I() {
        try {
            zz1 zz1Var = zz1.a;
            if (Build.FINGERPRINT != null) {
                throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            }
            throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
        } catch (Throwable th) {
            ((CountDownLatch) this.j).countDown();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void J(String str, boolean z) {
        str.getClass();
        synchronized (this.j) {
            try {
                Set setJ0 = du.J0(E());
                if (z ? setJ0.add(str) : setJ0.remove(str)) {
                    G(setJ0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void K(h12 h12Var) {
        if (((t12) this.j) == t12.i) {
            c61 c61Var = (c61) this.i;
            if (c61Var == null) {
                s.l("layoutCoordinates not set");
                return;
            } else {
                s11.p0(h12Var, c61Var.M(0L), new v5(17, (u12) this.l), true);
            }
        }
        this.j = t12.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public long b(nd ndVar, nd ndVar2, nd ndVar3) {
        int iB = ndVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((hh1) this.i).z(i).d(ndVar.a(i), ndVar2.a(i), ndVar3.a(i)));
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h01
    public void c(j23 j23Var) {
        kt2 kt2Var = j23Var.i;
        oa0 oa0VarA = ab2.a(j23Var);
        za2 za2Var = j23Var.h;
        dz dzVar = j23Var.l;
        int i = za2Var.e;
        int i2 = za2Var.a;
        if (i != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + za2Var.e);
        }
        f((xt) this.k);
        if (za2Var.f) {
            f(new f30(oa0VarA, kt2Var, j23Var.k, dzVar));
            return;
        }
        r72 r72VarY = y();
        s72 s72VarC = bb2.c(j23Var, r72VarY);
        if ((oa0VarA.e || i2 == 43) == (r72VarY != null)) {
            f((i2 != 41 || oa0VarA.a == 35) ? new f30(oa0VarA, kt2Var, s72VarC, dzVar) : new wq2(oa0VarA, kt2Var, s72VarC));
        } else {
            c80.A("Insn with result/move-result-pseudo mismatch ", j23Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h01
    public void d(xz1 xz1Var) {
        a40 wq2Var;
        za2 za2Var = xz1Var.h;
        r72 r72Var = xz1Var.j;
        int i = za2Var.a;
        if (i == 54 || i == 56) {
            return;
        }
        kt2 kt2Var = xz1Var.i;
        oa0 oa0VarA = ab2.a(xz1Var);
        int i2 = za2Var.e;
        if (i2 == 1 || i2 == 2) {
            wq2Var = new wq2(oa0VarA, kt2Var, bb2.c(xz1Var, r72Var));
        } else {
            if (i2 == 3) {
                return;
            }
            if (i2 != 4) {
                if (i2 != 6) {
                    c80.j("shouldn't happen");
                    return;
                }
                wq2Var = new wq2(oa0VarA, kt2Var, bb2.c(xz1Var, r72Var));
            } else {
                wq2Var = new dy2(oa0VarA, kt2Var, bb2.c(xz1Var, r72Var), ((xt[]) ((b5) ((bb2) this.l).e).i)[((zj) this.j).c.f(1)]);
            }
        }
        f(wq2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h01
    public void e(wz1 wz1Var) {
        kt2 kt2Var = wz1Var.i;
        dz dzVar = wz1Var.l;
        r72 r72Var = wz1Var.j;
        oa0 oa0VarA = ab2.a(wz1Var);
        za2 za2Var = wz1Var.h;
        int i = za2Var.a;
        if (za2Var.e != 1) {
            c80.j("shouldn't happen");
            return;
        }
        if (i != 3) {
            f(new f30(oa0VarA, kt2Var, bb2.c(wz1Var, r72Var), dzVar));
            return;
        }
        bb2 bb2Var = (bb2) this.l;
        if (bb2Var.a) {
            return;
        }
        f(new wq2(oa0VarA, kt2Var, s72.i(r72Var, r72.e((bb2Var.b - bb2Var.c) + ((g30) dzVar).h, r72Var.i.a()))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(a40 a40Var) {
        ((sd0) ((dq1) this.i).i).a(a40Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public synchronized jh1 g(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (jj1 jj1Var : (ArrayList) this.i) {
                if (((HashSet) this.k).contains(jj1Var)) {
                    z = true;
                } else if (jj1Var.a.isAssignableFrom(cls) && jj1Var.b.isAssignableFrom(cls2)) {
                    ((HashSet) this.k).add(jj1Var);
                    arrayList.add(jj1Var.c.q(this));
                    ((HashSet) this.k).remove(jj1Var);
                }
            }
            if (arrayList.size() > 1) {
                i51 i51Var = (i51) this.j;
                b5 b5Var = (b5) this.l;
                i51Var.getClass();
                return new tg(2, arrayList, b5Var);
            }
            if (arrayList.size() == 1) {
                return (jh1) arrayList.get(0);
            }
            if (z) {
                return n;
            }
            throw new u72("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.k).clear();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h01
    public void h(k23 k23Var) {
        kt2 kt2Var = k23Var.i;
        oa0 oa0VarA = ab2.a(k23Var);
        if (k23Var.h.e != 6) {
            c80.j("shouldn't happen");
            return;
        }
        r72 r72VarY = y();
        if (oa0VarA.e != (r72VarY != null)) {
            c80.A("Insn with result/move-result-pseudo mismatch", k23Var);
        } else {
            f((xt) this.k);
            f(new wq2(oa0VarA, kt2Var, bb2.c(k23Var, r72VarY)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hi2
    public Object i() {
        throw new fi2("NOT_SUPPORTED", "Media download is not supported by the current WeChat adapter.", 8, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hi2
    public Object j(zj2 zj2Var) {
        if (((Boolean) ((xm0) this.l).a()).booleanValue()) {
            throw new fi2("MESSAGING_UNAVAILABLE", "Messaging is disabled while security mode is enabled.", 8, false);
        }
        yf2 yf2Var = zj2Var.a;
        String str = yf2Var.a;
        String str2 = yf2Var.c;
        String str3 = yf2Var.b;
        String str4 = yf2Var.d;
        if (!str.equals("wechat")) {
            throw new fi2("NOT_SUPPORTED", "Only the WeChat platform is supported.", 8, false);
        }
        String str5 = (String) ((xm0) this.j).a();
        if (pv2.s0(str5)) {
            throw new fi2("MESSAGING_UNAVAILABLE", "No active WeChat account is available.", 8, true);
        }
        if (!str3.equals(str5)) {
            throw new fi2("NOT_FOUND", "The requested WeChat account is not active.", 8, false);
        }
        if (!pv2.s0(str2)) {
            for (int i = 0; i < str2.length(); i++) {
                if (!Character.isISOControl(str2.charAt(i))) {
                }
            }
            if (!str4.equals(wv2.W(str2, "@chatroom", false) ? "group" : "private")) {
                throw new fi2("INVALID_ARGUMENT", "Conversation type does not match the WeChat conversation.", 8, false);
            }
            if (zj2Var.c != null) {
                throw new fi2("NOT_SUPPORTED", "WeChat quoted replies are not supported yet.", 8, false);
            }
            String strU0 = du.u0(zj2Var.b, "", null, null, new eq1(this), 30);
            if (pv2.s0(strU0)) {
                throw new fi2("INVALID_ARGUMENT", "Text message content must not be blank.", 8, false);
            }
            try {
                ((uc3) this.i).getClass();
                so2 so2VarL = gd3.l(str2, strU0);
                if (so2VarL instanceof ro2) {
                    return new ak2(((Number) ((xm0) this.k).a()).longValue(), yf2Var);
                }
                if (!(so2VarL instanceof qo2)) {
                    c80.s();
                    return null;
                }
                int iOrdinal = ((qo2) so2VarL).a.b.ordinal();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ys2
    public fr2 l() {
        return (f60) this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public synchronized ArrayList m(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (jj1 jj1Var : (ArrayList) this.i) {
                if (!((HashSet) this.k).contains(jj1Var) && jj1Var.a.isAssignableFrom(cls)) {
                    ((HashSet) this.k).add(jj1Var);
                    arrayList.add(jj1Var.c.q(this));
                    ((HashSet) this.k).remove(jj1Var);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ys2
    public ht2 n() {
        return (g60) this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o(h12 h12Var, boolean z) {
        u12 u12Var = (u12) this.l;
        List list = h12Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((o12) list.get(i)).b()) {
                K(h12Var);
                return;
            }
        }
        c61 c61Var = (c61) this.i;
        if (c61Var == null) {
            s.l("layoutCoordinates not set");
            return;
        }
        s11.p0(h12Var, c61Var.M(0L), new fa(7, this, u12Var), false);
        if (((t12) this.j) == t12.i) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((o12) list.get(i2)).a();
                }
            }
            er2 er2Var = h12Var.b;
            if (er2Var != null) {
                er2Var.i = !u12Var.c;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized ExecutorService p() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.i) == null) {
                this.i = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new vg3(wg3.b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.i;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd q(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        if (((nd) this.k) == null) {
            this.k = ndVar3.c();
        }
        nd ndVar4 = (nd) this.k;
        if (ndVar4 == null) {
            t11.S("velocityVector");
            throw null;
        }
        int iB = ndVar4.b();
        int i = 0;
        while (true) {
            nd ndVar5 = (nd) this.k;
            if (i >= iB) {
                if (ndVar5 != null) {
                    return ndVar5;
                }
                t11.S("velocityVector");
                throw null;
            }
            if (ndVar5 == null) {
                t11.S("velocityVector");
                throw null;
            }
            ndVar5.e(((hh1) this.i).z(i).c(j, ndVar.a(i), ndVar2.a(i), ndVar3.a(i)), i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd s(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        if (((nd) this.j) == null) {
            this.j = ndVar.c();
        }
        nd ndVar4 = (nd) this.j;
        if (ndVar4 == null) {
            t11.S("valueVector");
            throw null;
        }
        int iB = ndVar4.b();
        int i = 0;
        while (true) {
            nd ndVar5 = (nd) this.j;
            if (i >= iB) {
                if (ndVar5 != null) {
                    return ndVar5;
                }
                t11.S("valueVector");
                throw null;
            }
            if (ndVar5 == null) {
                t11.S("valueVector");
                throw null;
            }
            ndVar5.e(((hh1) this.i).z(i).b(j, ndVar.a(i), ndVar2.a(i), ndVar3.a(i)), i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd t(nd ndVar, nd ndVar2, nd ndVar3) {
        if (((nd) this.l) == null) {
            this.l = ndVar3.c();
        }
        nd ndVar4 = (nd) this.l;
        if (ndVar4 == null) {
            t11.S("endVelocityVector");
            throw null;
        }
        int iB = ndVar4.b();
        int i = 0;
        while (true) {
            nd ndVar5 = (nd) this.l;
            if (i >= iB) {
                if (ndVar5 != null) {
                    return ndVar5;
                }
                t11.S("endVelocityVector");
                throw null;
            }
            if (ndVar5 == null) {
                t11.S("endVelocityVector");
                throw null;
            }
            ndVar5.e(((hh1) this.i).z(i).e(ndVar.a(i), ndVar2.a(i), ndVar3.a(i)), i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                String string = ((Socket) this.i).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p52 u(String str) {
        Iterator it = ((ArrayDeque) this.k).iterator();
        it.getClass();
        while (it.hasNext()) {
            p52 p52Var = (p52) it.next();
            if (t11.l(p52Var.j.i.a.d, str)) {
                return p52Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.j).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            p52 p52Var2 = (p52) it2.next();
            if (t11.l(p52Var2.j.i.a.d, str)) {
                return p52Var2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: d63 */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0218, code lost:
    
        r2 = r5.size();
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021e, code lost:
    
        if (r3 >= r2) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0220, code lost:
    
        r5 = (defpackage.a40) ((java.util.ArrayList) r1.f).get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x022c, code lost:
    
        if ((r5 instanceof defpackage.dy2) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022f, code lost:
    
        r6 = r5.b;
        r7 = (defpackage.dy2) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023a, code lost:
    
        if (r6.d.r(r7) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0241, code lost:
    
        if (r6.b != 40) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0243, code lost:
    
        r4 = r1.f(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0247, code lost:
    
        if (r4 == null) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0249, code lost:
    
        ((java.util.ArrayList) r1.f).set(r3, r5.i(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0255, code lost:
    
        defpackage.c80.t("method too long");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025b, code lost:
    
        r5 = r3 + 1;
        r4 = (defpackage.xt) ((java.util.ArrayList) r1.f).get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0267, code lost:
    
        ((java.util.ArrayList) r1.f).set(r3, new defpackage.dy2(defpackage.pa0.I, r7.c, defpackage.s72.j, r7.e));
        ((java.util.ArrayList) r1.f).add(r3, r7.o(r4));
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
    
        defpackage.s.l("unpaired TargetInsn");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0293, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0294, code lost:
    
        defpackage.s.l("unpaired TargetInsn (dangling)");
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v() {
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
        wq2 wq2VarH;
        int i7;
        zp zpVar;
        bk bkVar;
        int[] iArr;
        int i8;
        Object obj;
        int i9;
        r72 r72Var;
        r72 r72VarE;
        r72 r72VarE2;
        if (((b40) this.l) != null) {
            return;
        }
        sd0 sd0Var = (sd0) this.i;
        int i10 = sd0Var.b;
        if (sd0Var.c >= 0) {
            c80.t("already processed");
            return;
        }
        int size = ((ArrayList) sd0Var.f).size();
        oa0[] oa0VarArr2 = new oa0[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            oa0VarArr2[i12] = ((a40) ((ArrayList) sd0Var.f).get(i12)).b;
        }
        sd0Var.j(oa0VarArr2);
        int i13 = sd0Var.e;
        do {
            int i14 = ((sd0Var.c + i10) + sd0Var.d) - i13;
            Iterator it = ((ArrayList) sd0Var.f).iterator();
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (it.hasNext()) {
                s72 s72Var2 = ((a40) it.next()).d;
                for (int i19 = 0; i19 < s72Var2.i.length; i19++) {
                    r72 r72Var2 = (r72) s72Var2.e(i19);
                    if (r72Var2.f()) {
                        int i20 = r72Var2.h;
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
                sd0Var.c();
            } else if (i15 <= i16) {
                if (i17 <= i18) {
                    break;
                }
                sd0Var.c();
                if (i13 != 0 && i16 > i15) {
                    sd0Var.b();
                }
            } else {
                sd0Var.b();
            }
        } while (sd0Var.j(oa0VarArr2));
        int i21 = sd0Var.c;
        ArrayList arrayList2 = (ArrayList) sd0Var.f;
        if (i21 == 0) {
            int size2 = arrayList2.size();
            for (int i22 = 0; i22 < size2; i22++) {
                a40 a40Var = (a40) ((ArrayList) sd0Var.f).get(i22);
                oa0 oa0Var = a40Var.b;
                oa0 oa0Var2 = oa0VarArr2[i22];
                if (oa0Var != oa0Var2) {
                    ((ArrayList) sd0Var.f).set(i22, a40Var.i(oa0Var2));
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
                a40 a40VarK = (a40) ((ArrayList) sd0Var.f).get(i23);
                oa0 oa0Var3 = a40VarK.b;
                kt2 kt2Var = a40VarK.c;
                s72 s72Var3 = a40VarK.d;
                oa0 oa0VarE = oa0VarArr2[i23];
                if (oa0VarE != null) {
                    i3 = i10;
                    i4 = size3;
                    oa0VarArr = oa0VarArr2;
                    arrayList = arrayList4;
                    i5 = i23;
                    wq2VarH = null;
                    ss0Var = null;
                } else {
                    oa0VarE = sd0Var.e(a40VarK);
                    BitSet bitSetX = oa0VarE.d.x(a40VarK);
                    boolean z2 = bitSetX.get(i11);
                    i3 = i10;
                    boolean z3 = oa0Var3.e;
                    if (z3) {
                        bitSetX.set(i11);
                    }
                    Object[] objArr = s72Var3.i;
                    i4 = size3;
                    int length = objArr.length - bitSetX.cardinality();
                    if (length == 0) {
                        oa0VarArr = oa0VarArr2;
                        arrayList = arrayList4;
                        i5 = i23;
                        s72Var = s72.j;
                    } else {
                        oa0VarArr = oa0VarArr2;
                        s72Var = new s72(length);
                        arrayList = arrayList4;
                        i5 = i23;
                        int i24 = 0;
                        for (int i25 = 0; i25 < objArr.length; i25++) {
                            if (!bitSetX.get(i25)) {
                                s72Var.f(i24, s72Var3.e(i25));
                                i24++;
                            }
                        }
                        if (!s72Var3.h) {
                            i6 = 0;
                            s72Var.h = false;
                        }
                        if (z3) {
                            bitSetX.set(i6, z2);
                        }
                        ss0Var = s72Var.i.length != 0 ? null : new ss0(kt2Var, s72Var);
                        if (z3 || bitSetX.get(i6)) {
                            wq2VarH = null;
                        } else {
                            r72 r72Var3 = (r72) s72Var3.e(i6);
                            wq2VarH = a40.h(kt2Var, r72Var3, r72Var3.h == 0 ? r72Var3 : r72.e(i6, r72Var3.i));
                        }
                        a40VarK = a40VarK.k(s72Var3.j(z3, bitSetX));
                    }
                    i6 = 0;
                    if (z3) {
                    }
                    if (s72Var.i.length != 0) {
                    }
                    if (z3) {
                        wq2VarH = null;
                        a40VarK = a40VarK.k(s72Var3.j(z3, bitSetX));
                    }
                }
                if (ss0Var != null) {
                    arrayList3.add(ss0Var);
                }
                if (!(a40VarK instanceof qg3) && arrayList.size() > 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((xt) it2.next());
                    }
                    arrayList.clear();
                }
                if (oa0VarE != oa0Var3) {
                    a40VarK = a40VarK.i(oa0VarE);
                }
                arrayList3.add(a40VarK);
                if (wq2VarH != null) {
                    arrayList3.add(wq2VarH);
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
            sd0Var.f = arrayList3;
        }
        do {
            int size4 = ((ArrayList) sd0Var.f).size();
            int i26 = 0;
            int iB = 0;
            while (true) {
                ArrayList arrayList5 = (ArrayList) sd0Var.f;
                if (i26 >= size4) {
                    break;
                }
                a40 a40Var2 = (a40) arrayList5.get(i26);
                if (iB < 0) {
                    a40Var2.getClass();
                    s.j("address < 0");
                    return;
                } else {
                    a40Var2.a = iB;
                    iB += a40Var2.b();
                    i26++;
                }
            }
        } while (i7 != 0);
        ArrayList arrayList6 = (ArrayList) sd0Var.f;
        int i27 = sd0Var.c + i + sd0Var.d;
        int size5 = arrayList6.size();
        b40 b40Var = new b40(size5, i27);
        for (int i28 = 0; i28 < size5; i28++) {
            b40Var.f(i28, (a40) arrayList6.get(i28));
        }
        b40Var.h = false;
        this.l = b40Var;
        int i29 = i22.j;
        int i30 = bc1.j;
        int length2 = b40Var.i.length;
        q9 q9Var = new q9(length2);
        int i31 = 0;
        while (true) {
            Object obj2 = q9Var.c;
            if (i31 >= length2) {
                q9Var.a(Integer.MAX_VALUE, 0);
                ArrayList<ac1> arrayList7 = (ArrayList) obj2;
                int size6 = arrayList7.size();
                int i32 = size6 - q9Var.b;
                if (i32 == 0) {
                    int i33 = bc1.j;
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
                        bc1Var.f(i34, null);
                    }
                    bc1Var.h = false;
                }
                vu2 vu2Var = (vu2) this.j;
                b5 b5Var = (b5) vu2Var.a;
                int[] iArr2 = (int[]) vu2Var.b;
                b5 b5Var2 = (b5) vu2Var.c;
                int length3 = iArr2.length;
                bk bkVar2 = (bk) b5Var.i;
                ArrayList arrayList8 = new ArrayList(length3);
                wp wpVar = wp.j;
                int i35 = 0;
                zj zjVar = null;
                zj zjVar2 = null;
                while (i35 < length3) {
                    zj zjVarI = bkVar2.i(iArr2[i35]);
                    j01 j01Var = zjVarI.b;
                    if (((kj0) j01Var.h().h.d).i.length != 0) {
                        v01 v01Var = zjVarI.c;
                        int i36 = v01Var.j;
                        int i37 = zjVarI.d;
                        d63 d63VarE = j01Var.h().e();
                        int length4 = ((kj0) d63VarE).i.length;
                        if (length4 == 0) {
                            obj = wp.j;
                            bkVar = bkVar2;
                            iArr = iArr2;
                            i8 = length3;
                        } else {
                            bkVar = bkVar2;
                            if ((i37 == -1 && i36 != length4) || (i37 != -1 && (i36 != length4 + 1 || i37 != v01Var.f(length4)))) {
                                c80.j("shouldn't happen: weird successors list");
                                return;
                            }
                            int i38 = 0;
                            while (true) {
                                if (i38 >= length4) {
                                    break;
                                }
                                if (d63VarE.getType(i38).equals(o43.B)) {
                                    length4 = i38 + 1;
                                    break;
                                }
                                i38++;
                            }
                            wp wpVar2 = new wp(length4);
                            int i39 = 0;
                            while (i39 < length4) {
                                wpVar2.f(i39, new vp(new r30(d63VarE.getType(i39)), ((xt[]) b5Var2.i)[v01Var.f(i39)].e()));
                                i39++;
                                iArr2 = iArr2;
                                length3 = length3;
                            }
                            iArr = iArr2;
                            i8 = length3;
                            wpVar2.h = false;
                            obj = wpVar2;
                        }
                        if (wpVar.i.length != 0) {
                            if (wpVar.equals(obj)) {
                                if (zjVar == null) {
                                    um2.f("start == null");
                                    return;
                                } else if (((xt[]) b5Var2.k)[zjVarI.a].e() - ((xt[]) b5Var2.j)[zjVar.a].e() <= 65535) {
                                    zjVar2 = zjVarI;
                                }
                            }
                            if (wpVar.i.length != 0) {
                                arrayList8.add(new yp(((xt[]) b5Var2.j)[zjVar.a].e(), ((xt[]) b5Var2.k)[zjVar2.a].e(), wpVar));
                            }
                            zjVar = zjVarI;
                            zjVar2 = zjVar;
                            wpVar = obj;
                        } else {
                            zjVar = zjVarI;
                            zjVar2 = zjVar;
                            wpVar = obj;
                        }
                    } else {
                        bkVar = bkVar2;
                        iArr = iArr2;
                        i8 = length3;
                    }
                    i35++;
                    bkVar2 = bkVar;
                    iArr2 = iArr;
                    length3 = i8;
                }
                if (wpVar.i.length != 0) {
                    arrayList8.add(new yp(((xt[]) b5Var2.j)[zjVar.a].e(), ((xt[]) b5Var2.k)[zjVar2.a].e(), wpVar));
                }
                int size7 = arrayList8.size();
                if (size7 == 0) {
                    zpVar = zp.j;
                } else {
                    zp zpVar2 = new zp(size7);
                    for (int i40 = 0; i40 < size7; i40++) {
                        zpVar2.f(i40, (yp) arrayList8.get(i40));
                    }
                    zpVar2.h = false;
                    zpVar = zpVar2;
                }
                this.k = zpVar;
                this.i = null;
                this.j = null;
                return;
            }
            a40 a40Var3 = (a40) b40Var.e(i31);
            if (a40Var3 instanceof gc1) {
                a40Var3.e();
                throw null;
            }
            if (a40Var3 instanceof hc1) {
                int iE = a40Var3.e();
                r72 r72Var4 = null;
                int i41 = r72Var4.h;
                r72 r72VarD = q9.d(null);
                q9Var.a(iE, i41);
                r72 r72VarE3 = ((t72) q9Var.d).e(i41);
                if (r72VarE3 == null) {
                    r72VarD.getClass();
                } else {
                    if (r72VarD.i.a().equals(r72VarE3.i.a()) && r72VarD.h == r72VarE3.h) {
                        i9 = i2;
                    }
                    if (i9 == 0) {
                        r72[] r72VarArr = ((t72) q9Var.d).i;
                        int length5 = r72VarArr.length;
                        int i42 = 0;
                        while (true) {
                            if (i42 >= length5) {
                                r72Var = null;
                                break;
                            }
                            r72Var = r72VarArr[i42];
                            if (r72Var != null && r72VarD.i.a().equals(r72Var.i.a())) {
                                break;
                            } else {
                                i42++;
                            }
                        }
                        if (r72Var != null) {
                            q9Var.c(iE, 4, r72Var);
                        }
                        int i43 = ((int[]) q9Var.e)[i41];
                        if (r72VarE3 != null) {
                            q9.b(iE, 3, r72VarE3);
                            throw null;
                        }
                        if (i43 >= 0) {
                            ((ac1) ((ArrayList) obj2).get(i43)).getClass();
                            if (iE == 0) {
                                throw null;
                            }
                        }
                        if (i41 > 0 && (r72VarE2 = ((t72) q9Var.d).e(i41 - 1)) != null && r72VarE2.f()) {
                            q9Var.c(iE, 6, r72VarE2);
                        }
                        if (r72VarD.f() && (r72VarE = ((t72) q9Var.d).e(i41 + 1)) != null) {
                            q9Var.c(iE, 5, r72VarE);
                        }
                        q9.b(iE, i2, r72VarD);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized ArrayList w(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (jj1 jj1Var : (ArrayList) this.i) {
            if (!arrayList.contains(jj1Var.b) && jj1Var.a.isAssignableFrom(cls)) {
                arrayList.add(jj1Var.b);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List x() {
        if (((bf1) this.l) == null) {
            this.l = new bf1(this);
        }
        bf1 bf1Var = (bf1) this.l;
        bf1Var.getClass();
        return bf1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r72 y() {
        int i = ((zj) this.j).d;
        if (i < 0) {
            return null;
        }
        i01 i01Var = (i01) ((bk) ((b5) ((bb2) this.l).d).i).i(i).b.e(0);
        if (i01Var.h.a != 56) {
            return null;
        }
        return i01Var.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c11 z() {
        Matcher matcher = (Matcher) this.i;
        return ci0.X(matcher.start(), matcher.end());
    }

    public kj1(df2 df2Var, int i) {
        this.h = 14;
        eg2 eg2Var = new eg2();
        df2Var = (i & 2) != 0 ? new df2(null, null, null, null, null, null, null, 1023) : df2Var;
        c60 c60Var = o90.a;
        c60Var.getClass();
        this.i = eg2Var;
        this.j = df2Var;
        this.k = c60Var;
        this.l = new dq1(eg2Var);
    }

    public kj1(File file, int i) {
        this.h = i;
        switch (i) {
            case 11:
                this.i = file;
                this.j = new Object();
                this.k = se.o(new eq1(1));
                break;
            default:
                this.i = file;
                this.j = new Object();
                this.k = se.o(new vi1(29));
                break;
        }
    }

    public /* synthetic */ kj1(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    public kj1(kb3 kb3Var, ib3 ib3Var, s20 s20Var) {
        this.h = 17;
        kb3Var.getClass();
        s20Var.getClass();
        this.i = kb3Var;
        this.j = ib3Var;
        this.k = s20Var;
        this.l = new ix2(0);
    }

    public kj1(b5 b5Var) {
        this.h = 0;
        this.i = new ArrayList();
        this.k = new HashSet();
        this.l = b5Var;
        this.j = m;
    }

    public kj1(Socket socket) {
        this.h = 6;
        this.i = socket;
        this.j = new AtomicInteger();
        this.k = new g60(this);
        this.l = new f60(this);
    }

    public kj1(b7 b7Var, ti tiVar) {
        this.h = 3;
        this.i = b7Var;
        this.j = tiVar;
        AutofillManager autofillManager = (AutofillManager) b7Var.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.k = autofillManager;
            b7Var.setImportantForAutofill(1);
            AutofillId autofillId = b7Var.getAutofillId();
            if (autofillId != null) {
                this.l = autofillId;
                return;
            }
            throw vi0.e("Required value was null.");
        }
        s.l("Autofill service could not be located.");
        throw null;
    }

    public kj1(u12 u12Var) {
        this.h = 12;
        this.l = u12Var;
        this.j = t12.h;
    }

    public kj1(ArrayList arrayList, l23 l23Var, td1 td1Var, ContentResolver contentResolver) {
        this.h = 1;
        this.j = l23Var;
        this.k = td1Var;
        this.l = contentResolver;
        this.i = arrayList;
    }

    public kj1(Matcher matcher, CharSequence charSequence) {
        this.h = 8;
        charSequence.getClass();
        this.i = matcher;
        this.j = charSequence;
        this.k = new cf1(0, this);
    }

    public kj1(bb2 bb2Var, dq1 dq1Var) {
        this.h = 13;
        this.l = bb2Var;
        this.i = dq1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kj1(sj0 sj0Var) {
        this(15, new hh1(26, sj0Var));
        this.h = 15;
    }
}
