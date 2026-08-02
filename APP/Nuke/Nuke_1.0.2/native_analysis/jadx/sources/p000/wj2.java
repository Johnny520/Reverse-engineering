package p000;

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

    /* JADX INFO: renamed from: h */
    public static final Set f12541h = AbstractC0460mg.m3106u0(new rk2[]{rk2.f9628l, rk2.f9629m});

    /* JADX INFO: renamed from: a */
    public final hh1 f12542a;

    /* JADX INFO: renamed from: b */
    public final c20 f12543b;

    /* JADX INFO: renamed from: c */
    public final Clock f12544c;

    /* JADX INFO: renamed from: d */
    public final C0043b5 f12545d;

    /* JADX INFO: renamed from: e */
    public final kl1 f12546e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f12547f;

    /* JADX INFO: renamed from: g */
    public final lq2 f12548g;

    public wj2(kj1 kj1Var, C0043b5 c0043b5) {
        c60 c60Var = o90.f7590a;
        t50 t50Var = t50.f10560j;
        Clock clockSystemUTC = Clock.systemUTC();
        clockSystemUTC.getClass();
        t50Var.getClass();
        this.f12542a = new hh1(9, kj1Var);
        this.f12543b = t50Var;
        this.f12544c = clockSystemUTC;
        this.f12545d = c0043b5;
        this.f12546e = new kl1();
        this.f12547f = new LinkedHashMap();
        this.f12548g = AbstractC0570p7.m3769e(64, 1, EnumC0283hn.f4085i);
    }

    /* JADX INFO: renamed from: h */
    public static ej2 m5922h(z80 z80Var, xj2 xj2Var, fj2 fj2Var, String str, Throwable th) {
        return new ej2(z80Var.f13783b.f10774c, xj2Var, fj2Var, str, th);
    }

    /* JADX INFO: renamed from: q */
    public static z80 m5923q(z80 z80Var, File file, xi2 xi2Var, xj2 xj2Var) {
        Object next;
        Object next2;
        String str;
        Iterator it = xi2Var.f13046a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((z80) next).f13782a.equals(file)) {
                break;
            }
        }
        z80 z80Var2 = (z80) next;
        fj2 fj2Var = fj2.f3020k;
        if (z80Var2 == null) {
            Iterator it2 = xi2Var.f13047b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (t11.m5086l(((zf2) next2).f13876a.getAbsoluteFile(), z80Var.f13782a.getAbsoluteFile())) {
                    break;
                }
            }
            zf2 zf2Var = (zf2) next2;
            boolean zExists = file.exists();
            if (!zExists) {
                fj2Var = fj2.f3018i;
            }
            if (zf2Var == null || (str = zf2Var.f13878c) == null) {
                str = zExists ? "The discovered directory is no longer a valid script." : "The discovered script directory no longer exists.";
            }
            throw m5922h(z80Var, xj2Var, fj2Var, str, zf2Var != null ? zf2Var.f13879d : null);
        }
        th2 th2Var = z80Var2.f13783b;
        th2 th2Var2 = z80Var.f13783b;
        th2 th2Var3 = z80Var.f13783b;
        if (!t11.m5086l(th2Var, th2Var2)) {
            throw new ej2(th2Var3.f10774c, xj2Var, fj2Var, "The script manifest changed after it was discovered.", null);
        }
        String str2 = th2Var3.f10774c;
        str2.getClass();
        List list = xi2Var.f13046a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (t11.m5086l(((z80) obj).f13783b.f10774c, str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1) {
            return z80Var2;
        }
        throw new ej2(th2Var3.f10774c, xj2Var, fj2.f3019j, "Multiple script directories currently declare this id.", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r1.m2720d(r0) == r5) goto L25;
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5924a(u00 u00Var) {
        jj2 jj2Var;
        kl1 kl1Var;
        Iterator it;
        Collection collection;
        f52 f52Var;
        u22 u22Var;
        if (u00Var instanceof jj2) {
            jj2Var = (jj2) u00Var;
            int i = jj2Var.f5069r;
            if ((i & Integer.MIN_VALUE) != 0) {
                jj2Var.f5069r = i - Integer.MIN_VALUE;
            } else {
                jj2Var = new jj2(this, u00Var);
            }
        }
        Object obj = jj2Var.f5067p;
        int i2 = jj2Var.f5069r;
        k20 k20Var = k20.f5323h;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                kl1Var = this.f12546e;
                jj2Var.f5062k = kl1Var;
                jj2Var.f5069r = 1;
            } else if (i2 == 1) {
                kl1Var = jj2Var.f5062k;
                fg1.m1627T(obj);
            } else {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1 il1Var = jj2Var.f5066o;
                hj2 hj2Var = jj2Var.f5065n;
                it = jj2Var.f5064m;
                collection = jj2Var.f5063l;
                fg1.m1627T(obj);
                il1 il1Var2 = il1Var;
                try {
                    gj2 gj2VarM2201a = hj2Var.m2201a();
                    String str = (gj2VarM2201a == null || (f52Var = gj2VarM2201a.f3544b) == null || (u22Var = f52Var.f2798h) == null) ? null : u22Var.f11075a.f10774c;
                    if (str != null) {
                        collection.add(str);
                    }
                    if (it.hasNext()) {
                        return AbstractC0142du.m1170z0(AbstractC0142du.m1158n0((List) collection));
                    }
                    hj2Var = (hj2) it.next();
                    il1 il1Var3 = hj2Var.f4038a;
                    jj2Var.f5062k = null;
                    jj2Var.f5063l = collection;
                    jj2Var.f5064m = it;
                    jj2Var.f5065n = hj2Var;
                    jj2Var.f5066o = il1Var3;
                    jj2Var.f5069r = 2;
                    kl1 kl1Var2 = (kl1) il1Var3;
                    Object objM2720d = kl1Var2.m2720d(jj2Var);
                    il1Var2 = kl1Var2;
                } finally {
                    ((kl1) il1Var2).m2722f(null);
                }
            }
            Collection collectionValues = this.f12547f.values();
            collectionValues.getClass();
            List listM1148F0 = AbstractC0142du.m1148F0(collectionValues);
            kl1Var.m2722f(null);
            ArrayList arrayList = new ArrayList();
            it = listM1148F0.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } catch (Throwable th) {
            kl1Var.m2722f(null);
            throw th;
        }
    }

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
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5925b(String str, ci2 ci2Var, u00 u00Var) {
        kj2 kj2Var;
        hj2 hj2Var;
        il1 il1Var;
        gj2 gj2VarM2201a;
        bi2 bi2Var;
        f52 f52Var;
        ?? r7;
        if (u00Var instanceof kj2) {
            kj2Var = (kj2) u00Var;
            int i = kj2Var.f5603p;
            if ((i & Integer.MIN_VALUE) != 0) {
                kj2Var.f5603p = i - Integer.MIN_VALUE;
            } else {
                kj2Var = new kj2(this, u00Var);
            }
        }
        Object objM5926c = kj2Var.f5601n;
        int i2 = kj2Var.f5603p;
        k20 k20Var = k20.f5323h;
        try {
            if (i2 == 0) {
                fg1.m1627T(objM5926c);
                kj2Var.f5598k = ci2Var;
                kj2Var.f5603p = 1;
                objM5926c = m5926c(str, kj2Var);
                if (objM5926c != k20Var) {
                }
                return k20Var;
            }
            if (i2 == 1) {
                ci2Var = kj2Var.f5598k;
                fg1.m1627T(objM5926c);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    il1 il1Var2 = kj2Var.f5600m;
                    fg1.m1627T(objM5926c);
                    this = il1Var2;
                    bi2Var = (bi2) objM5926c;
                    r7 = this;
                    return bi2Var;
                }
                il1 il1Var3 = kj2Var.f5600m;
                hj2Var = kj2Var.f5599l;
                ci2Var = kj2Var.f5598k;
                fg1.m1627T(objM5926c);
                il1Var = il1Var3;
                gj2VarM2201a = hj2Var.m2201a();
                if (gj2VarM2201a != null || (f52Var = gj2VarM2201a.f3544b) == null) {
                    bi2Var = null;
                    r7 = il1Var;
                    return bi2Var;
                }
                kj2Var.f5598k = null;
                kj2Var.f5599l = null;
                kj2Var.f5600m = il1Var;
                kj2Var.f5603p = 3;
                objM5926c = f52Var.m1507e(ci2Var, kj2Var);
                this = il1Var;
            }
            hj2Var = (hj2) objM5926c;
            if (hj2Var == null) {
                return null;
            }
            il1 il1Var4 = hj2Var.f4038a;
            kj2Var.f5598k = ci2Var;
            kj2Var.f5599l = hj2Var;
            kj2Var.f5600m = il1Var4;
            kj2Var.f5603p = 2;
            kl1 kl1Var = (kl1) il1Var4;
            Object objM2720d = kl1Var.m2720d(kj2Var);
            il1Var = kl1Var;
            if (objM2720d != k20Var) {
                gj2VarM2201a = hj2Var.m2201a();
                if (gj2VarM2201a != null) {
                }
                bi2Var = null;
                r7 = il1Var;
                return bi2Var;
            }
            return k20Var;
        } finally {
            ((kl1) this).m2722f(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5926c(String str, u00 u00Var) {
        lj2 lj2Var;
        kl1 kl1Var;
        if (u00Var instanceof lj2) {
            lj2Var = (lj2) u00Var;
            int i = lj2Var.f6158o;
            if ((i & Integer.MIN_VALUE) != 0) {
                lj2Var.f6158o = i - Integer.MIN_VALUE;
            } else {
                lj2Var = new lj2(this, u00Var);
            }
        }
        Object obj = lj2Var.f6156m;
        int i2 = lj2Var.f6158o;
        if (i2 == 0) {
            fg1.m1627T(obj);
            lj2Var.f6154k = str;
            kl1Var = this.f12546e;
            lj2Var.f6155l = kl1Var;
            lj2Var.f6158o = 1;
            Object objM2720d = kl1Var.m2720d(lj2Var);
            k20 k20Var = k20.f5323h;
            if (objM2720d == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kl1 kl1Var2 = lj2Var.f6155l;
            String str2 = lj2Var.f6154k;
            fg1.m1627T(obj);
            kl1Var = kl1Var2;
            str = str2;
        }
        try {
            return (hj2) this.f12547f.get(str);
        } finally {
            kl1Var.m2722f(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5927d(z80 z80Var, xj2 xj2Var, u00 u00Var) throws bh2, dg2 {
        mj2 mj2Var;
        File absoluteFile;
        Object objM5931i;
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
            int i = mj2Var.f6699v;
            if ((i & Integer.MIN_VALUE) != 0) {
                mj2Var.f6699v = i - Integer.MIN_VALUE;
            } else {
                mj2Var = new mj2(wj2Var2, u00Var);
            }
        }
        Object objM1089M = mj2Var.f6697t;
        int i2 = mj2Var.f6699v;
        c20 c20Var = wj2Var2.f12543b;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM1089M);
            absoluteFile = z80Var5.f13782a.getAbsoluteFile();
            File parentFile = absoluteFile.getParentFile();
            if (parentFile == null) {
                throw new ej2(z80Var5.f13783b.f10774c, xj2Var, fj2.f3018i, "The discovered script directory has no parent repository.", null);
            }
            wi2 wi2Var2 = new wi2(parentFile, c20Var, 2);
            mj2Var.f6688k = z80Var5;
            mj2Var.f6689l = xj2Var;
            mj2Var.f6690m = absoluteFile;
            mj2Var.f6691n = wi2Var2;
            mj2Var.f6692o = wj2Var2;
            mj2Var.f6693p = z80Var5;
            mj2Var.f6694q = absoluteFile;
            mj2Var.f6699v = 1;
            objM5931i = wj2Var2.m5931i(wi2Var2, z80Var5, xj2Var, mj2Var);
            if (objM5931i != k20Var) {
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
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                File file2 = mj2Var.f6696s;
                z80Var4 = mj2Var.f6695r;
                wj2 wj2Var3 = (wj2) mj2Var.f6694q;
                u22Var = (u22) mj2Var.f6693p;
                z80Var3 = (z80) mj2Var.f6692o;
                xj2Var4 = mj2Var.f6689l;
                fg1.m1627T(objM1089M);
                file = file2;
                wj2Var2 = wj2Var3;
                wj2Var2.getClass();
                m5923q(z80Var4, file, (xi2) objM1089M, xj2Var4);
                return new ij2(z80Var3.f13782a, u22Var);
            }
            z80 z80Var6 = (z80) mj2Var.f6692o;
            wi2Var = mj2Var.f6691n;
            File file3 = mj2Var.f6690m;
            xj2 xj2Var5 = mj2Var.f6689l;
            z80 z80Var7 = mj2Var.f6688k;
            fg1.m1627T(objM1089M);
            file = file3;
            xj2Var3 = xj2Var5;
            z80Var3 = z80Var6;
            z80Var4 = z80Var7;
            u22Var = (u22) objM1089M;
            if (u22Var.f11075a.equals(z80Var4.f13783b)) {
                throw new ej2(z80Var4.f13783b.f10774c, xj2Var3, fj2.f3020k, "The script manifest changed after it was discovered.", null);
            }
            file.getClass();
            mj2Var.f6688k = null;
            mj2Var.f6689l = xj2Var3;
            mj2Var.f6690m = null;
            mj2Var.f6691n = null;
            mj2Var.f6692o = z80Var3;
            mj2Var.f6693p = u22Var;
            mj2Var.f6694q = wj2Var2;
            mj2Var.f6695r = z80Var4;
            mj2Var.f6696s = file;
            mj2Var.f6699v = 3;
            objM1089M = wj2Var2.m5931i(wi2Var, z80Var4, xj2Var3, mj2Var);
            if (objM1089M != k20Var) {
                xj2Var4 = xj2Var3;
                wj2Var2.getClass();
                m5923q(z80Var4, file, (xi2) objM1089M, xj2Var4);
                return new ij2(z80Var3.f13782a, u22Var);
            }
            return k20Var;
        }
        File file4 = (File) mj2Var.f6694q;
        z80 z80Var8 = (z80) mj2Var.f6693p;
        wj2 wj2Var4 = (wj2) mj2Var.f6692o;
        wi2 wi2Var3 = mj2Var.f6691n;
        file = mj2Var.f6690m;
        xj2Var2 = mj2Var.f6689l;
        z80Var2 = mj2Var.f6688k;
        fg1.m1627T(objM1089M);
        absoluteFile = file4;
        z80Var5 = z80Var8;
        wi2Var = wi2Var3;
        wj2Var = wj2Var4;
        objM5931i = objM1089M;
        wj2Var.getClass();
        z80 z80VarM5923q = m5923q(z80Var5, absoluteFile, (xi2) objM5931i, xj2Var2);
        oh2 oh2Var = new oh2(new sz0(z80VarM5923q.f13782a, c20Var));
        mj2Var.f6688k = z80Var2;
        mj2Var.f6689l = xj2Var2;
        mj2Var.f6690m = file;
        mj2Var.f6691n = wi2Var;
        mj2Var.f6692o = z80VarM5923q;
        mj2Var.f6693p = null;
        mj2Var.f6694q = null;
        mj2Var.f6699v = 2;
        objM1089M = ((dq1) ((kj1) wj2Var2.f12542a.f4019i).f5597l).m1089M(oh2Var, mj2Var);
        if (objM1089M != k20Var) {
            z80Var3 = z80VarM5923q;
            xj2Var3 = xj2Var2;
            z80Var4 = z80Var2;
            u22Var = (u22) objM1089M;
            if (u22Var.f11075a.equals(z80Var4.f13783b)) {
            }
        }
        return k20Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m5928e(dj2 dj2Var) {
        qh2 qh2Var;
        this.f12548g.m2963p(dj2Var);
        boolean z = dj2Var instanceof aj2;
        ph2 ph2Var = ph2.f8352i;
        sh2 sh2Var = sh2.f10146i;
        if (z) {
            aj2 aj2Var = (aj2) dj2Var;
            Instant instant = aj2Var.f228a;
            String lowerCase = aj2Var.f229b.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            qh2Var = new qh2(instant, ph2Var, sh2Var, "Starting script for " + lowerCase + ".", aj2Var.f231d.f10774c, null, null);
        } else if (dj2Var instanceof zi2) {
            zi2 zi2Var = (zi2) dj2Var;
            qh2Var = new qh2(zi2Var.f13920a, ph2Var, sh2Var, vi0.m5691j("Script is running on QuickJS ", zi2Var.f13924e, "."), zi2Var.f13923d.f10774c, null, null);
        } else if (dj2Var instanceof cj2) {
            cj2 cj2Var = (cj2) dj2Var;
            Instant instant2 = cj2Var.f1587a;
            String lowerCase2 = cj2Var.f1588b.name().toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            qh2Var = new qh2(instant2, ph2Var, sh2Var, "Stopping script for " + lowerCase2 + ".", cj2Var.f1590d.f10774c, null, null);
        } else if (dj2Var instanceof bj2) {
            bj2 bj2Var = (bj2) dj2Var;
            qh2Var = new qh2(bj2Var.f899a, ph2Var, sh2Var, "Script stopped.", bj2Var.f902d.f10774c, null, null);
        } else {
            if (!(dj2Var instanceof yi2)) {
                c80.m675s();
                return;
            }
            yi2 yi2Var = (yi2) dj2Var;
            Throwable th = yi2Var.f13486g;
            Instant instant3 = yi2Var.f13480a;
            ph2 ph2Var2 = th instanceof CancellationException ? ph2.f8353j : ph2.f8354k;
            if (yi2Var.f13484e != null) {
                sh2Var = sh2.f10145h;
            }
            sh2 sh2Var2 = sh2Var;
            String message = th.getMessage();
            if (message == null) {
                message = "Script operation failed.";
            }
            qh2Var = new qh2(instant3, ph2Var2, sh2Var2, message, yi2Var.f13483d.f10774c, yi2Var.f13484e, th);
        }
        this.f12545d.mo419f(qh2Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m5929f(xj2 xj2Var, File file, th2 th2Var, Throwable th) {
        Instant instant = this.f12544c.instant();
        instant.getClass();
        dg2 dg2Var = th instanceof dg2 ? (dg2) th : null;
        si2 si2Var = dg2Var != null ? dg2Var.f2049h : null;
        ej2 ej2Var = th instanceof ej2 ? (ej2) th : null;
        m5928e(new yi2(instant, xj2Var, file, th2Var, si2Var, ej2Var != null ? ej2Var.f2460h : null, th));
    }

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
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5930g(z80 z80Var, u00 u00Var) throws Throwable {
        nj2 nj2Var;
        Throwable th;
        ?? r9;
        xj2 xj2Var;
        ?? r10;
        ?? r5;
        il1 il1Var;
        xj2 xj2Var2;
        hj2 hj2Var;
        gj2 gj2VarM2201a;
        xj2 xj2Var3;
        ?? r4;
        ?? r52;
        il1 il1Var2;
        if (u00Var instanceof nj2) {
            nj2Var = (nj2) u00Var;
            int i = nj2Var.f7190q;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj2Var.f7190q = i - Integer.MIN_VALUE;
            } else {
                nj2Var = new nj2(this, u00Var);
            }
        }
        Object objM5932j = nj2Var.f7188o;
        int i2 = nj2Var.f7190q;
        k20 k20Var = k20.f5323h;
        try {
            if (i2 == 0) {
                fg1.m1627T(objM5932j);
                String str = z80Var.f13783b.f10774c;
                nj2Var.f7184k = z80Var;
                xj2Var = xj2.f13061j;
                nj2Var.f7185l = xj2Var;
                nj2Var.f7190q = 1;
                objM5932j = m5932j(str, nj2Var);
                r10 = z80Var;
                if (objM5932j != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r9 = nj2Var.f7187n;
                        try {
                            fg1.m1627T(objM5932j);
                            r9 = r9;
                            f52 f52Var = (f52) objM5932j;
                            ((kl1) r9).m2722f(null);
                            return f52Var;
                        } catch (Throwable th2) {
                            th = th2;
                            ((kl1) r9).m2722f(null);
                            throw th;
                        }
                    }
                    il1 il1Var3 = nj2Var.f7187n;
                    hj2Var = nj2Var.f7186m;
                    xj2Var3 = nj2Var.f7185l;
                    z80 z80Var2 = nj2Var.f7184k;
                    fg1.m1627T(objM5932j);
                    r4 = z80Var2;
                    il1Var2 = il1Var3;
                    r52 = r4;
                    xj2Var2 = xj2Var3;
                    z80Var = il1Var2;
                    nj2Var.f7184k = null;
                    nj2Var.f7185l = null;
                    nj2Var.f7186m = null;
                    nj2Var.f7187n = z80Var;
                    nj2Var.f7190q = 4;
                    objM5932j = m5935m(r52, hj2Var, xj2Var2, nj2Var);
                    if (objM5932j != k20Var) {
                        r9 = z80Var;
                        f52 f52Var2 = (f52) objM5932j;
                        ((kl1) r9).m2722f(null);
                        return f52Var2;
                    }
                    return k20Var;
                }
                il1 il1Var4 = nj2Var.f7187n;
                hj2Var = nj2Var.f7186m;
                xj2Var2 = nj2Var.f7185l;
                z80 z80Var3 = nj2Var.f7184k;
                fg1.m1627T(objM5932j);
                r5 = z80Var3;
                il1Var = il1Var4;
                gj2VarM2201a = hj2Var.m2201a();
                r52 = r5;
                z80Var = il1Var;
                if (gj2VarM2201a == null) {
                    nj2Var.f7184k = r5;
                    nj2Var.f7185l = xj2Var2;
                    nj2Var.f7186m = hj2Var;
                    nj2Var.f7187n = il1Var;
                    nj2Var.f7190q = 3;
                    if (m5938p(hj2Var, gj2VarM2201a, xj2Var2, nj2Var) != k20Var) {
                        xj2Var3 = xj2Var2;
                        r4 = r5;
                        il1Var2 = il1Var;
                        r52 = r4;
                        xj2Var2 = xj2Var3;
                        z80Var = il1Var2;
                        nj2Var.f7184k = null;
                        nj2Var.f7185l = null;
                        nj2Var.f7186m = null;
                        nj2Var.f7187n = z80Var;
                        nj2Var.f7190q = 4;
                        objM5932j = m5935m(r52, hj2Var, xj2Var2, nj2Var);
                        if (objM5932j != k20Var) {
                        }
                    }
                } else {
                    nj2Var.f7184k = null;
                    nj2Var.f7185l = null;
                    nj2Var.f7186m = null;
                    nj2Var.f7187n = z80Var;
                    nj2Var.f7190q = 4;
                    objM5932j = m5935m(r52, hj2Var, xj2Var2, nj2Var);
                    if (objM5932j != k20Var) {
                    }
                }
                return k20Var;
            }
            xj2 xj2Var4 = nj2Var.f7185l;
            z80 z80Var4 = nj2Var.f7184k;
            fg1.m1627T(objM5932j);
            xj2Var = xj2Var4;
            r10 = z80Var4;
            hj2 hj2Var2 = (hj2) objM5932j;
            il1 il1Var5 = hj2Var2.f4038a;
            nj2Var.f7184k = r10;
            nj2Var.f7185l = xj2Var;
            nj2Var.f7186m = hj2Var2;
            nj2Var.f7187n = il1Var5;
            nj2Var.f7190q = 2;
            kl1 kl1Var = (kl1) il1Var5;
            if (kl1Var.m2720d(nj2Var) != k20Var) {
                r5 = r10;
                il1Var = kl1Var;
                xj2Var2 = xj2Var;
                hj2Var = hj2Var2;
                gj2VarM2201a = hj2Var.m2201a();
                r52 = r5;
                z80Var = il1Var;
                if (gj2VarM2201a == null) {
                }
            }
            return k20Var;
        } catch (Throwable th3) {
            ?? r8 = z80Var;
            th = th3;
            r9 = r8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5931i(wi2 wi2Var, z80 z80Var, xj2 xj2Var, u00 u00Var) {
        oj2 oj2Var;
        if (u00Var instanceof oj2) {
            oj2Var = (oj2) u00Var;
            int i = oj2Var.f7699o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oj2Var.f7699o = i - Integer.MIN_VALUE;
            } else {
                oj2Var = new oj2(this, u00Var);
            }
        }
        Object objM3762R = oj2Var.f7697m;
        int i2 = oj2Var.f7699o;
        try {
            if (i2 == 0) {
                fg1.m1627T(objM3762R);
                oj2Var.f7695k = z80Var;
                oj2Var.f7696l = xj2Var;
                oj2Var.f7699o = 1;
                objM3762R = AbstractC0570p7.m3762R(wi2Var.f12520b, new vi2(wi2Var, null), oj2Var);
                k20 k20Var = k20.f5323h;
                if (objM3762R == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xj2Var = oj2Var.f7696l;
                z80Var = oj2Var.f7695k;
                fg1.m1627T(objM3762R);
            }
            return (xi2) objM3762R;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            throw m5922h(z80Var, xj2Var, fj2.f3018i, "Unable to rescan the script repository before starting.", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5932j(String str, u00 u00Var) {
        pj2 pj2Var;
        kl1 kl1Var;
        if (u00Var instanceof pj2) {
            pj2Var = (pj2) u00Var;
            int i = pj2Var.f8377o;
            if ((i & Integer.MIN_VALUE) != 0) {
                pj2Var.f8377o = i - Integer.MIN_VALUE;
            } else {
                pj2Var = new pj2(this, u00Var);
            }
        }
        Object obj = pj2Var.f8375m;
        int i2 = pj2Var.f8377o;
        if (i2 == 0) {
            fg1.m1627T(obj);
            pj2Var.f8373k = str;
            kl1Var = this.f12546e;
            pj2Var.f8374l = kl1Var;
            pj2Var.f8377o = 1;
            Object objM2720d = kl1Var.m2720d(pj2Var);
            k20 k20Var = k20.f5323h;
            if (objM2720d == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kl1 kl1Var2 = pj2Var.f8374l;
            String str2 = pj2Var.f8373k;
            fg1.m1627T(obj);
            kl1Var = kl1Var2;
            str = str2;
        }
        try {
            LinkedHashMap linkedHashMap = this.f12547f;
            Object hj2Var = linkedHashMap.get(str);
            if (hj2Var == null) {
                hj2Var = new hj2();
                linkedHashMap.put(str, hj2Var);
            }
            hj2 hj2Var2 = (hj2) hj2Var;
            kl1Var.m2722f(null);
            return hj2Var2;
        } catch (Throwable th) {
            kl1Var.m2722f(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2.m2720d(r0) == r1) goto L25;
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
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5933k(u00 u00Var) {
        qj2 qj2Var;
        kl1 kl1Var;
        Iterator it;
        Collection collection;
        me1 me1Var;
        if (u00Var instanceof qj2) {
            qj2Var = (qj2) u00Var;
            int i = qj2Var.f9010r;
            if ((i & Integer.MIN_VALUE) != 0) {
                qj2Var.f9010r = i - Integer.MIN_VALUE;
            } else {
                qj2Var = new qj2(this, u00Var);
            }
        }
        Object obj = qj2Var.f9008p;
        k20 k20Var = k20.f5323h;
        int i2 = qj2Var.f9010r;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                kl1Var = this.f12546e;
                qj2Var.f9003k = kl1Var;
                qj2Var.f9010r = 1;
            } else if (i2 == 1) {
                kl1Var = qj2Var.f9003k;
                fg1.m1627T(obj);
            } else {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1 il1Var = qj2Var.f9007o;
                hj2 hj2Var = qj2Var.f9006n;
                it = qj2Var.f9005m;
                collection = qj2Var.f9004l;
                fg1.m1627T(obj);
                il1 il1Var2 = il1Var;
                try {
                    gj2 gj2VarM2201a = hj2Var.m2201a();
                    if (gj2VarM2201a == null) {
                        me1Var = null;
                    } else {
                        f52 f52Var = gj2VarM2201a.f3544b;
                        th2 th2Var = f52Var.f2798h.f11075a;
                        me1Var = new me1(th2Var.f10774c, gj2VarM2201a.f3543a, th2Var, f52Var.f2805o, gj2VarM2201a.f3544b.f2806p);
                    }
                    if (me1Var != null) {
                        collection.add(me1Var);
                    }
                    if (it.hasNext()) {
                        return new yj2(AbstractC0142du.m1143A0((List) collection, new sl0(24)));
                    }
                    hj2Var = (hj2) it.next();
                    il1 il1Var3 = hj2Var.f4038a;
                    qj2Var.f9003k = null;
                    qj2Var.f9004l = collection;
                    qj2Var.f9005m = it;
                    qj2Var.f9006n = hj2Var;
                    qj2Var.f9007o = il1Var3;
                    qj2Var.f9010r = 2;
                    kl1 kl1Var2 = (kl1) il1Var3;
                    Object objM2720d = kl1Var2.m2720d(qj2Var);
                    il1Var2 = kl1Var2;
                } finally {
                    ((kl1) il1Var2).m2722f(null);
                }
            }
            Collection collectionValues = this.f12547f.values();
            collectionValues.getClass();
            List listM1148F0 = AbstractC0142du.m1148F0(collectionValues);
            kl1Var.m2722f(null);
            ArrayList arrayList = new ArrayList();
            it = listM1148F0.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } catch (Throwable th) {
            kl1Var.m2722f(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #1 {all -> 0x00a8, blocks: (B:30:0x0088, B:32:0x008e, B:41:0x00ad, B:42:0x00d6), top: B:47:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad A[Catch: all -> 0x00a8, TRY_ENTER, TryCatch #1 {all -> 0x00a8, blocks: (B:30:0x0088, B:32:0x008e, B:41:0x00ad, B:42:0x00d6), top: B:47:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5934l(z80 z80Var, u00 u00Var) throws Throwable {
        rj2 rj2Var;
        xj2 xj2Var;
        z80 z80Var2;
        il1 il1Var;
        xj2 xj2Var2;
        hj2 hj2Var;
        Throwable th;
        il1 il1Var2;
        gj2 gj2VarM2201a;
        if (u00Var instanceof rj2) {
            rj2Var = (rj2) u00Var;
            int i = rj2Var.f9613q;
            if ((i & Integer.MIN_VALUE) != 0) {
                rj2Var.f9613q = i - Integer.MIN_VALUE;
            } else {
                rj2Var = new rj2(this, u00Var);
            }
        }
        Object objM5935m = rj2Var.f9611o;
        Object obj = k20.f5323h;
        int i2 = rj2Var.f9613q;
        if (i2 == 0) {
            fg1.m1627T(objM5935m);
            xj2 xj2Var3 = xj2.f13059h;
            String str = z80Var.f13783b.f10774c;
            rj2Var.f9607k = z80Var;
            rj2Var.f9608l = xj2Var3;
            rj2Var.f9613q = 1;
            Object objM5932j = m5932j(str, rj2Var);
            if (objM5932j != obj) {
                xj2Var = xj2Var3;
                objM5935m = objM5932j;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = rj2Var.f9610n;
                try {
                    fg1.m1627T(objM5935m);
                    f52 f52Var = (f52) objM5935m;
                    ((kl1) il1Var2).m2722f(null);
                    return f52Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).m2722f(null);
                    throw th;
                }
            }
            il1Var = rj2Var.f9610n;
            hj2Var = rj2Var.f9609m;
            xj2Var2 = rj2Var.f9608l;
            z80Var2 = rj2Var.f9607k;
            fg1.m1627T(objM5935m);
            try {
                gj2VarM2201a = hj2Var.m2201a();
                if (gj2VarM2201a == null) {
                    Throwable thM5922h = m5922h(z80Var2, xj2Var2, fj2.f3017h, "A script session is already active with state " + gj2VarM2201a.f3544b.f2805o + ".", null);
                    File absoluteFile = z80Var2.f13782a.getAbsoluteFile();
                    absoluteFile.getClass();
                    m5929f(xj2Var2, absoluteFile, z80Var2.f13783b, thM5922h);
                    throw thM5922h;
                }
                rj2Var.f9607k = null;
                rj2Var.f9608l = null;
                rj2Var.f9609m = null;
                rj2Var.f9610n = il1Var;
                rj2Var.f9613q = 3;
                objM5935m = m5935m(z80Var2, hj2Var, xj2Var2, rj2Var);
                if (objM5935m != obj) {
                    il1Var2 = il1Var;
                    f52 f52Var2 = (f52) objM5935m;
                    ((kl1) il1Var2).m2722f(null);
                    return f52Var2;
                }
                return obj;
            } catch (Throwable th3) {
                il1 il1Var3 = il1Var;
                th = th3;
                il1Var2 = il1Var3;
                ((kl1) il1Var2).m2722f(null);
                throw th;
            }
        }
        xj2 xj2Var4 = rj2Var.f9608l;
        z80 z80Var3 = rj2Var.f9607k;
        fg1.m1627T(objM5935m);
        xj2Var = xj2Var4;
        z80Var = z80Var3;
        hj2 hj2Var2 = (hj2) objM5935m;
        il1 il1Var4 = hj2Var2.f4038a;
        rj2Var.f9607k = z80Var;
        rj2Var.f9608l = xj2Var;
        rj2Var.f9609m = hj2Var2;
        rj2Var.f9610n = il1Var4;
        rj2Var.f9613q = 2;
        kl1 kl1Var = (kl1) il1Var4;
        if (kl1Var.m2720d(rj2Var) != obj) {
            z80Var2 = z80Var;
            il1Var = kl1Var;
            xj2Var2 = xj2Var;
            hj2Var = hj2Var2;
            gj2VarM2201a = hj2Var.m2201a();
            if (gj2VarM2201a == null) {
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5935m(z80 z80Var, hj2 hj2Var, xj2 xj2Var, u00 u00Var) throws Throwable {
        sj2 sj2Var;
        Throwable th;
        Throwable th2;
        hj2 hj2Var2;
        Object objM5927d;
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
            int i = sj2Var.f10169r;
            if ((i & Integer.MIN_VALUE) != 0) {
                sj2Var.f10169r = i - Integer.MIN_VALUE;
            } else {
                sj2Var = new sj2(this, u00Var);
            }
        }
        sj2 sj2Var2 = sj2Var;
        Object obj = sj2Var2.f10167p;
        Object obj2 = k20.f5323h;
        int i2 = sj2Var2.f10169r;
        if (i2 == 0) {
            fg1.m1627T(obj);
            absoluteFile = z80Var.f13782a.getAbsoluteFile();
            Instant instant = this.f12544c.instant();
            instant.getClass();
            absoluteFile.getClass();
            m5928e(new aj2(instant, xj2Var, absoluteFile, z80Var.f13783b));
            try {
                sj2Var2.f10162k = z80Var;
                sj2Var2.f10163l = hj2Var;
                sj2Var2.f10164m = xj2Var;
                sj2Var2.f10165n = absoluteFile;
                sj2Var2.f10169r = 1;
                objM5927d = m5927d(z80Var, xj2Var, sj2Var2);
                hj2Var2 = hj2Var;
                if (objM5927d == obj2) {
                }
                return obj2;
            } catch (CancellationException e) {
                z80Var3 = z80Var;
                th2 = e;
                file2 = absoluteFile;
                file2.getClass();
                m5929f(xj2Var, file2, z80Var3.f13783b, th2);
                throw th2;
            } catch (Throwable th3) {
                z80Var2 = z80Var;
                th = th3;
                file = absoluteFile;
                file.getClass();
                m5929f(xj2Var, file, z80Var2.f13783b, th);
                throw th;
            }
        }
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ij2Var = sj2Var2.f10166o;
                File file4 = sj2Var2.f10165n;
                xj2Var = sj2Var2.f10164m;
                hj2 hj2Var4 = sj2Var2.f10163l;
                z80 z80Var5 = sj2Var2.f10162k;
                fg1.m1627T(obj);
                hj2Var3 = hj2Var4;
                z80Var4 = z80Var5;
                file3 = file4;
                xj2Var2 = xj2Var;
                try {
                    f52 f52Var = (f52) obj;
                    hj2Var3.f4039b = new gj2(ij2Var.f4657a, f52Var);
                    Instant instant2 = this.f12544c.instant();
                    instant2.getClass();
                    m5928e(new zi2(instant2, xj2Var2, ij2Var.f4657a, f52Var.f2798h.f11075a, f52Var.f2806p));
                    return f52Var;
                } catch (CancellationException e2) {
                    th2 = e2;
                    xj2Var = xj2Var2;
                    z80Var3 = z80Var4;
                    file2 = file3;
                    file2.getClass();
                    m5929f(xj2Var, file2, z80Var3.f13783b, th2);
                    throw th2;
                } catch (Throwable th4) {
                    th = th4;
                    xj2Var = xj2Var2;
                    z80Var2 = z80Var4;
                    file = file3;
                    file.getClass();
                    m5929f(xj2Var, file, z80Var2.f13783b, th);
                    throw th;
                }
            }
            File file5 = sj2Var2.f10165n;
            xj2Var = sj2Var2.f10164m;
            hj2 hj2Var5 = sj2Var2.f10163l;
            z80 z80Var6 = sj2Var2.f10162k;
            fg1.m1627T(obj);
            hj2Var2 = hj2Var5;
            z80Var = z80Var6;
            objM5927d = obj;
            absoluteFile = file5;
        } catch (CancellationException e3) {
            th2 = e3;
            z80Var3 = i2;
            file2 = hj2Var;
            file2.getClass();
            m5929f(xj2Var, file2, z80Var3.f13783b, th2);
            throw th2;
        } catch (Throwable th5) {
            th = th5;
            z80Var2 = i2;
            file = hj2Var;
            file.getClass();
            m5929f(xj2Var, file, z80Var2.f13783b, th);
            throw th;
        }
        ij2 ij2Var2 = (ij2) objM5927d;
        hh1 hh1Var = this.f12542a;
        u22 u22Var = ij2Var2.f4658b;
        sj2Var2.f10162k = z80Var;
        sj2Var2.f10163l = hj2Var2;
        sj2Var2.f10164m = xj2Var;
        sj2Var2.f10165n = absoluteFile;
        sj2Var2.f10166o = ij2Var2;
        sj2Var2.f10169r = 2;
        kj1 kj1Var = (kj1) hh1Var.f4019i;
        Object objM2278z = f52.f2797q.m2278z(u22Var, (eg2) kj1Var.f5594i, (df2) kj1Var.f5595j, (c20) kj1Var.f5596k, sj2Var2);
        if (objM2278z != obj2) {
            hj2Var3 = hj2Var2;
            file3 = absoluteFile;
            obj = objM2278z;
            z80Var4 = z80Var;
            ij2Var = ij2Var2;
            xj2Var2 = xj2Var;
            f52 f52Var2 = (f52) obj;
            hj2Var3.f4039b = new gj2(ij2Var.f4657a, f52Var2);
            Instant instant22 = this.f12544c.instant();
            instant22.getClass();
            m5928e(new zi2(instant22, xj2Var2, ij2Var.f4657a, f52Var2.f2798h.f11075a, f52Var2.f2806p));
            return f52Var2;
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:42:0x0096, B:33:0x0075, B:36:0x007d), top: B:49:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5936n(String str, xj2 xj2Var, u00 u00Var) throws Throwable {
        tj2 tj2Var;
        xj2 xj2Var2;
        hj2 hj2Var;
        il1 il1Var;
        gj2 gj2VarM2201a;
        il1 il1Var2;
        boolean zBooleanValue;
        if (u00Var instanceof tj2) {
            tj2Var = (tj2) u00Var;
            int i = tj2Var.f10801p;
            if ((i & Integer.MIN_VALUE) != 0) {
                tj2Var.f10801p = i - Integer.MIN_VALUE;
            } else {
                tj2Var = new tj2(this, u00Var);
            }
        }
        Object objM5926c = tj2Var.f10799n;
        int i2 = tj2Var.f10801p;
        Object obj = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM5926c);
            tj2Var.f10796k = xj2Var;
            tj2Var.f10801p = 1;
            objM5926c = m5926c(str, tj2Var);
            if (objM5926c != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = tj2Var.f10798m;
                try {
                    fg1.m1627T(objM5926c);
                    il1Var = il1Var2;
                    zBooleanValue = ((Boolean) objM5926c).booleanValue();
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    ((kl1) il1Var).m2722f(null);
                    return boolValueOf;
                } catch (Throwable th) {
                    th = th;
                    ((kl1) il1Var2).m2722f(null);
                    throw th;
                }
            }
            il1Var = tj2Var.f10798m;
            hj2Var = tj2Var.f10797l;
            xj2Var2 = tj2Var.f10796k;
            fg1.m1627T(objM5926c);
            try {
                gj2VarM2201a = hj2Var.m2201a();
                if (gj2VarM2201a != null) {
                    zBooleanValue = false;
                    Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                    ((kl1) il1Var).m2722f(null);
                    return boolValueOf2;
                }
                tj2Var.f10796k = null;
                tj2Var.f10797l = null;
                tj2Var.f10798m = il1Var;
                tj2Var.f10801p = 3;
                objM5926c = m5938p(hj2Var, gj2VarM2201a, xj2Var2, tj2Var);
                if (objM5926c != obj) {
                    il1Var2 = il1Var;
                    il1Var = il1Var2;
                    zBooleanValue = ((Boolean) objM5926c).booleanValue();
                    Boolean boolValueOf22 = Boolean.valueOf(zBooleanValue);
                    ((kl1) il1Var).m2722f(null);
                    return boolValueOf22;
                }
                return obj;
            } catch (Throwable th2) {
                il1 il1Var3 = il1Var;
                th = th2;
                il1Var2 = il1Var3;
                ((kl1) il1Var2).m2722f(null);
                throw th;
            }
        }
        xj2Var = tj2Var.f10796k;
        fg1.m1627T(objM5926c);
        hj2 hj2Var2 = (hj2) objM5926c;
        if (hj2Var2 == null) {
            return Boolean.FALSE;
        }
        il1 il1Var4 = hj2Var2.f4038a;
        tj2Var.f10796k = xj2Var;
        tj2Var.f10797l = hj2Var2;
        tj2Var.f10798m = il1Var4;
        tj2Var.f10801p = 2;
        kl1 kl1Var = (kl1) il1Var4;
        if (kl1Var.m2720d(tj2Var) != obj) {
            xj2Var2 = xj2Var;
            hj2Var = hj2Var2;
            il1Var = kl1Var;
            gj2VarM2201a = hj2Var.m2201a();
            if (gj2VarM2201a != null) {
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5937o(u00 u00Var) throws Throwable {
        uj2 uj2Var;
        if (u00Var instanceof uj2) {
            uj2Var = (uj2) u00Var;
            int i = uj2Var.f11336m;
            if ((i & Integer.MIN_VALUE) != 0) {
                uj2Var.f11336m = i - Integer.MIN_VALUE;
            } else {
                uj2Var = new uj2(this, u00Var);
            }
        }
        Object objM5924a = uj2Var.f11334k;
        int i2 = uj2Var.f11336m;
        t00 t00Var = null;
        Object obj = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM5924a);
            uj2Var.f11336m = 1;
            objM5924a = m5924a(uj2Var);
            if (objM5924a != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(objM5924a);
                return new sk2(AbstractC0142du.m1143A0((List) objM5924a, new sl0(25)));
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.m1627T(objM5924a);
        C0040b2 c0040b2 = new C0040b2((List) objM5924a, this, t00Var, 16);
        uj2Var.f11336m = 2;
        lw2 lw2Var = new lw2(uj2Var, uj2Var.mo2508f());
        objM5924a = ze3.m6410b(lw2Var, true, lw2Var, c0040b2);
    }

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
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5938p(hj2 hj2Var, gj2 gj2Var, xj2 xj2Var, u00 u00Var) {
        ?? vj2Var;
        th2 th2Var;
        Throwable th;
        CancellationException e;
        hj2 hj2Var2;
        if (u00Var instanceof vj2) {
            vj2 vj2Var2 = (vj2) u00Var;
            int i = vj2Var2.f11997q;
            if ((i & Integer.MIN_VALUE) != 0) {
                vj2Var2.f11997q = i - Integer.MIN_VALUE;
                vj2Var = vj2Var2;
            } else {
                vj2Var = new vj2(this, u00Var);
            }
        }
        Object obj = vj2Var.f11995o;
        int i2 = vj2Var.f11997q;
        Clock clock = this.f12544c;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                th2 th2Var2 = gj2Var.f3544b.f2798h.f11075a;
                Instant instant = clock.instant();
                instant.getClass();
                m5928e(new cj2(instant, xj2Var, gj2Var.f3543a, th2Var2));
                try {
                    f52 f52Var = gj2Var.f3544b;
                    vj2Var.f11991k = hj2Var;
                    vj2Var.f11992l = gj2Var;
                    vj2Var.f11993m = xj2Var;
                    vj2Var.f11994n = th2Var2;
                    vj2Var.f11997q = 1;
                    Object objM1511k = f52Var.m1511k(vj2Var);
                    k20 k20Var = k20.f5323h;
                    if (objM1511k == k20Var) {
                        return k20Var;
                    }
                    hj2Var2 = hj2Var;
                    th2Var = th2Var2;
                } catch (CancellationException e2) {
                    th2Var = th2Var2;
                    e = e2;
                    this.m5929f(xj2Var, gj2Var.f3543a, th2Var, e);
                    throw e;
                } catch (Throwable th2) {
                    th2Var = th2Var2;
                    th = th2;
                    this.m5929f(xj2Var, gj2Var.f3543a, th2Var, th);
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th2Var = vj2Var.f11994n;
                xj2Var = vj2Var.f11993m;
                gj2Var = vj2Var.f11992l;
                hj2Var2 = vj2Var.f11991k;
                try {
                    fg1.m1627T(obj);
                } catch (CancellationException e3) {
                    e = e3;
                    this.m5929f(xj2Var, gj2Var.f3543a, th2Var, e);
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    this.m5929f(xj2Var, gj2Var.f3543a, th2Var, th);
                    throw th;
                }
            }
            Instant instant2 = clock.instant();
            instant2.getClass();
            m5928e(new bj2(instant2, xj2Var, gj2Var.f3543a, th2Var));
            Boolean bool = Boolean.TRUE;
            hj2Var2.f4039b = null;
            return bool;
        } catch (Throwable th4) {
            vj2Var.f4039b = null;
            throw th4;
        }
    }
}
