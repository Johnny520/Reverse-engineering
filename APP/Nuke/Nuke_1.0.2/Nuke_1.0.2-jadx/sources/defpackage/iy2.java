package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iy2 {
    public static final Logger k;
    public static final iy2 l;
    public final hh1 a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final y4 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Logger logger = Logger.getLogger(iy2.class.getName());
        logger.getClass();
        k = logger;
        l = new iy2(new hh1(new vg3(hk1.j(new StringBuilder(), wg3.b, " TaskRunner"), true)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public iy2(hh1 hh1Var) {
        Logger logger = k;
        logger.getClass();
        this.a = hh1Var;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new y4(5, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(iy2 iy2Var, ey2 ey2Var, long j, boolean z) {
        TimeZone timeZone = wg3.a;
        hy2 hy2Var = ey2Var.c;
        hy2Var.getClass();
        if (hy2Var.d != ey2Var) {
            s.l("Check failed.");
            return;
        }
        boolean z2 = hy2Var.f;
        hy2Var.f = false;
        hy2Var.d = null;
        iy2Var.h.remove(hy2Var);
        if (j != -1 && !z2 && !hy2Var.c) {
            hy2Var.d(ey2Var, j, true);
        }
        if (hy2Var.e.isEmpty()) {
            return;
        }
        iy2Var.i.add(hy2Var);
        if (z) {
            return;
        }
        iy2Var.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ey2 b() {
        boolean z;
        TimeZone timeZone = wg3.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            ey2 ey2Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ey2 ey2Var2 = (ey2) ((hy2) it.next()).e.get(0);
                long jMax = Math.max(0L, ey2Var2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (ey2Var != null) {
                        z = true;
                        break;
                    }
                    ey2Var = ey2Var2;
                }
            }
            ArrayList arrayList2 = this.h;
            if (ey2Var != null) {
                TimeZone timeZone2 = wg3.a;
                ey2Var.d = -1L;
                hy2 hy2Var = ey2Var.c;
                hy2Var.getClass();
                hy2Var.e.remove(ey2Var);
                arrayList.remove(hy2Var);
                hy2Var.d = ey2Var;
                arrayList2.add(hy2Var);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return ey2Var;
            }
            if (!this.d) {
                this.d = true;
                this.e = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = wg3.a;
                        if (jMin > 0) {
                            long j = jMin / 1000000;
                            long j2 = jMin - (1000000 * j);
                            if (j > 0 || jMin > 0) {
                                wait(j, (int) j2);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = wg3.a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((hy2) arrayList2.get(size)).a();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            hy2 hy2Var2 = (hy2) arrayList.get(size2);
                            hy2Var2.a();
                            if (hy2Var2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.d = false;
                }
            } else if (jMin < this.e - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(hy2 hy2Var) {
        hy2Var.getClass();
        TimeZone timeZone = wg3.a;
        if (hy2Var.d == null) {
            boolean zIsEmpty = hy2Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(hy2Var);
            } else {
                byte[] bArr = ug3.a;
                arrayList.getClass();
                if (!arrayList.contains(hy2Var)) {
                    arrayList.add(hy2Var);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final hy2 d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new hy2(this, vi0.g("Q", i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        TimeZone timeZone = wg3.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        y4 y4Var = this.j;
        y4Var.getClass();
        ((ThreadPoolExecutor) this.a.i).execute(y4Var);
    }
}
