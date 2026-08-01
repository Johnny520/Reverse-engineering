package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1256 implements InterfaceC1257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AtomicInt f3647 = new AtomicInt(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m2188(int i) {
        return (this.f3647.get() & i) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2189(int i) {
        AtomicInt atomicInt;
        int i2;
        do {
            atomicInt = this.f3647;
            i2 = atomicInt.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!atomicInt.compareAndSet(i2, i2 | i));
    }
}
