package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.InterfaceC5454;
import net.bytebuddy.jar.asm.Opcodes;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5361 extends AbstractC5352 implements InterfaceC5454 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14943 = AtomicIntegerFieldUpdater.newUpdater(AbstractC5361.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f14944;

    public AbstractC5361(long j, AbstractC5361 abstractC5361, int i) {
        super(abstractC5361);
        this.f14944 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m10387() {
        if (f14943.incrementAndGet(this) == mo10271()) {
            m10360();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo10267(int i, InterfaceC4360 interfaceC4360);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m10388() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f14943;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo10271() && m10355() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    @Override // kotlinx.coroutines.internal.AbstractC5352
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo10359() {
        return f14943.get(this) == mo10271() && m10355() != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m10389() {
        return f14943.addAndGet(this, Opcodes.V_PREVIEW) == mo10271() && m10355() != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract int mo10271();
}
