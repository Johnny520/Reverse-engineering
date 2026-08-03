package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: nw */
/* JADX INFO: loaded from: classes.dex */
public final class C2295nw {
    private volatile AtomicReferenceArray<Object> array;

    public C2295nw(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* JADX INFO: renamed from: a */
    public final int m4628a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final Object m4629b(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4630c(int i, C1322dc c1322dc) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c1322dc);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, c1322dc);
        this.array = atomicReferenceArray2;
    }
}
