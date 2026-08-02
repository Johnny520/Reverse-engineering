package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u52 extends ey2 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(ud0 ud0Var, String str) {
        super(str);
        this.f = ud0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ey2
    public final long a() {
        switch (this.e) {
            case 0:
                ud0 ud0Var = (ud0) this.f;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - ud0Var.a) + 1;
                Iterator it = ((ConcurrentLinkedQueue) ud0Var.d).iterator();
                it.getClass();
                t52 t52Var = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                t52 t52Var2 = null;
                t52 t52Var3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    t52 t52Var4 = (t52) it.next();
                    t52Var4.getClass();
                    synchronized (t52Var4) {
                        if (ud0Var.a(t52Var4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = t52Var4.q;
                            if (j3 < j) {
                                j = j3;
                                t52Var2 = t52Var4;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                t52Var3 = t52Var4;
                            }
                        }
                    }
                }
                if (t52Var2 != null) {
                    t52Var = t52Var2;
                } else if (i > 5) {
                    j = j2;
                    t52Var = t52Var3;
                } else {
                    j = -1;
                }
                if (t52Var == null) {
                    if (t52Var3 != null) {
                        return (j2 + ud0Var.a) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return ud0Var.a;
                    }
                    return -1L;
                }
                synchronized (t52Var) {
                    if (t52Var.p.isEmpty() && t52Var.q == j) {
                        t52Var.j = true;
                        ((ConcurrentLinkedQueue) ud0Var.d).remove(t52Var);
                        wg3.c(t52Var.e);
                        if (!((ConcurrentLinkedQueue) ud0Var.d).isEmpty()) {
                            return 0L;
                        }
                        hy2 hy2Var = (hy2) ud0Var.b;
                        synchronized (hy2Var.a) {
                            if (hy2Var.a()) {
                                hy2Var.a.c(hy2Var);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((xm0) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(String str, xm0 xm0Var) {
        super(str);
        this.f = xm0Var;
    }
}
