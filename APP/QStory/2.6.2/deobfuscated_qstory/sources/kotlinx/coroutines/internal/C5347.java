package kotlinx.coroutines.internal;

import androidx.activity.AbstractC0053;
import com.kongzue.dialogx.interfaces.RunnableC3741;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5408;
import kotlinx.coroutines.AbstractC5431;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.InterfaceC5397;
import kotlinx.coroutines.InterfaceC5405;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5347 extends AbstractC5431 implements InterfaceC5405 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14908 = AtomicIntegerFieldUpdater.newUpdater(C5347.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5365 f14909;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f14910;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f14911;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5405 f14912;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5431 f14913;

    /* JADX WARN: Multi-variable type inference failed */
    public C5347(AbstractC5431 abstractC5431, int i) {
        InterfaceC5405 interfaceC5405 = abstractC5431 instanceof InterfaceC5405 ? (InterfaceC5405) abstractC5431 : null;
        this.f14912 = interfaceC5405 == null ? AbstractC5408.f15048 : interfaceC5405;
        this.f14913 = abstractC5431;
        this.f14910 = i;
        this.f14909 = new C5365();
        this.f14911 = new Object();
    }

    @Override // kotlinx.coroutines.AbstractC5431
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14913);
        sb.append(".limitedParallelism(");
        return AbstractC0053.m154(sb, this.f14910, ')');
    }

    @Override // kotlinx.coroutines.InterfaceC5405
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5397 mo10336(long j, Runnable runnable, InterfaceC4359 interfaceC4359) {
        return this.f14912.mo10336(j, runnable, interfaceC4359);
    }

    @Override // kotlinx.coroutines.InterfaceC5405
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo10337(long j, C5443 c5443) {
        this.f14912.mo10337(j, c5443);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m10338() {
        synchronized (this.f14911) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14908;
            if (atomicIntegerFieldUpdater.get(this) >= this.f14910) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Runnable m10339() {
        while (true) {
            Runnable runnable = (Runnable) this.f14909.m10403();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f14911) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14908;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f14909.m10404() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3448(InterfaceC4359 interfaceC4359, Runnable runnable) {
        Runnable runnableM10339;
        this.f14909.m10406(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14908;
        if (atomicIntegerFieldUpdater.get(this) >= this.f14910 || !m10338() || (runnableM10339 = m10339()) == null) {
            return;
        }
        try {
            AbstractC5352.m10370(this.f14913, this, new RunnableC3741(this, 3, runnableM10339));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo10340(InterfaceC4359 interfaceC4359, Runnable runnable) {
        Runnable runnableM10339;
        this.f14909.m10406(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14908;
        if (atomicIntegerFieldUpdater.get(this) >= this.f14910 || !m10338() || (runnableM10339 = m10339()) == null) {
            return;
        }
        try {
            this.f14913.mo10340(this, new RunnableC3741(this, 3, runnableM10339));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }
}
