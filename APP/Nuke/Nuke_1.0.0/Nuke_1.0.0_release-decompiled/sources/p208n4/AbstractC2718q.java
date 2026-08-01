package p208n4;

import java.util.concurrent.atomic.AtomicReference;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n4.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2718q {

    /* JADX INFO: renamed from: a */
    public static final C2717p f8660a = new C2717p(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b */
    public static final int f8661b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f8662c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f8661b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i5 = 0; i5 < iHighestOneBit; i5++) {
            atomicReferenceArr[i5] = new AtomicReference();
        }
        f8662c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m4761a(C2717p c2717p) {
        AbstractC1665j.m2985e(c2717p, "segment");
        if (c2717p.f8658f != null || c2717p.f8659g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c2717p.f8656d) {
            return;
        }
        AtomicReference atomicReference = f8662c[(int) (Thread.currentThread().getId() & (((long) f8661b) - 1))];
        C2717p c2717p2 = f8660a;
        C2717p c2717p3 = (C2717p) atomicReference.getAndSet(c2717p2);
        if (c2717p3 == c2717p2) {
            return;
        }
        int i5 = c2717p3 != null ? c2717p3.f8655c : 0;
        if (i5 >= 65536) {
            atomicReference.set(c2717p3);
            return;
        }
        c2717p.f8658f = c2717p3;
        c2717p.f8654b = 0;
        c2717p.f8655c = i5 + 8192;
        atomicReference.set(c2717p);
    }

    /* JADX INFO: renamed from: b */
    public static final C2717p m4762b() {
        AtomicReference atomicReference = f8662c[(int) (Thread.currentThread().getId() & (((long) f8661b) - 1))];
        C2717p c2717p = f8660a;
        C2717p c2717p2 = (C2717p) atomicReference.getAndSet(c2717p);
        if (c2717p2 == c2717p) {
            return new C2717p();
        }
        if (c2717p2 == null) {
            atomicReference.set(null);
            return new C2717p();
        }
        atomicReference.set(c2717p2.f8658f);
        c2717p2.f8658f = null;
        c2717p2.f8655c = 0;
        return c2717p2;
    }
}
