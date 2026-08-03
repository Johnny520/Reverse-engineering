package vg;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p353xg.C5804a;

/* JADX INFO: renamed from: vg.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4566o {
    private volatile AtomicReferenceArray<Object> array;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4566o(int i9) {
        this.array = new AtomicReferenceArray<>(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m9011a() {
        return this.array.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m9012b(int i9) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i9 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i9);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m9013c(int i9, C5804a c5804a) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i9 < length) {
            atomicReferenceArray.set(i9, c5804a);
            return;
        }
        int i10 = i9 + 1;
        int i11 = length * 2;
        if (i10 < i11) {
            i10 = i11;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i10);
        for (int i12 = 0; i12 < length; i12++) {
            atomicReferenceArray2.set(i12, atomicReferenceArray.get(i12));
        }
        atomicReferenceArray2.set(i9, c5804a);
        this.array = atomicReferenceArray2;
    }
}
