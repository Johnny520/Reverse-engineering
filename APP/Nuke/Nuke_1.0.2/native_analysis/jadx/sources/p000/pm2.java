package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pm2 {

    /* JADX INFO: renamed from: a */
    public static final mm2 f8409a = new mm2(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b */
    public static final int f8410b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f8411c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f8410b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f8411c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m3883a(mm2 mm2Var) {
        mm2Var.getClass();
        if (mm2Var.f6726f != null || mm2Var.f6727g != null) {
            C0676s.m4651j("Failed requirement.");
            return;
        }
        if (mm2Var.f6724d) {
            return;
        }
        AtomicReference atomicReference = f8411c[(int) (Thread.currentThread().getId() & (((long) f8410b) - 1))];
        mm2 mm2Var2 = f8409a;
        mm2 mm2Var3 = (mm2) atomicReference.getAndSet(mm2Var2);
        if (mm2Var3 == mm2Var2) {
            return;
        }
        int i = mm2Var3 != null ? mm2Var3.f6723c : 0;
        if (i >= 65536) {
            atomicReference.set(mm2Var3);
            return;
        }
        mm2Var.f6726f = mm2Var3;
        mm2Var.f6722b = 0;
        mm2Var.f6723c = i + 8192;
        atomicReference.set(mm2Var);
    }

    /* JADX INFO: renamed from: b */
    public static final mm2 m3884b() {
        AtomicReference atomicReference = f8411c[(int) (Thread.currentThread().getId() & (((long) f8410b) - 1))];
        mm2 mm2Var = f8409a;
        mm2 mm2Var2 = (mm2) atomicReference.getAndSet(mm2Var);
        if (mm2Var2 == mm2Var) {
            return new mm2();
        }
        if (mm2Var2 == null) {
            atomicReference.set(null);
            return new mm2();
        }
        atomicReference.set(mm2Var2.f6726f);
        mm2Var2.f6726f = null;
        mm2Var2.f6723c = 0;
        return mm2Var2;
    }
}
