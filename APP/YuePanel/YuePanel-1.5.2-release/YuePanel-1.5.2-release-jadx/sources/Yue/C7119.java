package Yue;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: Yue.ۥۡۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7119<T> {

    @InterfaceC6399
    private volatile AtomicReferenceArray<T> array;

    public C7119(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* JADX INFO: renamed from: ۥ */
    public final int m3406() {
        return this.array.length();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final T m3407(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m22229(int i, @InterfaceC6489 T t) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(C7007.m21661(i + 1, length * 2));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, t);
        this.array = atomicReferenceArray2;
    }
}
