package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.InterfaceC5453;
import net.bytebuddy.jar.asm.Opcodes;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5360 extends AbstractC5351 implements InterfaceC5453 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14943 = AtomicIntegerFieldUpdater.newUpdater(AbstractC5360.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f14944;

    public AbstractC5360(long j, AbstractC5360 abstractC5360, int i) {
        super(abstractC5360);
        this.f14944 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m10383() {
        if (f14943.incrementAndGet(this) == mo10267()) {
            m10356();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo10263(int i, InterfaceC4359 interfaceC4359);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m10384() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f14943;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo10267() && m10351() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    @Override // kotlinx.coroutines.internal.AbstractC5351
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo10355() {
        return f14943.get(this) == mo10267() && m10351() != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m10385() {
        return f14943.addAndGet(this, Opcodes.V_PREVIEW) == mo10267() && m10351() != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract int mo10267();
}
