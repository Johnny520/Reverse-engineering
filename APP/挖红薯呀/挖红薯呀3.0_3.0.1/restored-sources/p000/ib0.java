package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class ib0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2503a = AtomicReferenceFieldUpdater.newUpdater(ib0.class, Object.class, "_cur$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ long f2504b = uw0.f6315a.objectFieldOffset(ib0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new kb0(8, false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1572a(Runnable runnable) {
        ib0 ib0Var;
        while (true) {
            f2503a.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2504b;
            kb0 kb0Var = (kb0) unsafe.getObjectVolatile(this, j);
            int iM1783a = kb0Var.m1783a(runnable);
            if (iM1783a == 0) {
                return true;
            }
            if (iM1783a == 1) {
                kb0 kb0VarM1786d = kb0Var.m1786d();
                while (true) {
                    Unsafe unsafe2 = uw0.f6315a;
                    ib0Var = this;
                    if (!unsafe2.compareAndSwapObject(ib0Var, f2504b, kb0Var, kb0VarM1786d) && unsafe2.getObjectVolatile(ib0Var, j) == kb0Var) {
                        this = ib0Var;
                    }
                }
            } else {
                if (iM1783a == 2) {
                    return false;
                }
                ib0Var = this;
            }
            this = ib0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1573b() {
        ib0 ib0Var;
        while (true) {
            f2503a.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2504b;
            kb0 kb0Var = (kb0) unsafe.getObjectVolatile(this, j);
            if (kb0Var.m1785c()) {
                return;
            }
            kb0 kb0VarM1786d = kb0Var.m1786d();
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                ib0Var = this;
                if (!unsafe2.compareAndSwapObject(ib0Var, f2504b, kb0Var, kb0VarM1786d) && unsafe2.getObjectVolatile(ib0Var, j) == kb0Var) {
                    this = ib0Var;
                }
            }
            this = ib0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m1574c() {
        f2503a.getClass();
        kb0 kb0Var = (kb0) uw0.f6315a.getObjectVolatile(this, f2504b);
        kb0Var.getClass();
        long j = kb0.f3059f.get(kb0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m1575d() {
        ib0 ib0Var;
        while (true) {
            f2503a.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2504b;
            kb0 kb0Var = (kb0) unsafe.getObjectVolatile(this, j);
            Object objM1787e = kb0Var.m1787e();
            if (objM1787e != kb0.f3060g) {
                return objM1787e;
            }
            kb0 kb0VarM1786d = kb0Var.m1786d();
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                ib0Var = this;
                if (!unsafe2.compareAndSwapObject(ib0Var, f2504b, kb0Var, kb0VarM1786d) && unsafe2.getObjectVolatile(ib0Var, j) == kb0Var) {
                    this = ib0Var;
                }
            }
            this = ib0Var;
        }
    }
}
