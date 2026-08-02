package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hy2 {
    public final iy2 a;
    public final String b;
    public boolean c;
    public ey2 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hy2(iy2 iy2Var, String str) {
        this.a = iy2Var;
        this.b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(hy2 hy2Var, String str, xm0 xm0Var) {
        hy2Var.getClass();
        str.getClass();
        xm0Var.getClass();
        hy2Var.c(new u52(str, xm0Var), 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        ey2 ey2Var = this.d;
        if (ey2Var != null && ey2Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((ey2) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                ey2 ey2Var2 = (ey2) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    op0.g(logger, ey2Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(ey2 ey2Var, long j) {
        ey2Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(ey2Var, j, false)) {
                    this.a.c(this);
                }
                return;
            }
            boolean z = ey2Var.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    op0.g(logger, ey2Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    op0.g(logger, ey2Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(ey2 ey2Var, long j, boolean z) {
        Iterator it;
        int size;
        Logger logger = this.a.b;
        ey2Var.getClass();
        hy2 hy2Var = ey2Var.c;
        if (hy2Var != this) {
            if (hy2Var != null) {
                s.l("task is in multiple queues");
                return false;
            }
            ey2Var.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(ey2Var);
        if (iIndexOf == -1) {
            ey2Var.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                op0.g(logger, ey2Var, this, z ? "run again after ".concat(op0.o(j2 - jNanoTime)) : "scheduled after ".concat(op0.o(j2 - jNanoTime)));
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((ey2) it.next()).d - jNanoTime > j) {
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
        } else if (ey2Var.d > j2) {
            arrayList.remove(iIndexOf);
            ey2Var.d = j2;
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
            op0.g(logger, ey2Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        iy2 iy2Var = this.a;
        TimeZone timeZone = wg3.a;
        synchronized (iy2Var) {
            this.c = true;
            if (a()) {
                this.a.c(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.b;
    }
}
