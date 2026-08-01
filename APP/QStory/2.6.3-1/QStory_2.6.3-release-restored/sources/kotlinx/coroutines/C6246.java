package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6246 extends AbstractC6282 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15398 = AtomicIntegerFieldUpdater.newUpdater(C6246.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Thread f15399 = Thread.currentThread();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC6230 f15400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m11072(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m11073() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15398;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m11072(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                InterfaceC6230 interfaceC6230 = this.f15400;
                if (interfaceC6230 != null) {
                    interfaceC6230.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo11027(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f15398;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m11072(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f15399.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo11028() {
        return true;
    }
}
