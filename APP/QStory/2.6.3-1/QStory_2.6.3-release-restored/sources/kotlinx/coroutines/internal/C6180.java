package kotlinx.coroutines.internal;

import androidx.activity.AbstractC0900;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6241;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6230;
import kotlinx.coroutines.InterfaceC6238;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6180 extends AbstractC6264 implements InterfaceC6238 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15253 = AtomicIntegerFieldUpdater.newUpdater(C6180.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6198 f15254;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f15255;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f15256;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6238 f15257;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC6264 f15258;

    /* JADX WARN: Multi-variable type inference failed */
    public C6180(AbstractC6264 abstractC6264, int i) {
        InterfaceC6238 interfaceC6238 = abstractC6264 instanceof InterfaceC6238 ? (InterfaceC6238) abstractC6264 : null;
        this.f15257 = interfaceC6238 == null ? AbstractC6241.f15393 : interfaceC6238;
        this.f15258 = abstractC6264;
        this.f15255 = i;
        this.f15254 = new C6198();
        this.f15256 = new Object();
    }

    @Override // kotlinx.coroutines.AbstractC6264
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15258);
        sb.append(".limitedParallelism(");
        return AbstractC0900.m716(sb, this.f15255, ')');
    }

    @Override // kotlinx.coroutines.InterfaceC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6230 mo10899(long j, Runnable runnable, InterfaceC5192 interfaceC5192) {
        return this.f15257.mo10899(j, runnable, interfaceC5192);
    }

    @Override // kotlinx.coroutines.InterfaceC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo10900(long j, C6276 c6276) {
        this.f15257.mo10900(j, c6276);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Runnable m10901() {
        while (true) {
            Runnable runnable = (Runnable) this.f15254.m10966();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f15256) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15253;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f15254.m10967() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m10902() {
        synchronized (this.f15256) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15253;
            if (atomicIntegerFieldUpdater.get(this) >= this.f15255) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4018(InterfaceC5192 interfaceC5192, Runnable runnable) {
        Runnable runnableM10901;
        this.f15254.m10969(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15253;
        if (atomicIntegerFieldUpdater.get(this) >= this.f15255 || !m10902() || (runnableM10901 = m10901()) == null) {
            return;
        }
        try {
            AbstractC6185.m10933(this.f15258, this, new RunnableC4574(this, 3, runnableM10901));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo10903(InterfaceC5192 interfaceC5192, Runnable runnable) {
        Runnable runnableM10901;
        this.f15254.m10969(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15253;
        if (atomicIntegerFieldUpdater.get(this) >= this.f15255 || !m10902() || (runnableM10901 = m10901()) == null) {
            return;
        }
        try {
            this.f15258.mo10903(this, new RunnableC4574(this, 3, runnableM10901));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }
}
