package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pm2 {
    public static final mm2 a = new mm2(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(mm2 mm2Var) {
        mm2Var.getClass();
        if (mm2Var.f != null || mm2Var.g != null) {
            s.j("Failed requirement.");
            return;
        }
        if (mm2Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        mm2 mm2Var2 = a;
        mm2 mm2Var3 = (mm2) atomicReference.getAndSet(mm2Var2);
        if (mm2Var3 == mm2Var2) {
            return;
        }
        int i = mm2Var3 != null ? mm2Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(mm2Var3);
            return;
        }
        mm2Var.f = mm2Var3;
        mm2Var.b = 0;
        mm2Var.c = i + 8192;
        atomicReference.set(mm2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final mm2 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        mm2 mm2Var = a;
        mm2 mm2Var2 = (mm2) atomicReference.getAndSet(mm2Var);
        if (mm2Var2 == mm2Var) {
            return new mm2();
        }
        if (mm2Var2 == null) {
            atomicReference.set(null);
            return new mm2();
        }
        atomicReference.set(mm2Var2.f);
        mm2Var2.f = null;
        mm2Var2.c = 0;
        return mm2Var2;
    }
}
