package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hy2 {

    /* JADX INFO: renamed from: a */
    public final iy2 f4185a;

    /* JADX INFO: renamed from: b */
    public final String f4186b;

    /* JADX INFO: renamed from: c */
    public boolean f4187c;

    /* JADX INFO: renamed from: d */
    public ey2 f4188d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f4189e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f4190f;

    public hy2(iy2 iy2Var, String str) {
        this.f4185a = iy2Var;
        this.f4186b = str;
    }

    /* JADX INFO: renamed from: b */
    public static void m2234b(hy2 hy2Var, String str, xm0 xm0Var) {
        hy2Var.getClass();
        str.getClass();
        xm0Var.getClass();
        hy2Var.m2236c(new u52(str, xm0Var), 0L);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2235a() {
        ey2 ey2Var = this.f4188d;
        if (ey2Var != null && ey2Var.f2686b) {
            this.f4190f = true;
        }
        ArrayList arrayList = this.f4189e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((ey2) arrayList.get(size)).f2686b) {
                Logger logger = this.f4185a.f4836b;
                ey2 ey2Var2 = (ey2) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    op0.m3585g(logger, ey2Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m2236c(ey2 ey2Var, long j) {
        ey2Var.getClass();
        synchronized (this.f4185a) {
            if (!this.f4187c) {
                if (m2237d(ey2Var, j, false)) {
                    this.f4185a.m2420c(this);
                }
                return;
            }
            boolean z = ey2Var.f2686b;
            Logger logger = this.f4185a.f4836b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    op0.m3585g(logger, ey2Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    op0.m3585g(logger, ey2Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2237d(ey2 ey2Var, long j, boolean z) {
        Iterator it;
        int size;
        Logger logger = this.f4185a.f4836b;
        ey2Var.getClass();
        hy2 hy2Var = ey2Var.f2687c;
        if (hy2Var != this) {
            if (hy2Var != null) {
                C0676s.m4653l("task is in multiple queues");
                return false;
            }
            ey2Var.f2687c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f4189e;
        int iIndexOf = arrayList.indexOf(ey2Var);
        if (iIndexOf == -1) {
            ey2Var.f2688d = j2;
            if (logger.isLoggable(Level.FINE)) {
                op0.m3585g(logger, ey2Var, this, z ? "run again after ".concat(op0.m3592o(j2 - jNanoTime)) : "scheduled after ".concat(op0.m3592o(j2 - jNanoTime)));
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((ey2) it.next()).f2688d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, ey2Var);
            if (size != 0) {
                return true;
            }
        } else if (ey2Var.f2688d > j2) {
            arrayList.remove(iIndexOf);
            ey2Var.f2688d = j2;
            if (logger.isLoggable(Level.FINE)) {
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                }
                size++;
            }
            if (size == -1) {
            }
            arrayList.add(size, ey2Var);
            if (size != 0) {
            }
        } else if (logger.isLoggable(Level.FINE)) {
            op0.m3585g(logger, ey2Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m2238e() {
        iy2 iy2Var = this.f4185a;
        TimeZone timeZone = wg3.f12507a;
        synchronized (iy2Var) {
            this.f4187c = true;
            if (m2235a()) {
                this.f4185a.m2420c(this);
            }
        }
    }

    public final String toString() {
        return this.f4186b;
    }
}
