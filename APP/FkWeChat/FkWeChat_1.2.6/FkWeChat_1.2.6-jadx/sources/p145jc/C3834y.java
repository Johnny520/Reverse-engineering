package p145jc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: jc.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3834y {
    private volatile AtomicReferenceArray<Object> array;

    public C3834y(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m15266a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final Object m15267b(int i10) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m15268c(int i10, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(AbstractC2368o.m8578e(i10 + 1, length * 2));
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i10, obj);
        this.array = atomicReferenceArray2;
    }
}
