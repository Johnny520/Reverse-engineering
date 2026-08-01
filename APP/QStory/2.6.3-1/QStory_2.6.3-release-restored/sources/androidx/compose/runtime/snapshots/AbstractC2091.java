package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2091 implements InterfaceC2092 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AtomicInt f3993 = new AtomicInt(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m2758(int i) {
        return (this.f3993.get() & i) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2759(int i) {
        AtomicInt atomicInt;
        int i2;
        do {
            atomicInt = this.f3993;
            i2 = atomicInt.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!atomicInt.compareAndSet(i2, i2 | i));
    }
}
