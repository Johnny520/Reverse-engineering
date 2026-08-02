package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i90 implements a90 {
    public final File i;
    public h90 m;
    public final sz0 l = new sz0(15);
    public final long j = 262144000;
    public final boolean k = true;
    public final dq1 h = new dq1(9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i90(File file) {
        this.i = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized h90 a() {
        try {
            if (this.m == null) {
                this.m = h90.h(this.i, this.j, this.k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a90
    public final File d(a51 a51Var) throws Throwable {
        String strG = this.h.G(a51Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strG + " for for Key: " + a51Var);
        }
        try {
            b5 b5VarK = a().k(strG);
            if (b5VarK == null) {
                return null;
            }
            File[] fileArr = (File[]) b5VarK.j;
            return fileArr != null ? fileArr[0] : new File(((h90) b5VarK.k).h, ((String) b5VarK.i).concat(".0"));
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a90
    public final void j(a51 a51Var, b5 b5Var) {
        c90 c90Var;
        boolean z;
        String strG = this.h.G(a51Var);
        sz0 sz0Var = this.l;
        synchronized (sz0Var) {
            c90Var = (c90) ((HashMap) sz0Var.i).get(strG);
            if (c90Var == null) {
                fo foVar = (fo) sz0Var.j;
                synchronized (foVar.a) {
                    c90Var = (c90) foVar.a.poll();
                }
                if (c90Var == null) {
                    c90Var = new c90();
                }
                ((HashMap) sz0Var.i).put(strG, c90Var);
            }
            c90Var.b++;
        }
        c90Var.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strG + " for for Key: " + a51Var);
            }
            try {
                h90 h90VarA = a();
                if (h90VarA.k(strG) == null) {
                    f90 f90VarG = h90VarA.g(strG);
                    if (f90VarG == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strG));
                    }
                    try {
                        if (((we0) b5Var.i).c(b5Var.j, f90VarG.d(), (ov1) b5Var.k)) {
                            h90.b((h90) f90VarG.d, f90VarG, true);
                            f90VarG.a = true;
                        }
                        if (!z) {
                            try {
                                f90VarG.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!f90VarG.a) {
                            try {
                                f90VarG.a();
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
            this.l.L(strG);
        }
    }
}
