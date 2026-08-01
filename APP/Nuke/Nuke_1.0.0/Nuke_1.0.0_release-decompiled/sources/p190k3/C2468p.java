package p190k3;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p201m3.C2604a;

/* JADX INFO: renamed from: k3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2468p {
    private volatile AtomicReferenceArray<Object> array;

    public C2468p(int i5) {
        this.array = new AtomicReferenceArray<>(i5);
    }

    /* JADX INFO: renamed from: a */
    public final int m4402a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final Object m4403b(int i5) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i5 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i5);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4404c(int i5, C2604a c2604a) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i5 < length) {
            atomicReferenceArray.set(i5, c2604a);
            return;
        }
        int i6 = i5 + 1;
        int i7 = length * 2;
        if (i6 < i7) {
            i6 = i7;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i6);
        for (int i8 = 0; i8 < length; i8++) {
            atomicReferenceArray2.set(i8, atomicReferenceArray.get(i8));
        }
        atomicReferenceArray2.set(i5, c2604a);
        this.array = atomicReferenceArray2;
    }
}
