package yyds;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: yyds.ᛷᛱᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1478 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0502 f7011 = new C0502(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final int f7012;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final AtomicReference[] f7013;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f7012 = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f7013 = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final void m2976(C0502 c0502) {
        if (c0502.f2447 != null || c0502.f2445 != null) {
            C0188.m798("Failed requirement.");
            return;
        }
        if (c0502.f2448) {
            return;
        }
        AtomicReference atomicReference = f7013[(int) (Thread.currentThread().getId() & (((long) f7012) - 1))];
        C0502 c05022 = f7011;
        C0502 c05023 = (C0502) atomicReference.getAndSet(c05022);
        if (c05023 == c05022) {
            return;
        }
        int i = c05023 != null ? c05023.f2446 : 0;
        if (i >= 65536) {
            atomicReference.set(c05023);
            return;
        }
        c0502.f2447 = c05023;
        c0502.f2444 = 0;
        c0502.f2446 = i + 8192;
        atomicReference.set(c0502);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0502 m2977() {
        AtomicReference atomicReference = f7013[(int) (Thread.currentThread().getId() & (((long) f7012) - 1))];
        C0502 c0502 = f7011;
        C0502 c05022 = (C0502) atomicReference.getAndSet(c0502);
        if (c05022 == c0502) {
            return new C0502();
        }
        if (c05022 == null) {
            atomicReference.set(null);
            return new C0502();
        }
        atomicReference.set(c05022.f2447);
        c05022.f2447 = null;
        c05022.f2446 = 0;
        return c05022;
    }
}
