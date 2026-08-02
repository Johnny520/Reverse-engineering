package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class wd1 implements x93 {
    public final long h;
    public long i;
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wd1(z93 z93Var) {
        this.j = z93Var;
        this.h = ((long) (z93Var.r() + z93Var.k())) * 1000000;
        this.i = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public boolean a() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public long b(nd ndVar, nd ndVar2, nd ndVar3) {
        return Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized Object c(Object obj) {
        vd1 vd1Var;
        vd1Var = (vd1) ((LinkedHashMap) this.j).get(obj);
        return vd1Var != null ? vd1Var.a : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int d(Object obj) {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized Object f(Object obj, Object obj2) {
        int iD = d(obj2);
        long j = iD;
        if (j >= this.h) {
            e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.i += j;
        }
        vd1 vd1Var = (vd1) ((LinkedHashMap) this.j).put(obj, obj2 == null ? null : new vd1(iD, obj2));
        if (vd1Var != null) {
            this.i -= (long) vd1Var.b;
            if (!vd1Var.a.equals(obj2)) {
                e(obj, vd1Var.a);
            }
        }
        i(this.h);
        return vd1Var != null ? vd1Var.a : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long g(long j) {
        long j2 = j + this.i;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.h;
        return j2 - ((j2 / j3) * j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nd h(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        long j2 = this.i;
        long j3 = j + j2;
        long j4 = this.h;
        return j3 > j4 ? ((z93) this.j).q(j4 - j2, ndVar, ndVar3, ndVar2) : ndVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void i(long j) {
        while (this.i > j) {
            Iterator it = ((LinkedHashMap) this.j).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            vd1 vd1Var = (vd1) entry.getValue();
            this.i -= (long) vd1Var.b;
            Object key = entry.getKey();
            it.remove();
            e(key, vd1Var.a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd q(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        return ((z93) this.j).q(g(j), ndVar, ndVar2, h(j, ndVar, ndVar3, ndVar2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd s(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        return ((z93) this.j).s(g(j), ndVar, ndVar2, h(j, ndVar, ndVar3, ndVar2));
    }

    public wd1(long j) {
        this.j = new LinkedHashMap(100, 0.75f, true);
        this.h = j;
    }

    public void e(Object obj, Object obj2) {
    }
}
