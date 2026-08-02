package defpackage;

import java.io.File;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wj2 {
    public static final Set h = mg.u0(new rk2[]{rk2.l, rk2.m});
    public final hh1 a;
    public final c20 b;
    public final Clock c;
    public final b5 d;
    public final kl1 e;
    public final LinkedHashMap f;
    public final lq2 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wj2(kj1 kj1Var, b5 b5Var) {
        c60 c60Var = o90.a;
        t50 t50Var = t50.j;
        Clock clockSystemUTC = Clock.systemUTC();
        clockSystemUTC.getClass();
        t50Var.getClass();
        this.a = new hh1(9, kj1Var);
        this.b = t50Var;
        this.c = clockSystemUTC;
        this.d = b5Var;
        this.e = new kl1();
        this.f = new LinkedHashMap();
        this.g = p7.e(64, 1, hn.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ej2 h(z80 z80Var, xj2 xj2Var, fj2 fj2Var, String str, Throwable th) {
        return new ej2(z80Var.b.c, xj2Var, fj2Var, str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static z80 q(z80 z80Var, File file, xi2 xi2Var, xj2 xj2Var) {
        Object next;
        Object next2;
        String str;
        Iterator it = xi2Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((z80) next).a.equals(file)) {
                break;
            }
        }
        z80 z80Var2 = (z80) next;
        fj2 fj2Var = fj2.k;
        if (z80Var2 == null) {
            Iterator it2 = xi2Var.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (t11.l(((zf2) next2).a.getAbsoluteFile(), z80Var.a.getAbsoluteFile())) {
                    break;
                }
            }
            zf2 zf2Var = (zf2) next2;
            boolean zExists = file.exists();
            if (!zExists) {
                fj2Var = fj2.i;
            }
            if (zf2Var == null || (str = zf2Var.c) == null) {
                str = zExists ? "The discovered directory is no longer a valid script." : "The discovered script directory no longer exists.";
            }
            throw h(z80Var, xj2Var, fj2Var, str, zf2Var != null ? zf2Var.d : null);
        }
        th2 th2Var = z80Var2.b;
        th2 th2Var2 = z80Var.b;
        th2 th2Var3 = z80Var.b;
        if (!t11.l(th2Var, th2Var2)) {
            throw new ej2(th2Var3.c, xj2Var, fj2Var, "The script manifest changed after it was discovered.", null);
        }
        String str2 = th2Var3.c;
        str2.getClass();
        List list = xi2Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (t11.l(((z80) obj).b.c, str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1) {
            return z80Var2;
        }
        throw new ej2(th2Var3.c, xj2Var, fj2.j, "Multiple script directories currently declare this id.", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r1.d(r0) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0096 -> B:49:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u00 u00Var) {
        jj2 jj2Var;
        kl1 kl1Var;
        Iterator it;
        Collection collection;
        f52 f52Var;
        u22 u22Var;
        if (u00Var instanceof jj2) {
            jj2Var = (jj2) u00Var;
            int i = jj2Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                jj2Var.r = i - Integer.MIN_VALUE;
            } else {
                jj2Var = new jj2(this, u00Var);
            }
        }
        Object obj = jj2Var.p;
        int i2 = jj2Var.r;
        k20 k20Var = k20.h;
        try {
            if (i2 == 0) {
                fg1.T(obj);
                kl1Var = this.e;
                jj2Var.k = kl1Var;
                jj2Var.r = 1;
            } else if (i2 == 1) {
                kl1Var = jj2Var.k;
                fg1.T(obj);
            } else {
                if (i2 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1 il1Var = jj2Var.o;
                hj2 hj2Var = jj2Var.n;
                it = jj2Var.m;
                collection = jj2Var.l;
                fg1.T(obj);
                il1 il1Var2 = il1Var;
                try {
                    gj2 gj2VarA = hj2Var.a();
                    String str = (gj2VarA == null || (f52Var = gj2VarA.b) == null || (u22Var = f52Var.h) == null) ? null : u22Var.a.c;
                    if (str != null) {
                        collection.add(str);
                    }
                    if (it.hasNext()) {
                        return du.z0(du.n0((List) collection));
                    }
                    hj2Var = (hj2) it.next();
                    il1 il1Var3 = hj2Var.a;
                    jj2Var.k = null;
                    jj2Var.l = collection;
                    jj2Var.m = it;
                    jj2Var.n = hj2Var;
                    jj2Var.o = il1Var3;
                    jj2Var.r = 2;
                    kl1 kl1Var2 = (kl1) il1Var3;
                    Object objD = kl1Var2.d(jj2Var);
                    il1Var2 = kl1Var2;
                } finally {
                    ((kl1) il1Var2).f(null);
                }
            }
            Collection collectionValues = this.f.values();
            collectionValues.getClass();
            List listF0 = du.F0(collectionValues);
            kl1Var.f(null);
            ArrayList arrayList = new ArrayList();
            it = listF0.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } catch (Throwable th) {
            kl1Var.f(null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x0022 */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r10 == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [wj2] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ci2 ci2Var, u00 u00Var) {
        kj2 kj2Var;
        hj2 hj2Var;
        il1 il1Var;
        gj2 gj2VarA;
        bi2 bi2Var;
        f52 f52Var;
        ?? r7;
        if (u00Var instanceof kj2) {
            kj2Var = (kj2) u00Var;
            int i = kj2Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                kj2Var.p = i - Integer.MIN_VALUE;
            } else {
                kj2Var = new kj2(this, u00Var);
            }
        }
        Object objC = kj2Var.n;
        int i2 = kj2Var.p;
        k20 k20Var = k20.h;
        try {
            if (i2 == 0) {
                fg1.T(objC);
                kj2Var.k = ci2Var;
                kj2Var.p = 1;
                objC = c(str, kj2Var);
                if (objC != k20Var) {
                }
                return k20Var;
            }
            if (i2 == 1) {
                ci2Var = kj2Var.k;
                fg1.T(objC);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    il1 il1Var2 = kj2Var.m;
                    fg1.T(objC);
                    this = il1Var2;
                    bi2Var = (bi2) objC;
                    r7 = this;
                    return bi2Var;
                }
                il1 il1Var3 = kj2Var.m;
                hj2Var = kj2Var.l;
                ci2Var = kj2Var.k;
                fg1.T(objC);
                il1Var = il1Var3;
                gj2VarA = hj2Var.a();
                if (gj2VarA != null || (f52Var = gj2VarA.b) == null) {
                    bi2Var = null;
                    r7 = il1Var;
                    return bi2Var;
                }
                kj2Var.k = null;
                kj2Var.l = null;
                kj2Var.m = il1Var;
                kj2Var.p = 3;
                objC = f52Var.e(ci2Var, kj2Var);
                this = il1Var;
            }
            hj2Var = (hj2) objC;
            if (hj2Var == null) {
                return null;
            }
            il1 il1Var4 = hj2Var.a;
            kj2Var.k = ci2Var;
            kj2Var.l = hj2Var;
            kj2Var.m = il1Var4;
            kj2Var.p = 2;
            kl1 kl1Var = (kl1) il1Var4;
            Object objD = kl1Var.d(kj2Var);
            il1Var = kl1Var;
            if (objD != k20Var) {
                gj2VarA = hj2Var.a();
                if (gj2VarA != null) {
                }
                bi2Var = null;
                r7 = il1Var;
                return bi2Var;
            }
            return k20Var;
        } finally {
            ((kl1) this).f(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, u00 u00Var) {
        lj2 lj2Var;
        kl1 kl1Var;
        if (u00Var instanceof lj2) {
            lj2Var = (lj2) u00Var;
            int i = lj2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                lj2Var.o = i - Integer.MIN_VALUE;
            } else {
                lj2Var = new lj2(this, u00Var);
            }
        }
        Object obj = lj2Var.m;
        int i2 = lj2Var.o;
        if (i2 == 0) {
            fg1.T(obj);
            lj2Var.k = str;
            kl1Var = this.e;
            lj2Var.l = kl1Var;
            lj2Var.o = 1;
            Object objD = kl1Var.d(lj2Var);
            k20 k20Var = k20.h;
            if (objD == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kl1 kl1Var2 = lj2Var.l;
            String str2 = lj2Var.k;
            fg1.T(obj);
            kl1Var = kl1Var2;
            str = str2;
        }
        try {
            return (hj2) this.f.get(str);
        } finally {
            kl1Var.f(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(z80 z80Var, xj2 xj2Var, u00 u00Var) throws bh2, dg2 {
        mj2 mj2Var;
        File absoluteFile;
        Object objI;
        wj2 wj2Var;
        z80 z80Var2;
        xj2 xj2Var2;
        wi2 wi2Var;
        File file;
        z80 z80Var3;
        xj2 xj2Var3;
        z80 z80Var4;
        u22 u22Var;
        xj2 xj2Var4;
        wj2 wj2Var2 = this;
        z80 z80Var5 = z80Var;
        if (u00Var instanceof mj2) {
            mj2Var = (mj2) u00Var;
            int i = mj2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                mj2Var.v = i - Integer.MIN_VALUE;
            } else {
                mj2Var = new mj2(wj2Var2, u00Var);
            }
        }
        Object objM = mj2Var.t;
        int i2 = mj2Var.v;
        c20 c20Var = wj2Var2.b;
        k20 k20Var = k20.h;
        if (i2 == 0) {
            fg1.T(objM);
            absoluteFile = z80Var5.a.getAbsoluteFile();
            File parentFile = absoluteFile.getParentFile();
            if (parentFile == null) {
                throw new ej2(z80Var5.b.c, xj2Var, fj2.i, "The discovered script directory has no parent repository.", null);
            }
            wi2 wi2Var2 = new wi2(parentFile, c20Var, 2);
            mj2Var.k = z80Var5;
            mj2Var.l = xj2Var;
            mj2Var.m = absoluteFile;
            mj2Var.n = wi2Var2;
            mj2Var.o = wj2Var2;
            mj2Var.p = z80Var5;
            mj2Var.q = absoluteFile;
            mj2Var.v = 1;
            objI = wj2Var2.i(wi2Var2, z80Var5, xj2Var, mj2Var);
            if (objI != k20Var) {
                wj2Var = wj2Var2;
                z80Var2 = z80Var5;
                xj2Var2 = xj2Var;
                wi2Var = wi2Var2;
                file = absoluteFile;
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                File file2 = mj2Var.s;
                z80Var4 = mj2Var.r;
                wj2 wj2Var3 = (wj2) mj2Var.q;
                u22Var = (u22) mj2Var.p;
                z80Var3 = (z80) mj2Var.o;
                xj2Var4 = mj2Var.l;
                fg1.T(objM);
                file = file2;
                wj2Var2 = wj2Var3;
                wj2Var2.getClass();
                q(z80Var4, file, (xi2) objM, xj2Var4);
                return new ij2(z80Var3.a, u22Var);
            }
            z80 z80Var6 = (z80) mj2Var.o;
            wi2Var = mj2Var.n;
            File file3 = mj2Var.m;
            xj2 xj2Var5 = mj2Var.l;
            z80 z80Var7 = mj2Var.k;
            fg1.T(objM);
            file = file3;
            xj2Var3 = xj2Var5;
            z80Var3 = z80Var6;
            z80Var4 = z80Var7;
            u22Var = (u22) objM;
            if (u22Var.a.equals(z80Var4.b)) {
                throw new ej2(z80Var4.b.c, xj2Var3, fj2.k, "The script manifest changed after it was discovered.", null);
            }
            file.getClass();
            mj2Var.k = null;
            mj2Var.l = xj2Var3;
            mj2Var.m = null;
            mj2Var.n = null;
            mj2Var.o = z80Var3;
            mj2Var.p = u22Var;
            mj2Var.q = wj2Var2;
            mj2Var.r = z80Var4;
            mj2Var.s = file;
            mj2Var.v = 3;
            objM = wj2Var2.i(wi2Var, z80Var4, xj2Var3, mj2Var);
            if (objM != k20Var) {
                xj2Var4 = xj2Var3;
                wj2Var2.getClass();
                q(z80Var4, file, (xi2) objM, xj2Var4);
                return new ij2(z80Var3.a, u22Var);
            }
            return k20Var;
        }
        File file4 = (File) mj2Var.q;
        z80 z80Var8 = (z80) mj2Var.p;
        wj2 wj2Var4 = (wj2) mj2Var.o;
        wi2 wi2Var3 = mj2Var.n;
        file = mj2Var.m;
        xj2Var2 = mj2Var.l;
        z80Var2 = mj2Var.k;
        fg1.T(objM);
        absoluteFile = file4;
        z80Var5 = z80Var8;
        wi2Var = wi2Var3;
        wj2Var = wj2Var4;
        objI = objM;
        wj2Var.getClass();
        z80 z80VarQ = q(z80Var5, absoluteFile, (xi2) objI, xj2Var2);
        oh2 oh2Var = new oh2(new sz0(z80VarQ.a, c20Var));
        mj2Var.k = z80Var2;
        mj2Var.l = xj2Var2;
        mj2Var.m = file;
        mj2Var.n = wi2Var;
        mj2Var.o = z80VarQ;
        mj2Var.p = null;
        mj2Var.q = null;
        mj2Var.v = 2;
        objM = ((dq1) ((kj1) wj2Var2.a.i).l).M(oh2Var, mj2Var);
        if (objM != k20Var) {
            z80Var3 = z80VarQ;
            xj2Var3 = xj2Var2;
            z80Var4 = z80Var2;
            u22Var = (u22) objM;
            if (u22Var.a.equals(z80Var4.b)) {
            }
        }
        return k20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(dj2 dj2Var) {
        qh2 qh2Var;
        this.g.p(dj2Var);
        boolean z = dj2Var instanceof aj2;
        ph2 ph2Var = ph2.i;
        sh2 sh2Var = sh2.i;
        if (z) {
            aj2 aj2Var = (aj2) dj2Var;
            Instant instant = aj2Var.a;
            String lowerCase = aj2Var.b.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            qh2Var = new qh2(instant, ph2Var, sh2Var, "Starting script for " + lowerCase + ".", aj2Var.d.c, null, null);
        } else if (dj2Var instanceof zi2) {
            zi2 zi2Var = (zi2) dj2Var;
            qh2Var = new qh2(zi2Var.a, ph2Var, sh2Var, vi0.j("Script is running on QuickJS ", zi2Var.e, "."), zi2Var.d.c, null, null);
        } else if (dj2Var instanceof cj2) {
            cj2 cj2Var = (cj2) dj2Var;
            Instant instant2 = cj2Var.a;
            String lowerCase2 = cj2Var.b.name().toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            qh2Var = new qh2(instant2, ph2Var, sh2Var, "Stopping script for " + lowerCase2 + ".", cj2Var.d.c, null, null);
        } else if (dj2Var instanceof bj2) {
            bj2 bj2Var = (bj2) dj2Var;
            qh2Var = new qh2(bj2Var.a, ph2Var, sh2Var, "Script stopped.", bj2Var.d.c, null, null);
        } else {
            if (!(dj2Var instanceof yi2)) {
                c80.s();
                return;
            }
            yi2 yi2Var = (yi2) dj2Var;
            Throwable th = yi2Var.g;
            Instant instant3 = yi2Var.a;
            ph2 ph2Var2 = th instanceof CancellationException ? ph2.j : ph2.k;
            if (yi2Var.e != null) {
                sh2Var = sh2.h;
            }
            sh2 sh2Var2 = sh2Var;
            String message = th.getMessage();
            if (message == null) {
                message = "Script operation failed.";
            }
            qh2Var = new qh2(instant3, ph2Var2, sh2Var2, message, yi2Var.d.c, yi2Var.e, th);
        }
        this.d.f(qh2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(xj2 xj2Var, File file, th2 th2Var, Throwable th) {
        Instant instant = this.c.instant();
        instant.getClass();
        dg2 dg2Var = th instanceof dg2 ? (dg2) th : null;
        si2 si2Var = dg2Var != null ? dg2Var.h : null;
        ej2 ej2Var = th instanceof ej2 ? (ej2) th : null;
        e(new yi2(instant, xj2Var, file, th2Var, si2Var, ej2Var != null ? ej2Var.h : null, th));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0034 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0023 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:22:0x0045, B:42:0x00b4, B:35:0x0099, B:37:0x009f), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4 A[Catch: all -> 0x004a, PHI: r1 r4 r5 r10
  0x00b4: PHI (r1v5 hj2) = (r1v4 hj2), (r1v6 hj2) binds: [B:36:0x009d, B:41:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r4v6 xj2) = (r4v4 xj2), (r4v8 xj2) binds: [B:36:0x009d, B:41:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r5v5 ??) = (r5v8 ??), (r5v6 ??) binds: [B:36:0x009d, B:41:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r10v7 ??) = (r10v16 ??), (r10v17 ??) binds: [B:36:0x009d, B:41:0x00b2] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:22:0x0045, B:42:0x00b4, B:35:0x0099, B:37:0x009f), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [z80] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v4, types: [z80] */
    /* JADX WARN: Type inference failed for: r10v7, types: [il1] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [z80] */
    /* JADX WARN: Type inference failed for: r5v5, types: [z80] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r9v0, types: [wj2] */
    /* JADX WARN: Type inference failed for: r9v10, types: [il1] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(z80 z80Var, u00 u00Var) throws Throwable {
        nj2 nj2Var;
        Throwable th;
        ?? r9;
        xj2 xj2Var;
        ?? r10;
        ?? r5;
        il1 il1Var;
        xj2 xj2Var2;
        hj2 hj2Var;
        gj2 gj2VarA;
        xj2 xj2Var3;
        ?? r4;
        ?? r52;
        il1 il1Var2;
        if (u00Var instanceof nj2) {
            nj2Var = (nj2) u00Var;
            int i = nj2Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj2Var.q = i - Integer.MIN_VALUE;
            } else {
                nj2Var = new nj2(this, u00Var);
            }
        }
        Object objJ = nj2Var.o;
        int i2 = nj2Var.q;
        k20 k20Var = k20.h;
        try {
            if (i2 == 0) {
                fg1.T(objJ);
                String str = z80Var.b.c;
                nj2Var.k = z80Var;
                xj2Var = xj2.j;
                nj2Var.l = xj2Var;
                nj2Var.q = 1;
                objJ = j(str, nj2Var);
                r10 = z80Var;
                if (objJ != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r9 = nj2Var.n;
                        try {
                            fg1.T(objJ);
                            r9 = r9;
                            f52 f52Var = (f52) objJ;
                            ((kl1) r9).f(null);
                            return f52Var;
                        } catch (Throwable th2) {
                            th = th2;
                            ((kl1) r9).f(null);
                            throw th;
                        }
                    }
                    il1 il1Var3 = nj2Var.n;
                    hj2Var = nj2Var.m;
                    xj2Var3 = nj2Var.l;
                    z80 z80Var2 = nj2Var.k;
                    fg1.T(objJ);
                    r4 = z80Var2;
                    il1Var2 = il1Var3;
                    r52 = r4;
                    xj2Var2 = xj2Var3;
                    z80Var = il1Var2;
                    nj2Var.k = null;
                    nj2Var.l = null;
                    nj2Var.m = null;
                    nj2Var.n = z80Var;
                    nj2Var.q = 4;
                    objJ = m(r52, hj2Var, xj2Var2, nj2Var);
                    if (objJ != k20Var) {
                        r9 = z80Var;
                        f52 f52Var2 = (f52) objJ;
                        ((kl1) r9).f(null);
                        return f52Var2;
                    }
                    return k20Var;
                }
                il1 il1Var4 = nj2Var.n;
                hj2Var = nj2Var.m;
                xj2Var2 = nj2Var.l;
                z80 z80Var3 = nj2Var.k;
                fg1.T(objJ);
                r5 = z80Var3;
                il1Var = il1Var4;
                gj2VarA = hj2Var.a();
                r52 = r5;
                z80Var = il1Var;
                if (gj2VarA == null) {
                    nj2Var.k = r5;
                    nj2Var.l = xj2Var2;
                    nj2Var.m = hj2Var;
                    nj2Var.n = il1Var;
                    nj2Var.q = 3;
                    if (p(hj2Var, gj2VarA, xj2Var2, nj2Var) != k20Var) {
                        xj2Var3 = xj2Var2;
                        r4 = r5;
                        il1Var2 = il1Var;
                        r52 = r4;
                        xj2Var2 = xj2Var3;
                        z80Var = il1Var2;
                        nj2Var.k = null;
                        nj2Var.l = null;
                        nj2Var.m = null;
                        nj2Var.n = z80Var;
                        nj2Var.q = 4;
                        objJ = m(r52, hj2Var, xj2Var2, nj2Var);
                        if (objJ != k20Var) {
                        }
                    }
                } else {
                    nj2Var.k = null;
                    nj2Var.l = null;
                    nj2Var.m = null;
                    nj2Var.n = z80Var;
                    nj2Var.q = 4;
                    objJ = m(r52, hj2Var, xj2Var2, nj2Var);
                    if (objJ != k20Var) {
                    }
                }
                return k20Var;
            }
            xj2 xj2Var4 = nj2Var.l;
            z80 z80Var4 = nj2Var.k;
            fg1.T(objJ);
            xj2Var = xj2Var4;
            r10 = z80Var4;
            hj2 hj2Var2 = (hj2) objJ;
            il1 il1Var5 = hj2Var2.a;
            nj2Var.k = r10;
            nj2Var.l = xj2Var;
            nj2Var.m = hj2Var2;
            nj2Var.n = il1Var5;
            nj2Var.q = 2;
            kl1 kl1Var = (kl1) il1Var5;
            if (kl1Var.d(nj2Var) != k20Var) {
                r5 = r10;
                il1Var = kl1Var;
                xj2Var2 = xj2Var;
                hj2Var = hj2Var2;
                gj2VarA = hj2Var.a();
                r52 = r5;
                z80Var = il1Var;
                if (gj2VarA == null) {
                }
            }
            return k20Var;
        } catch (Throwable th3) {
            ?? r8 = z80Var;
            th = th3;
            r9 = r8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(wi2 wi2Var, z80 z80Var, xj2 xj2Var, u00 u00Var) {
        oj2 oj2Var;
        if (u00Var instanceof oj2) {
            oj2Var = (oj2) u00Var;
            int i = oj2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oj2Var.o = i - Integer.MIN_VALUE;
            } else {
                oj2Var = new oj2(this, u00Var);
            }
        }
        Object objR = oj2Var.m;
        int i2 = oj2Var.o;
        try {
            if (i2 == 0) {
                fg1.T(objR);
                oj2Var.k = z80Var;
                oj2Var.l = xj2Var;
                oj2Var.o = 1;
                objR = p7.R(wi2Var.b, new vi2(wi2Var, null), oj2Var);
                k20 k20Var = k20.h;
                if (objR == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xj2Var = oj2Var.l;
                z80Var = oj2Var.k;
                fg1.T(objR);
            }
            return (xi2) objR;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            throw h(z80Var, xj2Var, fj2.i, "Unable to rescan the script repository before starting.", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, u00 u00Var) {
        pj2 pj2Var;
        kl1 kl1Var;
        if (u00Var instanceof pj2) {
            pj2Var = (pj2) u00Var;
            int i = pj2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                pj2Var.o = i - Integer.MIN_VALUE;
            } else {
                pj2Var = new pj2(this, u00Var);
            }
        }
        Object obj = pj2Var.m;
        int i2 = pj2Var.o;
        if (i2 == 0) {
            fg1.T(obj);
            pj2Var.k = str;
            kl1Var = this.e;
            pj2Var.l = kl1Var;
            pj2Var.o = 1;
            Object objD = kl1Var.d(pj2Var);
            k20 k20Var = k20.h;
            if (objD == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kl1 kl1Var2 = pj2Var.l;
            String str2 = pj2Var.k;
            fg1.T(obj);
            kl1Var = kl1Var2;
            str = str2;
        }
        try {
            LinkedHashMap linkedHashMap = this.f;
            Object hj2Var = linkedHashMap.get(str);
            if (hj2Var == null) {
                hj2Var = new hj2();
                linkedHashMap.put(str, hj2Var);
            }
            hj2 hj2Var2 = (hj2) hj2Var;
            kl1Var.f(null);
            return hj2Var2;
        } catch (Throwable th) {
            kl1Var.f(null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2.d(r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r14 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0096 -> B:41:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(u00 u00Var) {
        qj2 qj2Var;
        kl1 kl1Var;
        Iterator it;
        Collection collection;
        me1 me1Var;
        if (u00Var instanceof qj2) {
            qj2Var = (qj2) u00Var;
            int i = qj2Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                qj2Var.r = i - Integer.MIN_VALUE;
            } else {
                qj2Var = new qj2(this, u00Var);
            }
        }
        Object obj = qj2Var.p;
        k20 k20Var = k20.h;
        int i2 = qj2Var.r;
        try {
            if (i2 == 0) {
                fg1.T(obj);
                kl1Var = this.e;
                qj2Var.k = kl1Var;
                qj2Var.r = 1;
            } else if (i2 == 1) {
                kl1Var = qj2Var.k;
                fg1.T(obj);
            } else {
                if (i2 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1 il1Var = qj2Var.o;
                hj2 hj2Var = qj2Var.n;
                it = qj2Var.m;
                collection = qj2Var.l;
                fg1.T(obj);
                il1 il1Var2 = il1Var;
                try {
                    gj2 gj2VarA = hj2Var.a();
                    if (gj2VarA == null) {
                        me1Var = null;
                    } else {
                        f52 f52Var = gj2VarA.b;
                        th2 th2Var = f52Var.h.a;
                        me1Var = new me1(th2Var.c, gj2VarA.a, th2Var, f52Var.o, gj2VarA.b.p);
                    }
                    if (me1Var != null) {
                        collection.add(me1Var);
                    }
                    if (it.hasNext()) {
                        return new yj2(du.A0((List) collection, new sl0(24)));
                    }
                    hj2Var = (hj2) it.next();
                    il1 il1Var3 = hj2Var.a;
                    qj2Var.k = null;
                    qj2Var.l = collection;
                    qj2Var.m = it;
                    qj2Var.n = hj2Var;
                    qj2Var.o = il1Var3;
                    qj2Var.r = 2;
                    kl1 kl1Var2 = (kl1) il1Var3;
                    Object objD = kl1Var2.d(qj2Var);
                    il1Var2 = kl1Var2;
                } finally {
                    ((kl1) il1Var2).f(null);
                }
            }
            Collection collectionValues = this.f.values();
            collectionValues.getClass();
            List listF0 = du.F0(collectionValues);
            kl1Var.f(null);
            ArrayList arrayList = new ArrayList();
            it = listF0.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } catch (Throwable th) {
            kl1Var.f(null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #1 {all -> 0x00a8, blocks: (B:30:0x0088, B:32:0x008e, B:41:0x00ad, B:42:0x00d6), top: B:47:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad A[Catch: all -> 0x00a8, TRY_ENTER, TryCatch #1 {all -> 0x00a8, blocks: (B:30:0x0088, B:32:0x008e, B:41:0x00ad, B:42:0x00d6), top: B:47:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(z80 z80Var, u00 u00Var) throws Throwable {
        rj2 rj2Var;
        xj2 xj2Var;
        z80 z80Var2;
        il1 il1Var;
        xj2 xj2Var2;
        hj2 hj2Var;
        Throwable th;
        il1 il1Var2;
        gj2 gj2VarA;
        if (u00Var instanceof rj2) {
            rj2Var = (rj2) u00Var;
            int i = rj2Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                rj2Var.q = i - Integer.MIN_VALUE;
            } else {
                rj2Var = new rj2(this, u00Var);
            }
        }
        Object objM = rj2Var.o;
        Object obj = k20.h;
        int i2 = rj2Var.q;
        if (i2 == 0) {
            fg1.T(objM);
            xj2 xj2Var3 = xj2.h;
            String str = z80Var.b.c;
            rj2Var.k = z80Var;
            rj2Var.l = xj2Var3;
            rj2Var.q = 1;
            Object objJ = j(str, rj2Var);
            if (objJ != obj) {
                xj2Var = xj2Var3;
                objM = objJ;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = rj2Var.n;
                try {
                    fg1.T(objM);
                    f52 f52Var = (f52) objM;
                    ((kl1) il1Var2).f(null);
                    return f52Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).f(null);
                    throw th;
                }
            }
            il1Var = rj2Var.n;
            hj2Var = rj2Var.m;
            xj2Var2 = rj2Var.l;
            z80Var2 = rj2Var.k;
            fg1.T(objM);
            try {
                gj2VarA = hj2Var.a();
                if (gj2VarA == null) {
                    Throwable thH = h(z80Var2, xj2Var2, fj2.h, "A script session is already active with state " + gj2VarA.b.o + ".", null);
                    File absoluteFile = z80Var2.a.getAbsoluteFile();
                    absoluteFile.getClass();
                    f(xj2Var2, absoluteFile, z80Var2.b, thH);
                    throw thH;
                }
                rj2Var.k = null;
                rj2Var.l = null;
                rj2Var.m = null;
                rj2Var.n = il1Var;
                rj2Var.q = 3;
                objM = m(z80Var2, hj2Var, xj2Var2, rj2Var);
                if (objM != obj) {
                    il1Var2 = il1Var;
                    f52 f52Var2 = (f52) objM;
                    ((kl1) il1Var2).f(null);
                    return f52Var2;
                }
                return obj;
            } catch (Throwable th3) {
                il1 il1Var3 = il1Var;
                th = th3;
                il1Var2 = il1Var3;
                ((kl1) il1Var2).f(null);
                throw th;
            }
        }
        xj2 xj2Var4 = rj2Var.l;
        z80 z80Var3 = rj2Var.k;
        fg1.T(objM);
        xj2Var = xj2Var4;
        z80Var = z80Var3;
        hj2 hj2Var2 = (hj2) objM;
        il1 il1Var4 = hj2Var2.a;
        rj2Var.k = z80Var;
        rj2Var.l = xj2Var;
        rj2Var.m = hj2Var2;
        rj2Var.n = il1Var4;
        rj2Var.q = 2;
        kl1 kl1Var = (kl1) il1Var4;
        if (kl1Var.d(rj2Var) != obj) {
            z80Var2 = z80Var;
            il1Var = kl1Var;
            xj2Var2 = xj2Var;
            hj2Var = hj2Var2;
            gj2VarA = hj2Var.a();
            if (gj2VarA == null) {
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v15, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r11v16, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r11v17, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r11v18, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r11v7, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r11v8, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r11v9, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: z80 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: z80 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v23, resolved type: z80 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v24, resolved type: z80 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: z80 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: z80 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: z80 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: z80 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(z80 z80Var, hj2 hj2Var, xj2 xj2Var, u00 u00Var) throws Throwable {
        sj2 sj2Var;
        Throwable th;
        Throwable th2;
        hj2 hj2Var2;
        Object objD;
        File absoluteFile;
        ij2 ij2Var;
        z80 z80Var2;
        File file;
        z80 z80Var3;
        File file2;
        File file3;
        z80 z80Var4;
        hj2 hj2Var3;
        xj2 xj2Var2;
        if (u00Var instanceof sj2) {
            sj2Var = (sj2) u00Var;
            int i = sj2Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                sj2Var.r = i - Integer.MIN_VALUE;
            } else {
                sj2Var = new sj2(this, u00Var);
            }
        }
        sj2 sj2Var2 = sj2Var;
        Object obj = sj2Var2.p;
        Object obj2 = k20.h;
        int i2 = sj2Var2.r;
        if (i2 == 0) {
            fg1.T(obj);
            absoluteFile = z80Var.a.getAbsoluteFile();
            Instant instant = this.c.instant();
            instant.getClass();
            absoluteFile.getClass();
            e(new aj2(instant, xj2Var, absoluteFile, z80Var.b));
            try {
                sj2Var2.k = z80Var;
                sj2Var2.l = hj2Var;
                sj2Var2.m = xj2Var;
                sj2Var2.n = absoluteFile;
                sj2Var2.r = 1;
                objD = d(z80Var, xj2Var, sj2Var2);
                hj2Var2 = hj2Var;
                if (objD == obj2) {
                }
                return obj2;
            } catch (CancellationException e) {
                z80Var3 = z80Var;
                th2 = e;
                file2 = absoluteFile;
                file2.getClass();
                f(xj2Var, file2, z80Var3.b, th2);
                throw th2;
            } catch (Throwable th3) {
                z80Var2 = z80Var;
                th = th3;
                file = absoluteFile;
                file.getClass();
                f(xj2Var, file, z80Var2.b, th);
                throw th;
            }
        }
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ij2Var = sj2Var2.o;
                File file4 = sj2Var2.n;
                xj2Var = sj2Var2.m;
                hj2 hj2Var4 = sj2Var2.l;
                z80 z80Var5 = sj2Var2.k;
                fg1.T(obj);
                hj2Var3 = hj2Var4;
                z80Var4 = z80Var5;
                file3 = file4;
                xj2Var2 = xj2Var;
                try {
                    f52 f52Var = (f52) obj;
                    hj2Var3.b = new gj2(ij2Var.a, f52Var);
                    Instant instant2 = this.c.instant();
                    instant2.getClass();
                    e(new zi2(instant2, xj2Var2, ij2Var.a, f52Var.h.a, f52Var.p));
                    return f52Var;
                } catch (CancellationException e2) {
                    th2 = e2;
                    xj2Var = xj2Var2;
                    z80Var3 = z80Var4;
                    file2 = file3;
                    file2.getClass();
                    f(xj2Var, file2, z80Var3.b, th2);
                    throw th2;
                } catch (Throwable th4) {
                    th = th4;
                    xj2Var = xj2Var2;
                    z80Var2 = z80Var4;
                    file = file3;
                    file.getClass();
                    f(xj2Var, file, z80Var2.b, th);
                    throw th;
                }
            }
            File file5 = sj2Var2.n;
            xj2Var = sj2Var2.m;
            hj2 hj2Var5 = sj2Var2.l;
            z80 z80Var6 = sj2Var2.k;
            fg1.T(obj);
            hj2Var2 = hj2Var5;
            z80Var = z80Var6;
            objD = obj;
            absoluteFile = file5;
        } catch (CancellationException e3) {
            th2 = e3;
            z80Var3 = i2;
            file2 = hj2Var;
            file2.getClass();
            f(xj2Var, file2, z80Var3.b, th2);
            throw th2;
        } catch (Throwable th5) {
            th = th5;
            z80Var2 = i2;
            file = hj2Var;
            file.getClass();
            f(xj2Var, file, z80Var2.b, th);
            throw th;
        }
        ij2 ij2Var2 = (ij2) objD;
        hh1 hh1Var = this.a;
        u22 u22Var = ij2Var2.b;
        sj2Var2.k = z80Var;
        sj2Var2.l = hj2Var2;
        sj2Var2.m = xj2Var;
        sj2Var2.n = absoluteFile;
        sj2Var2.o = ij2Var2;
        sj2Var2.r = 2;
        kj1 kj1Var = (kj1) hh1Var.i;
        Object objZ = f52.q.z(u22Var, (eg2) kj1Var.i, (df2) kj1Var.j, (c20) kj1Var.k, sj2Var2);
        if (objZ != obj2) {
            hj2Var3 = hj2Var2;
            file3 = absoluteFile;
            obj = objZ;
            z80Var4 = z80Var;
            ij2Var = ij2Var2;
            xj2Var2 = xj2Var;
            f52 f52Var2 = (f52) obj;
            hj2Var3.b = new gj2(ij2Var.a, f52Var2);
            Instant instant22 = this.c.instant();
            instant22.getClass();
            e(new zi2(instant22, xj2Var2, ij2Var.a, f52Var2.h.a, f52Var2.p));
            return f52Var2;
        }
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:42:0x0096, B:33:0x0075, B:36:0x007d), top: B:49:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, xj2 xj2Var, u00 u00Var) throws Throwable {
        tj2 tj2Var;
        xj2 xj2Var2;
        hj2 hj2Var;
        il1 il1Var;
        gj2 gj2VarA;
        il1 il1Var2;
        boolean zBooleanValue;
        if (u00Var instanceof tj2) {
            tj2Var = (tj2) u00Var;
            int i = tj2Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                tj2Var.p = i - Integer.MIN_VALUE;
            } else {
                tj2Var = new tj2(this, u00Var);
            }
        }
        Object objC = tj2Var.n;
        int i2 = tj2Var.p;
        Object obj = k20.h;
        if (i2 == 0) {
            fg1.T(objC);
            tj2Var.k = xj2Var;
            tj2Var.p = 1;
            objC = c(str, tj2Var);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = tj2Var.m;
                try {
                    fg1.T(objC);
                    il1Var = il1Var2;
                    zBooleanValue = ((Boolean) objC).booleanValue();
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    ((kl1) il1Var).f(null);
                    return boolValueOf;
                } catch (Throwable th) {
                    th = th;
                    ((kl1) il1Var2).f(null);
                    throw th;
                }
            }
            il1Var = tj2Var.m;
            hj2Var = tj2Var.l;
            xj2Var2 = tj2Var.k;
            fg1.T(objC);
            try {
                gj2VarA = hj2Var.a();
                if (gj2VarA != null) {
                    zBooleanValue = false;
                    Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                    ((kl1) il1Var).f(null);
                    return boolValueOf2;
                }
                tj2Var.k = null;
                tj2Var.l = null;
                tj2Var.m = il1Var;
                tj2Var.p = 3;
                objC = p(hj2Var, gj2VarA, xj2Var2, tj2Var);
                if (objC != obj) {
                    il1Var2 = il1Var;
                    il1Var = il1Var2;
                    zBooleanValue = ((Boolean) objC).booleanValue();
                    Boolean boolValueOf22 = Boolean.valueOf(zBooleanValue);
                    ((kl1) il1Var).f(null);
                    return boolValueOf22;
                }
                return obj;
            } catch (Throwable th2) {
                il1 il1Var3 = il1Var;
                th = th2;
                il1Var2 = il1Var3;
                ((kl1) il1Var2).f(null);
                throw th;
            }
        }
        xj2Var = tj2Var.k;
        fg1.T(objC);
        hj2 hj2Var2 = (hj2) objC;
        if (hj2Var2 == null) {
            return Boolean.FALSE;
        }
        il1 il1Var4 = hj2Var2.a;
        tj2Var.k = xj2Var;
        tj2Var.l = hj2Var2;
        tj2Var.m = il1Var4;
        tj2Var.p = 2;
        kl1 kl1Var = (kl1) il1Var4;
        if (kl1Var.d(tj2Var) != obj) {
            xj2Var2 = xj2Var;
            hj2Var = hj2Var2;
            il1Var = kl1Var;
            gj2VarA = hj2Var.a();
            if (gj2VarA != null) {
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(u00 u00Var) throws Throwable {
        uj2 uj2Var;
        if (u00Var instanceof uj2) {
            uj2Var = (uj2) u00Var;
            int i = uj2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                uj2Var.m = i - Integer.MIN_VALUE;
            } else {
                uj2Var = new uj2(this, u00Var);
            }
        }
        Object objA = uj2Var.k;
        int i2 = uj2Var.m;
        t00 t00Var = null;
        Object obj = k20.h;
        if (i2 == 0) {
            fg1.T(objA);
            uj2Var.m = 1;
            objA = a(uj2Var);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(objA);
                return new sk2(du.A0((List) objA, new sl0(25)));
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.T(objA);
        b2 b2Var = new b2((List) objA, this, t00Var, 16);
        uj2Var.m = 2;
        lw2 lw2Var = new lw2(uj2Var, uj2Var.f());
        objA = ze3.b(lw2Var, true, lw2Var, b2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: f52 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [hj2, u00, vj2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(hj2 hj2Var, gj2 gj2Var, xj2 xj2Var, u00 u00Var) {
        ?? vj2Var;
        th2 th2Var;
        Throwable th;
        CancellationException e;
        hj2 hj2Var2;
        if (u00Var instanceof vj2) {
            vj2 vj2Var2 = (vj2) u00Var;
            int i = vj2Var2.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                vj2Var2.q = i - Integer.MIN_VALUE;
                vj2Var = vj2Var2;
            } else {
                vj2Var = new vj2(this, u00Var);
            }
        }
        Object obj = vj2Var.o;
        int i2 = vj2Var.q;
        Clock clock = this.c;
        try {
            if (i2 == 0) {
                fg1.T(obj);
                th2 th2Var2 = gj2Var.b.h.a;
                Instant instant = clock.instant();
                instant.getClass();
                e(new cj2(instant, xj2Var, gj2Var.a, th2Var2));
                try {
                    f52 f52Var = gj2Var.b;
                    vj2Var.k = hj2Var;
                    vj2Var.l = gj2Var;
                    vj2Var.m = xj2Var;
                    vj2Var.n = th2Var2;
                    vj2Var.q = 1;
                    Object objK = f52Var.k(vj2Var);
                    k20 k20Var = k20.h;
                    if (objK == k20Var) {
                        return k20Var;
                    }
                    hj2Var2 = hj2Var;
                    th2Var = th2Var2;
                } catch (CancellationException e2) {
                    th2Var = th2Var2;
                    e = e2;
                    this.f(xj2Var, gj2Var.a, th2Var, e);
                    throw e;
                } catch (Throwable th2) {
                    th2Var = th2Var2;
                    th = th2;
                    this.f(xj2Var, gj2Var.a, th2Var, th);
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th2Var = vj2Var.n;
                xj2Var = vj2Var.m;
                gj2Var = vj2Var.l;
                hj2Var2 = vj2Var.k;
                try {
                    fg1.T(obj);
                } catch (CancellationException e3) {
                    e = e3;
                    this.f(xj2Var, gj2Var.a, th2Var, e);
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    this.f(xj2Var, gj2Var.a, th2Var, th);
                    throw th;
                }
            }
            Instant instant2 = clock.instant();
            instant2.getClass();
            e(new bj2(instant2, xj2Var, gj2Var.a, th2Var));
            Boolean bool = Boolean.TRUE;
            hj2Var2.b = null;
            return bool;
        } catch (Throwable th4) {
            vj2Var.b = null;
            throw th4;
        }
    }
}
