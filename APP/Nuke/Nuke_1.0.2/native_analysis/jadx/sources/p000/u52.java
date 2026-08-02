package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u52 extends ey2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f11111e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f11112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(ud0 ud0Var, String str) {
        super(str);
        this.f11112f = ud0Var;
    }

    @Override // p000.ey2
    /* JADX INFO: renamed from: a */
    public final long mo1485a() {
        switch (this.f11111e) {
            case 0:
                ud0 ud0Var = (ud0) this.f11112f;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - ud0Var.f11238a) + 1;
                Iterator it = ((ConcurrentLinkedQueue) ud0Var.f11241d).iterator();
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
                        if (ud0Var.m5484a(t52Var4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = t52Var4.f10577q;
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
                        return (j2 + ud0Var.f11238a) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return ud0Var.f11238a;
                    }
                    return -1L;
                }
                synchronized (t52Var) {
                    if (t52Var.f10576p.isEmpty() && t52Var.f10577q == j) {
                        t52Var.f10570j = true;
                        ((ConcurrentLinkedQueue) ud0Var.f11241d).remove(t52Var);
                        wg3.m5890c(t52Var.f10565e);
                        if (!((ConcurrentLinkedQueue) ud0Var.f11241d).isEmpty()) {
                            return 0L;
                        }
                        hy2 hy2Var = (hy2) ud0Var.f11239b;
                        synchronized (hy2Var.f4185a) {
                            if (hy2Var.m2235a()) {
                                hy2Var.f4185a.m2420c(hy2Var);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((xm0) this.f11112f).mo6a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(String str, xm0 xm0Var) {
        super(str);
        this.f11112f = xm0Var;
    }
}
