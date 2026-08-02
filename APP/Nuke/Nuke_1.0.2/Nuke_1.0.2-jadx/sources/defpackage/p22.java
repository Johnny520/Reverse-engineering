package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p22 implements i81 {
    public final int h;
    public final b5 i;
    public final in0 j;
    public fz k;
    public fw2 l;
    public e71 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Object q;
    public boolean r;
    public o22 s;
    public boolean t;
    public long u;
    public long v;
    public long w;
    public boolean x;
    public final /* synthetic */ f90 y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p22(f90 f90Var, int i, b5 b5Var, nx0 nx0Var) {
        this.y = f90Var;
        this.h = i;
        this.i = b5Var;
        this.j = nx0Var;
        int i2 = ei1.b;
        this.w = System.nanoTime() - ei1.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        e71 e71Var = this.m;
        if (e71Var != null) {
            switch (e71Var.a) {
                case 0:
                    break;
                default:
                    x61 x61VarB = e71Var.b();
                    if ((x61VarB != null ? x61VarB.f : null) != null) {
                        f71.b(e71Var.b, e71Var.c);
                    }
                    break;
            }
        }
        this.m = null;
        fw2 fw2Var = this.l;
        if (fw2Var != null) {
            fw2Var.a();
        }
        this.l = null;
        this.s = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(ra raVar) {
        boolean zC;
        if (!this.y.a) {
            return false;
        }
        if (this.t) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zC = c(raVar);
            } finally {
                Trace.endSection();
            }
        } else {
            zC = c(raVar);
        }
        tp0.R("compose:lazy:prefetch:execute:item", -1L);
        return zC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: p22 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: p22 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: p22 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0248  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(ra raVar) {
        long j;
        boolean z;
        in0 in0Var;
        ?? r9;
        int i;
        List list;
        int i2;
        int i3;
        boolean z2;
        fw2 fw2VarF;
        int i4 = this.h;
        long j2 = i4;
        tp0.R("compose:lazy:prefetch:execute:item", j2);
        t81 t81Var = (t81) ((z71) this.y.b).b.a();
        if (!this.o) {
            int iC = t81Var.c();
            if (i4 >= 0 && i4 < iC) {
                Object objD = t81Var.d(i4);
                Object obj = this.q;
                if (obj != null && !objD.equals(obj)) {
                    a();
                    return false;
                }
                Object objB = t81Var.b(i4);
                b5 b5Var = this.i;
                ui uiVar = (ui) b5Var.k;
                if (b5Var.j != objB || uiVar == null) {
                    rk1 rk1Var = (rk1) b5Var.i;
                    Object objG = rk1Var.g(objB);
                    Object obj2 = objG;
                    if (objG == null) {
                        ui uiVar2 = new ui();
                        uiVar2.e = -1;
                        rk1Var.m(objB, uiVar2);
                        obj2 = uiVar2;
                    }
                    uiVar = (ui) obj2;
                    b5Var.j = objB;
                    b5Var.k = uiVar;
                }
                d();
                long jA = raVar.a();
                this.u = jA;
                int i5 = ei1.b;
                this.w = System.nanoTime() - ei1.a;
                this.v = 0L;
                tp0.R("compose:lazy:prefetch:available_time_nanos", jA);
                if (d()) {
                    j = 0;
                } else {
                    j = 0;
                    if (g(this.u, uiVar.a + uiVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objD, objB, uiVar);
                        } finally {
                        }
                    }
                    if (!d()) {
                        return true;
                    }
                }
                in0 in0VarE = null;
                if (this.m != null) {
                    if (!g(this.u, uiVar.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        e71 e71Var = this.m;
                        if (e71Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (e71Var.a) {
                            case 0:
                                fw2VarF = e71Var.b.f(e71Var.c);
                                break;
                            default:
                                f71 f71Var = e71Var.b;
                                x61 x61VarB = e71Var.b();
                                if (x61VarB != null) {
                                    f71Var.d(x61VarB, false);
                                }
                                fw2VarF = f71Var.f(e71Var.c);
                                break;
                        }
                        this.l = fw2VarF;
                        this.m = null;
                        this.p = true;
                        Trace.endSection();
                        h();
                        uiVar.c = ui.a(this.v, uiVar.c);
                    } finally {
                    }
                }
                if (!this.r) {
                    if (this.u <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        fw2 fw2Var = this.l;
                        if (fw2Var != null) {
                            o72 o72Var = new o72();
                            fw2Var.d(new v(21, o72Var));
                            List list2 = (List) o72Var.i;
                            o22 o22Var = list2 != null ? new o22(this, list2) : null;
                            this.s = o22Var;
                            this.r = true;
                        } else {
                            nz0.b("Should precompose before resolving nested prefetch states");
                            s.b();
                        }
                        this.s = o22Var;
                        this.r = true;
                    } finally {
                    }
                }
                o22 o22Var2 = this.s;
                if (o22Var2 != null) {
                    int i6 = uiVar.e;
                    boolean z3 = this.t;
                    List[] listArr = o22Var2.b;
                    int i7 = o22Var2.c;
                    List list3 = o22Var2.a;
                    if (i7 < list3.size()) {
                        if (o22Var2.f.o) {
                            nz0.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                ((j81) list3.get(i8)).d = i6;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (o22Var2.c < list3.size()) {
                                try {
                                    if (listArr[o22Var2.c] != null) {
                                        z = z3;
                                        in0Var = in0VarE;
                                    } else {
                                        if (raVar.a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i9 = o22Var2.c;
                                        j81 j81Var = (j81) list3.get(i9);
                                        a91 a91Var = j81Var.a;
                                        if (a91Var == null) {
                                            list = be0.h;
                                            i = i9;
                                            z = z3;
                                            in0Var = in0VarE;
                                        } else {
                                            int i10 = j81Var.d;
                                            ArrayList arrayList = new ArrayList();
                                            int i11 = a91Var.h;
                                            vr2 vr2VarB = tl.B();
                                            if (vr2VarB != null) {
                                                in0VarE = vr2VarB.e();
                                            }
                                            tl.U(vr2VarB, tl.K(vr2VarB), in0VarE);
                                            if (i10 == -1) {
                                                i10 = 2;
                                            }
                                            int i12 = 0;
                                            while (i12 < i10) {
                                                int i13 = i11 + i12;
                                                f90 f90Var = j81Var.c;
                                                if (f90Var == null) {
                                                    i2 = i12;
                                                    i3 = i9;
                                                    z2 = z3;
                                                } else {
                                                    i2 = i12;
                                                    i3 = i9;
                                                    z2 = z3;
                                                    arrayList.add(new p22(f90Var, i13, j81Var.b, null));
                                                }
                                                i12 = i2 + 1;
                                                i9 = i3;
                                                z3 = z2;
                                            }
                                            i = i9;
                                            z = z3;
                                            in0Var = null;
                                            j81Var.f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i] = list;
                                    }
                                    List list4 = listArr[o22Var2.c];
                                    list4.getClass();
                                    while (o22Var2.d < list4.size()) {
                                        p22 p22Var = (p22) list4.get(o22Var2.d);
                                        if (z) {
                                            p22 p22Var2 = p22Var != null ? p22Var : in0Var;
                                            if (p22Var2 != 0) {
                                                r9 = 1;
                                                p22Var2.t = true;
                                            }
                                        } else {
                                            r9 = 1;
                                        }
                                        o22Var2.e = r9;
                                        if (p22Var.b(raVar)) {
                                            return r9;
                                        }
                                        o22Var2.d += r9;
                                    }
                                    o22Var2.d = 0;
                                    o22Var2.c++;
                                    in0VarE = in0Var;
                                    z3 = z;
                                    j = 0;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                o22 o22Var3 = this.s;
                if (o22Var3 != null && o22Var3.e) {
                    h();
                    tp0.R("compose:lazy:prefetch:execute:item", j2);
                    o22 o22Var4 = this.s;
                    if (o22Var4 != null) {
                        o22Var4.e = false;
                    }
                }
                fz fzVar = this.k;
                if (!this.n && fzVar != null) {
                    if (!g(this.u, uiVar.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = fzVar.a;
                        if (this.o) {
                            nz0.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.n) {
                            nz0.a("Request was already measured!");
                        }
                        this.n = true;
                        fw2 fw2Var2 = this.l;
                        if (fw2Var2 != null) {
                            int iB = fw2Var2.b();
                            for (int i14 = 0; i14 < iB; i14++) {
                                fw2Var2.c(j3, i14);
                            }
                        } else {
                            nz0.b("performComposition() must be called before performMeasure()");
                            s.b();
                        }
                        Trace.endSection();
                        h();
                        uiVar.d = ui.a(this.v, uiVar.d);
                        in0 in0Var2 = this.j;
                        if (in0Var2 != null) {
                            in0Var2.j(this);
                        }
                    } finally {
                    }
                }
                o22 o22Var5 = this.s;
                if (!this.n || !this.r || o22Var5 == null) {
                    return false;
                }
                List list5 = o22Var5.a;
                int size2 = list5.size();
                int iMin = Integer.MAX_VALUE;
                for (int i15 = 0; i15 < size2; i15++) {
                    iMin = Math.min(iMin, ((j81) list5.get(i15)).e);
                }
                int i16 = iMin == Integer.MAX_VALUE ? 0 : iMin;
                int i17 = uiVar.e;
                uiVar.e = i17 == -1 ? i16 : ((i17 * 3) + i16) / 4;
                int size3 = list5.size();
                int iMin2 = Integer.MAX_VALUE;
                for (int i18 = 0; i18 < size3; i18++) {
                    iMin2 = Math.min(iMin2, ((j81) list5.get(i18)).f);
                }
                if (iMin2 == Integer.MAX_VALUE) {
                    iMin2 = 0;
                }
                if (iMin2 >= i16) {
                    return false;
                }
                uiVar.d = 0L;
                return false;
            }
        }
        a();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i81
    public final void cancel() {
        if (this.o) {
            return;
        }
        this.o = true;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        e71 e71Var;
        return this.p || ((e71Var = this.m) != null && e71Var.c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i81
    public final void e() {
        this.t = true;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void f(Object obj, Object obj2, ui uiVar) {
        e71 e71Var;
        e71 e71Var2 = this.m;
        int i = 0;
        if (e71Var2 == null) {
            f90 f90Var = this.y;
            mn0 mn0VarA = ((z71) f90Var.b).a(this.h, obj, obj2);
            f71 f71VarA = ((hw2) f90Var.c).a();
            if (f71VarA.h.H()) {
                f71VarA.k(obj, mn0VarA, true);
                e71Var = new e71(f71VarA, obj, 1);
            } else {
                e71Var = new e71(f71VarA, obj, i);
            }
            e71Var2 = e71Var;
            this.m = e71Var2;
            this.q = obj;
        }
        this.x = false;
        while (!e71Var2.c() && !this.x) {
            hq1 hq1Var = new hq1(this, uiVar);
            switch (e71Var2.a) {
                case 0:
                    break;
                default:
                    x61 x61VarB = e71Var2.b();
                    sy1 sy1Var = x61VarB != null ? x61VarB.f : null;
                    if (sy1Var != null && !sy1Var.c()) {
                        vr2 vr2VarB = tl.B();
                        in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
                        vr2 vr2VarK = tl.K(vr2VarB);
                        try {
                            sy1Var.e(hq1Var);
                        } finally {
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.x;
        long j = this.v;
        if (z) {
            uiVar.b = ui.a(j, uiVar.b);
        } else {
            uiVar.a = ui.a(j, uiVar.a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(long j, long j2) {
        if (this.t) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        int i = ei1.b;
        long jNanoTime = System.nanoTime() - ei1.a;
        long j = this.w;
        long jG = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j) {
                z8 z8Var = ad0.i;
            } else {
                jG = ad0.g(j < 0 ? ad0.k : ad0.j);
            }
        } else if ((1 | (jNanoTime - 1)) == Long.MAX_VALUE) {
            jG = jNanoTime < 0 ? ad0.k : ad0.j;
        } else {
            long j2 = jNanoTime - j;
            long j3 = (j2 ^ jNanoTime) & (~(j2 ^ j));
            ed0 ed0Var = ed0.NANOSECONDS;
            if (j3 < 0) {
                ed0 ed0Var2 = ed0.MILLISECONDS;
                if (ed0Var.compareTo(ed0Var2) < 0) {
                    long j4 = (jNanoTime / 1000000) - (j / 1000000);
                    long j5 = (jNanoTime % 1000000) - (j % 1000000);
                    z8 z8Var2 = ad0.i;
                    jG = ad0.e(pp0.G(j4, ed0Var2), pp0.G(j5, ed0Var));
                } else {
                    jG = ad0.g(j2 < 0 ? ad0.k : ad0.j);
                }
            } else {
                jG = pp0.G(j2, ed0Var);
            }
        }
        long j6 = jG >> 1;
        z8 z8Var3 = ad0.i;
        long j7 = (1 & ((int) jG)) == 0 ? j6 : j6 > 9223372036854L ? Long.MAX_VALUE : j6 < -9223372036854L ? Long.MIN_VALUE : j6 * 1000000;
        this.v = j7;
        long j8 = this.u - j7;
        this.u = j8;
        this.w = jNanoTime;
        tp0.R("compose:lazy:prefetch:available_time_nanos", j8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.h + ", constraints = " + this.k + ", isComposed = " + d() + ", isMeasured = " + this.n + ", isCanceled = " + this.o + " }";
    }
}
