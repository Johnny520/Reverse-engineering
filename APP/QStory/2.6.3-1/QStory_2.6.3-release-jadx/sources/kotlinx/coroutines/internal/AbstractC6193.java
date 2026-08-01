package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.InterfaceC6286;
import net.bytebuddy.jar.asm.Opcodes;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6193 extends AbstractC6184 implements InterfaceC6286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15288 = AtomicIntegerFieldUpdater.newUpdater(AbstractC6193.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f15289;

    public AbstractC6193(long j, AbstractC6193 abstractC6193, int i) {
        super(abstractC6193);
        this.f15289 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m10946() {
        if (f15288.incrementAndGet(this) == mo10830()) {
            m10919();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo10826(int i, InterfaceC5192 interfaceC5192);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m10947() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f15288;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo10830() && m10914() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    @Override // kotlinx.coroutines.internal.AbstractC6184
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo10918() {
        return f15288.get(this) == mo10830() && m10914() != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m10948() {
        return f15288.addAndGet(this, Opcodes.V_PREVIEW) == mo10830() && m10914() != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract int mo10830();
}
