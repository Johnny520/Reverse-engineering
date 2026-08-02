package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iy2 {

    /* JADX INFO: renamed from: k */
    public static final Logger f4833k;

    /* JADX INFO: renamed from: l */
    public static final iy2 f4834l;

    /* JADX INFO: renamed from: a */
    public final hh1 f4835a;

    /* JADX INFO: renamed from: b */
    public final Logger f4836b;

    /* JADX INFO: renamed from: c */
    public int f4837c;

    /* JADX INFO: renamed from: d */
    public boolean f4838d;

    /* JADX INFO: renamed from: e */
    public long f4839e;

    /* JADX INFO: renamed from: f */
    public int f4840f;

    /* JADX INFO: renamed from: g */
    public int f4841g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4842h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f4843i;

    /* JADX INFO: renamed from: j */
    public final RunnableC0910y4 f4844j;

    static {
        Logger logger = Logger.getLogger(iy2.class.getName());
        logger.getClass();
        f4833k = logger;
        f4834l = new iy2(new hh1(new vg3(hk1.m2211j(new StringBuilder(), wg3.f12508b, " TaskRunner"), true)));
    }

    public iy2(hh1 hh1Var) {
        Logger logger = f4833k;
        logger.getClass();
        this.f4835a = hh1Var;
        this.f4836b = logger;
        this.f4837c = 10000;
        this.f4842h = new ArrayList();
        this.f4843i = new ArrayList();
        this.f4844j = new RunnableC0910y4(5, this);
    }

    /* JADX INFO: renamed from: a */
    public static final void m2418a(iy2 iy2Var, ey2 ey2Var, long j, boolean z) {
        TimeZone timeZone = wg3.f12507a;
        hy2 hy2Var = ey2Var.f2687c;
        hy2Var.getClass();
        if (hy2Var.f4188d != ey2Var) {
            C0676s.m4653l("Check failed.");
            return;
        }
        boolean z2 = hy2Var.f4190f;
        hy2Var.f4190f = false;
        hy2Var.f4188d = null;
        iy2Var.f4842h.remove(hy2Var);
        if (j != -1 && !z2 && !hy2Var.f4187c) {
            hy2Var.m2237d(ey2Var, j, true);
        }
        if (hy2Var.f4189e.isEmpty()) {
            return;
        }
        iy2Var.f4843i.add(hy2Var);
        if (z) {
            return;
        }
        iy2Var.m2422e();
    }

    /* JADX INFO: renamed from: b */
    public final ey2 m2419b() {
        boolean z;
        TimeZone timeZone = wg3.f12507a;
        while (true) {
            ArrayList arrayList = this.f4843i;
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
                ey2 ey2Var2 = (ey2) ((hy2) it.next()).f4189e.get(0);
                long jMax = Math.max(0L, ey2Var2.f2688d - jNanoTime);
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
            ArrayList arrayList2 = this.f4842h;
            if (ey2Var != null) {
                TimeZone timeZone2 = wg3.f12507a;
                ey2Var.f2688d = -1L;
                hy2 hy2Var = ey2Var.f2687c;
                hy2Var.getClass();
                hy2Var.f4189e.remove(ey2Var);
                arrayList.remove(hy2Var);
                hy2Var.f4188d = ey2Var;
                arrayList2.add(hy2Var);
                if (z || (!this.f4838d && !arrayList.isEmpty())) {
                    m2422e();
                }
                return ey2Var;
            }
            if (!this.f4838d) {
                this.f4838d = true;
                this.f4839e = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = wg3.f12507a;
                        if (jMin > 0) {
                            long j = jMin / 1000000;
                            long j2 = jMin - (1000000 * j);
                            if (j > 0 || jMin > 0) {
                                wait(j, (int) j2);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = wg3.f12507a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((hy2) arrayList2.get(size)).m2235a();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            hy2 hy2Var2 = (hy2) arrayList.get(size2);
                            hy2Var2.m2235a();
                            if (hy2Var2.f4189e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f4838d = false;
                }
            } else if (jMin < this.f4839e - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2420c(hy2 hy2Var) {
        hy2Var.getClass();
        TimeZone timeZone = wg3.f12507a;
        if (hy2Var.f4188d == null) {
            boolean zIsEmpty = hy2Var.f4189e.isEmpty();
            ArrayList arrayList = this.f4843i;
            if (zIsEmpty) {
                arrayList.remove(hy2Var);
            } else {
                byte[] bArr = ug3.f11300a;
                arrayList.getClass();
                if (!arrayList.contains(hy2Var)) {
                    arrayList.add(hy2Var);
                }
            }
        }
        if (this.f4838d) {
            notify();
        } else {
            m2422e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final hy2 m2421d() {
        int i;
        synchronized (this) {
            i = this.f4837c;
            this.f4837c = i + 1;
        }
        return new hy2(this, vi0.m5688g("Q", i));
    }

    /* JADX INFO: renamed from: e */
    public final void m2422e() {
        TimeZone timeZone = wg3.f12507a;
        int i = this.f4840f;
        if (i > this.f4841g) {
            return;
        }
        this.f4840f = i + 1;
        RunnableC0910y4 runnableC0910y4 = this.f4844j;
        runnableC0910y4.getClass();
        ((ThreadPoolExecutor) this.f4835a.f4019i).execute(runnableC0910y4);
    }
}
