package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p22 implements i81 {

    /* JADX INFO: renamed from: h */
    public final int f7936h;

    /* JADX INFO: renamed from: i */
    public final C0043b5 f7937i;

    /* JADX INFO: renamed from: j */
    public final in0 f7938j;

    /* JADX INFO: renamed from: k */
    public C0221fz f7939k;

    /* JADX INFO: renamed from: l */
    public fw2 f7940l;

    /* JADX INFO: renamed from: m */
    public e71 f7941m;

    /* JADX INFO: renamed from: n */
    public boolean f7942n;

    /* JADX INFO: renamed from: o */
    public boolean f7943o;

    /* JADX INFO: renamed from: p */
    public boolean f7944p;

    /* JADX INFO: renamed from: q */
    public Object f7945q;

    /* JADX INFO: renamed from: r */
    public boolean f7946r;

    /* JADX INFO: renamed from: s */
    public o22 f7947s;

    /* JADX INFO: renamed from: t */
    public boolean f7948t;

    /* JADX INFO: renamed from: u */
    public long f7949u;

    /* JADX INFO: renamed from: v */
    public long f7950v;

    /* JADX INFO: renamed from: w */
    public long f7951w;

    /* JADX INFO: renamed from: x */
    public boolean f7952x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ f90 f7953y;

    public p22(f90 f90Var, int i, C0043b5 c0043b5, nx0 nx0Var) {
        this.f7953y = f90Var;
        this.f7936h = i;
        this.f7937i = c0043b5;
        this.f7938j = nx0Var;
        int i2 = ei1.f2456b;
        this.f7951w = System.nanoTime() - ei1.f2455a;
    }

    /* JADX INFO: renamed from: a */
    public final void m3681a() {
        e71 e71Var = this.f7941m;
        if (e71Var != null) {
            switch (e71Var.f2336a) {
                case 0:
                    break;
                default:
                    x61 x61VarM1286b = e71Var.m1286b();
                    if ((x61VarM1286b != null ? x61VarM1286b.f12847f : null) != null) {
                        f71.m1535b(e71Var.f2337b, e71Var.f2338c);
                    }
                    break;
            }
        }
        this.f7941m = null;
        fw2 fw2Var = this.f7940l;
        if (fw2Var != null) {
            fw2Var.mo658a();
        }
        this.f7940l = null;
        this.f7947s = null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3682b(C0649ra c0649ra) {
        boolean zM3683c;
        if (!this.f7953y.f2862a) {
            return false;
        }
        if (this.f7948t) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM3683c = m3683c(c0649ra);
            } finally {
                Trace.endSection();
            }
        } else {
            zM3683c = m3683c(c0649ra);
        }
        tp0.m5354R("compose:lazy:prefetch:execute:item", -1L);
        return zM3683c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0248  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3683c(C0649ra c0649ra) {
        long j;
        boolean z;
        in0 in0Var;
        ?? r9;
        int i;
        List list;
        int i2;
        int i3;
        boolean z2;
        fw2 fw2VarM1540f;
        int i4 = this.f7936h;
        long j2 = i4;
        tp0.m5354R("compose:lazy:prefetch:execute:item", j2);
        t81 t81Var = (t81) ((z71) this.f7953y.f2863b).f13766b.mo6a();
        if (!this.f7943o) {
            int iM5133c = t81Var.m5133c();
            if (i4 >= 0 && i4 < iM5133c) {
                Object objM5134d = t81Var.m5134d(i4);
                Object obj = this.f7945q;
                if (obj != null && !objM5134d.equals(obj)) {
                    m3681a();
                    return false;
                }
                Object objM5132b = t81Var.m5132b(i4);
                C0043b5 c0043b5 = this.f7937i;
                C0774ui c0774ui = (C0774ui) c0043b5.f564k;
                if (c0043b5.f563j != objM5132b || c0774ui == null) {
                    rk1 rk1Var = (rk1) c0043b5.f562i;
                    Object objM4505g = rk1Var.m4505g(objM5132b);
                    Object obj2 = objM4505g;
                    if (objM4505g == null) {
                        C0774ui c0774ui2 = new C0774ui();
                        c0774ui2.f11321e = -1;
                        rk1Var.m4511m(objM5132b, c0774ui2);
                        obj2 = c0774ui2;
                    }
                    c0774ui = (C0774ui) obj2;
                    c0043b5.f563j = objM5132b;
                    c0043b5.f564k = c0774ui;
                }
                m3684d();
                long jM4417a = c0649ra.m4417a();
                this.f7949u = jM4417a;
                int i5 = ei1.f2456b;
                this.f7951w = System.nanoTime() - ei1.f2455a;
                this.f7950v = 0L;
                tp0.m5354R("compose:lazy:prefetch:available_time_nanos", jM4417a);
                if (m3684d()) {
                    j = 0;
                } else {
                    j = 0;
                    if (m3686g(this.f7949u, c0774ui.f11317a + c0774ui.f11318b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            m3685f(objM5134d, objM5132b, c0774ui);
                        } finally {
                        }
                    }
                    if (!m3684d()) {
                        return true;
                    }
                }
                in0 in0VarMo77e = null;
                if (this.f7941m != null) {
                    if (!m3686g(this.f7949u, c0774ui.f11319c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        e71 e71Var = this.f7941m;
                        if (e71Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (e71Var.f2336a) {
                            case 0:
                                fw2VarM1540f = e71Var.f2337b.m1540f(e71Var.f2338c);
                                break;
                            default:
                                f71 f71Var = e71Var.f2337b;
                                x61 x61VarM1286b = e71Var.m1286b();
                                if (x61VarM1286b != null) {
                                    f71Var.m1539d(x61VarM1286b, false);
                                }
                                fw2VarM1540f = f71Var.m1540f(e71Var.f2338c);
                                break;
                        }
                        this.f7940l = fw2VarM1540f;
                        this.f7941m = null;
                        this.f7944p = true;
                        Trace.endSection();
                        m3687h();
                        c0774ui.f11319c = C0774ui.m5506a(this.f7950v, c0774ui.f11319c);
                    } finally {
                    }
                }
                if (!this.f7946r) {
                    if (this.f7949u <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        fw2 fw2Var = this.f7940l;
                        if (fw2Var != null) {
                            o72 o72Var = new o72();
                            fw2Var.mo966d(new C0792v(21, o72Var));
                            List list2 = (List) o72Var.f7574i;
                            o22 o22Var = list2 != null ? new o22(this, list2) : null;
                            this.f7947s = o22Var;
                            this.f7946r = true;
                        } else {
                            nz0.m3457b("Should precompose before resolving nested prefetch states");
                            C0676s.m4644b();
                        }
                        this.f7947s = o22Var;
                        this.f7946r = true;
                    } finally {
                    }
                }
                o22 o22Var2 = this.f7947s;
                if (o22Var2 != null) {
                    int i6 = c0774ui.f11321e;
                    boolean z3 = this.f7948t;
                    List[] listArr = o22Var2.f7450b;
                    int i7 = o22Var2.f7451c;
                    List list3 = o22Var2.f7449a;
                    if (i7 < list3.size()) {
                        if (o22Var2.f7454f.f7943o) {
                            nz0.m3458c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                ((j81) list3.get(i8)).f4916d = i6;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (o22Var2.f7451c < list3.size()) {
                                try {
                                    if (listArr[o22Var2.f7451c] != null) {
                                        z = z3;
                                        in0Var = in0VarMo77e;
                                    } else {
                                        if (c0649ra.m4417a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i9 = o22Var2.f7451c;
                                        j81 j81Var = (j81) list3.get(i9);
                                        a91 a91Var = j81Var.f4913a;
                                        if (a91Var == null) {
                                            list = be0.f819h;
                                            i = i9;
                                            z = z3;
                                            in0Var = in0VarMo77e;
                                        } else {
                                            int i10 = j81Var.f4916d;
                                            ArrayList arrayList = new ArrayList();
                                            int i11 = a91Var.f117h;
                                            vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
                                            if (vr2VarM5275B != null) {
                                                in0VarMo77e = vr2VarM5275B.mo77e();
                                            }
                                            AbstractC0738tl.m5292U(vr2VarM5275B, AbstractC0738tl.m5283K(vr2VarM5275B), in0VarMo77e);
                                            if (i10 == -1) {
                                                i10 = 2;
                                            }
                                            int i12 = 0;
                                            while (i12 < i10) {
                                                int i13 = i11 + i12;
                                                f90 f90Var = j81Var.f4915c;
                                                if (f90Var == null) {
                                                    i2 = i12;
                                                    i3 = i9;
                                                    z2 = z3;
                                                } else {
                                                    i2 = i12;
                                                    i3 = i9;
                                                    z2 = z3;
                                                    arrayList.add(new p22(f90Var, i13, j81Var.f4914b, null));
                                                }
                                                i12 = i2 + 1;
                                                i9 = i3;
                                                z3 = z2;
                                            }
                                            i = i9;
                                            z = z3;
                                            in0Var = null;
                                            j81Var.f4918f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i] = list;
                                    }
                                    List list4 = listArr[o22Var2.f7451c];
                                    list4.getClass();
                                    while (o22Var2.f7452d < list4.size()) {
                                        p22 p22Var = (p22) list4.get(o22Var2.f7452d);
                                        if (z) {
                                            p22 p22Var2 = p22Var != null ? p22Var : in0Var;
                                            if (p22Var2 != 0) {
                                                r9 = 1;
                                                p22Var2.f7948t = true;
                                            }
                                        } else {
                                            r9 = 1;
                                        }
                                        o22Var2.f7453e = r9;
                                        if (p22Var.m3682b(c0649ra)) {
                                            return r9;
                                        }
                                        o22Var2.f7452d += r9;
                                    }
                                    o22Var2.f7452d = 0;
                                    o22Var2.f7451c++;
                                    in0VarMo77e = in0Var;
                                    z3 = z;
                                    j = 0;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                o22 o22Var3 = this.f7947s;
                if (o22Var3 != null && o22Var3.f7453e) {
                    m3687h();
                    tp0.m5354R("compose:lazy:prefetch:execute:item", j2);
                    o22 o22Var4 = this.f7947s;
                    if (o22Var4 != null) {
                        o22Var4.f7453e = false;
                    }
                }
                C0221fz c0221fz = this.f7939k;
                if (!this.f7942n && c0221fz != null) {
                    if (!m3686g(this.f7949u, c0774ui.f11320d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = c0221fz.f3199a;
                        if (this.f7943o) {
                            nz0.m3456a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.f7942n) {
                            nz0.m3456a("Request was already measured!");
                        }
                        this.f7942n = true;
                        fw2 fw2Var2 = this.f7940l;
                        if (fw2Var2 != null) {
                            int iMo964b = fw2Var2.mo964b();
                            for (int i14 = 0; i14 < iMo964b; i14++) {
                                fw2Var2.mo965c(j3, i14);
                            }
                        } else {
                            nz0.m3457b("performComposition() must be called before performMeasure()");
                            C0676s.m4644b();
                        }
                        Trace.endSection();
                        m3687h();
                        c0774ui.f11320d = C0774ui.m5506a(this.f7950v, c0774ui.f11320d);
                        in0 in0Var2 = this.f7938j;
                        if (in0Var2 != null) {
                            in0Var2.mo5j(this);
                        }
                    } finally {
                    }
                }
                o22 o22Var5 = this.f7947s;
                if (!this.f7942n || !this.f7946r || o22Var5 == null) {
                    return false;
                }
                List list5 = o22Var5.f7449a;
                int size2 = list5.size();
                int iMin = Integer.MAX_VALUE;
                for (int i15 = 0; i15 < size2; i15++) {
                    iMin = Math.min(iMin, ((j81) list5.get(i15)).f4917e);
                }
                int i16 = iMin == Integer.MAX_VALUE ? 0 : iMin;
                int i17 = c0774ui.f11321e;
                c0774ui.f11321e = i17 == -1 ? i16 : ((i17 * 3) + i16) / 4;
                int size3 = list5.size();
                int iMin2 = Integer.MAX_VALUE;
                for (int i18 = 0; i18 < size3; i18++) {
                    iMin2 = Math.min(iMin2, ((j81) list5.get(i18)).f4918f);
                }
                if (iMin2 == Integer.MAX_VALUE) {
                    iMin2 = 0;
                }
                if (iMin2 >= i16) {
                    return false;
                }
                c0774ui.f11320d = 0L;
                return false;
            }
        }
        m3681a();
        return false;
    }

    @Override // p000.i81
    public final void cancel() {
        if (this.f7943o) {
            return;
        }
        this.f7943o = true;
        m3681a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3684d() {
        e71 e71Var;
        return this.f7944p || ((e71Var = this.f7941m) != null && e71Var.m1287c());
    }

    @Override // p000.i81
    /* JADX INFO: renamed from: e */
    public final void mo2303e() {
        this.f7948t = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m3685f(Object obj, Object obj2, C0774ui c0774ui) {
        e71 e71Var;
        e71 e71Var2 = this.f7941m;
        int i = 0;
        if (e71Var2 == null) {
            f90 f90Var = this.f7953y;
            mn0 mn0VarM6387a = ((z71) f90Var.f2863b).m6387a(this.f7936h, obj, obj2);
            f71 f71VarM2233a = ((hw2) f90Var.f2864c).m2233a();
            if (f71VarM2233a.f2826h.m4350H()) {
                f71VarM2233a.m1545k(obj, mn0VarM6387a, true);
                e71Var = new e71(f71VarM2233a, obj, 1);
            } else {
                e71Var = new e71(f71VarM2233a, obj, i);
            }
            e71Var2 = e71Var;
            this.f7941m = e71Var2;
            this.f7945q = obj;
        }
        this.f7952x = false;
        while (!e71Var2.m1287c() && !this.f7952x) {
            hq1 hq1Var = new hq1(this, c0774ui);
            switch (e71Var2.f2336a) {
                case 0:
                    break;
                default:
                    x61 x61VarM1286b = e71Var2.m1286b();
                    sy1 sy1Var = x61VarM1286b != null ? x61VarM1286b.f12847f : null;
                    if (sy1Var != null && !sy1Var.m5021c()) {
                        vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
                        in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
                        vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
                        try {
                            sy1Var.m5023e(hq1Var);
                        } finally {
                        }
                    }
                    break;
            }
        }
        m3687h();
        boolean z = this.f7952x;
        long j = this.f7950v;
        if (z) {
            c0774ui.f11318b = C0774ui.m5506a(j, c0774ui.f11318b);
        } else {
            c0774ui.f11317a = C0774ui.m5506a(j, c0774ui.f11317a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3686g(long j, long j2) {
        if (this.f7948t) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX INFO: renamed from: h */
    public final void m3687h() {
        int i = ei1.f2456b;
        long jNanoTime = System.nanoTime() - ei1.f2455a;
        long j = this.f7951w;
        long jM3895G = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j) {
                C0953z8 c0953z8 = ad0.f155i;
            } else {
                jM3895G = ad0.m136g(j < 0 ? ad0.f157k : ad0.f156j);
            }
        } else if ((1 | (jNanoTime - 1)) == Long.MAX_VALUE) {
            jM3895G = jNanoTime < 0 ? ad0.f157k : ad0.f156j;
        } else {
            long j2 = jNanoTime - j;
            long j3 = (j2 ^ jNanoTime) & (~(j2 ^ j));
            ed0 ed0Var = ed0.NANOSECONDS;
            if (j3 < 0) {
                ed0 ed0Var2 = ed0.MILLISECONDS;
                if (ed0Var.compareTo(ed0Var2) < 0) {
                    long j4 = (jNanoTime / 1000000) - (j / 1000000);
                    long j5 = (jNanoTime % 1000000) - (j % 1000000);
                    C0953z8 c0953z82 = ad0.f155i;
                    jM3895G = ad0.m134e(pp0.m3895G(j4, ed0Var2), pp0.m3895G(j5, ed0Var));
                } else {
                    jM3895G = ad0.m136g(j2 < 0 ? ad0.f157k : ad0.f156j);
                }
            } else {
                jM3895G = pp0.m3895G(j2, ed0Var);
            }
        }
        long j6 = jM3895G >> 1;
        C0953z8 c0953z83 = ad0.f155i;
        long j7 = (1 & ((int) jM3895G)) == 0 ? j6 : j6 > 9223372036854L ? Long.MAX_VALUE : j6 < -9223372036854L ? Long.MIN_VALUE : j6 * 1000000;
        this.f7950v = j7;
        long j8 = this.f7949u - j7;
        this.f7949u = j8;
        this.f7951w = jNanoTime;
        tp0.m5354R("compose:lazy:prefetch:available_time_nanos", j8);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f7936h + ", constraints = " + this.f7939k + ", isComposed = " + m3684d() + ", isMeasured = " + this.f7942n + ", isCanceled = " + this.f7943o + " }";
    }
}
