package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i90 implements a90 {

    /* JADX INFO: renamed from: i */
    public final File f4492i;

    /* JADX INFO: renamed from: m */
    public h90 f4496m;

    /* JADX INFO: renamed from: l */
    public final sz0 f4495l = new sz0(15);

    /* JADX INFO: renamed from: j */
    public final long f4493j = 262144000;

    /* JADX INFO: renamed from: k */
    public final boolean f4494k = true;

    /* JADX INFO: renamed from: h */
    public final dq1 f4491h = new dq1(9);

    public i90(File file) {
        this.f4492i = file;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized h90 m2305a() {
        try {
            if (this.f4496m == null) {
                this.f4496m = h90.m2127h(this.f4492i, this.f4493j, this.f4494k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4496m;
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: d */
    public final File mo112d(a51 a51Var) throws Throwable {
        String strM1084G = this.f4491h.m1084G(a51Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM1084G + " for for Key: " + a51Var);
        }
        try {
            C0043b5 c0043b5M2131k = m2305a().m2131k(strM1084G);
            if (c0043b5M2131k == null) {
                return null;
            }
            File[] fileArr = (File[]) c0043b5M2131k.f563j;
            return fileArr != null ? fileArr[0] : new File(((h90) c0043b5M2131k.f564k).f3908h, ((String) c0043b5M2131k.f562i).concat(".0"));
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: j */
    public final void mo113j(a51 a51Var, C0043b5 c0043b5) {
        c90 c90Var;
        boolean z;
        String strM1084G = this.f4491h.m1084G(a51Var);
        sz0 sz0Var = this.f4495l;
        synchronized (sz0Var) {
            c90Var = (c90) ((HashMap) sz0Var.f10436i).get(strM1084G);
            if (c90Var == null) {
                C0210fo c0210fo = (C0210fo) sz0Var.f10437j;
                synchronized (c0210fo.f3076a) {
                    c90Var = (c90) c0210fo.f3076a.poll();
                }
                if (c90Var == null) {
                    c90Var = new c90();
                }
                ((HashMap) sz0Var.f10436i).put(strM1084G, c90Var);
            }
            c90Var.f1245b++;
        }
        c90Var.f1244a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM1084G + " for for Key: " + a51Var);
            }
            try {
                h90 h90VarM2305a = m2305a();
                if (h90VarM2305a.m2131k(strM1084G) == null) {
                    f90 f90VarM2130g = h90VarM2305a.m2130g(strM1084G);
                    if (f90VarM2130g == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM1084G));
                    }
                    try {
                        if (((we0) c0043b5.f562i).mo2184c(c0043b5.f563j, f90VarM2130g.m1590d(), (ov1) c0043b5.f564k)) {
                            h90.m2124b((h90) f90VarM2130g.f2865d, f90VarM2130g, true);
                            f90VarM2130g.f2862a = true;
                        }
                        if (!z) {
                            try {
                                f90VarM2130g.m1588a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!f90VarM2130g.f2862a) {
                            try {
                                f90VarM2130g.m1588a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.f4495l.m5039L(strM1084G);
        }
    }
}
