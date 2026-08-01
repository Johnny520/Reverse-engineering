package p376zd;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: zd.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10014r0 {

    /* JADX INFO: renamed from: a */
    public static final C10014r0 f33623a = new C10014r0();

    /* JADX INFO: renamed from: b */
    public static final int f33624b = 65536;

    /* JADX INFO: renamed from: c */
    public static final C10012q0 f33625c = new C10012q0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d */
    public static final int f33626d;

    /* JADX INFO: renamed from: e */
    public static final AtomicReference[] f33627e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f33626d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f33627e = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: b */
    public static final void m38829b(C10012q0 c10012q0) {
        c10012q0.getClass();
        if (c10012q0.f33621f != null || c10012q0.f33622g != null) {
            C9987e.m38645a("Failed requirement.");
            return;
        }
        if (c10012q0.f33619d) {
            return;
        }
        AtomicReference atomicReferenceM38831a = f33623a.m38831a();
        C10012q0 c10012q02 = f33625c;
        C10012q0 c10012q03 = (C10012q0) atomicReferenceM38831a.getAndSet(c10012q02);
        if (c10012q03 == c10012q02) {
            return;
        }
        int i10 = c10012q03 != null ? c10012q03.f33618c : 0;
        if (i10 >= f33624b) {
            atomicReferenceM38831a.set(c10012q03);
            return;
        }
        c10012q0.f33621f = c10012q03;
        c10012q0.f33617b = 0;
        c10012q0.f33618c = i10 + 8192;
        atomicReferenceM38831a.set(c10012q0);
    }

    /* JADX INFO: renamed from: c */
    public static final C10012q0 m38830c() {
        AtomicReference atomicReferenceM38831a = f33623a.m38831a();
        C10012q0 c10012q0 = f33625c;
        C10012q0 c10012q02 = (C10012q0) atomicReferenceM38831a.getAndSet(c10012q0);
        if (c10012q02 == c10012q0) {
            return new C10012q0();
        }
        if (c10012q02 == null) {
            atomicReferenceM38831a.set(null);
            return new C10012q0();
        }
        atomicReferenceM38831a.set(c10012q02.f33621f);
        c10012q02.f33621f = null;
        c10012q02.f33618c = 0;
        return c10012q02;
    }

    /* JADX INFO: renamed from: a */
    public final AtomicReference m38831a() {
        return f33627e[(int) (Thread.currentThread().getId() & (((long) f33626d) - 1))];
    }
}
