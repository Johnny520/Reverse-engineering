package kotlinx.coroutines.internal;

import androidx.activity.AbstractC0053;
import com.kongzue.dialogx.interfaces.RunnableC3742;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5409;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.InterfaceC5398;
import kotlinx.coroutines.InterfaceC5406;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5348 extends AbstractC5432 implements InterfaceC5406 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14908 = AtomicIntegerFieldUpdater.newUpdater(C5348.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5366 f14909;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f14910;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f14911;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5406 f14912;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5432 f14913;

    /* JADX WARN: Multi-variable type inference failed */
    public C5348(AbstractC5432 abstractC5432, int i) {
        InterfaceC5406 interfaceC5406 = abstractC5432 instanceof InterfaceC5406 ? (InterfaceC5406) abstractC5432 : null;
        this.f14912 = interfaceC5406 == null ? AbstractC5409.f15048 : interfaceC5406;
        this.f14913 = abstractC5432;
        this.f14910 = i;
        this.f14909 = new C5366();
        this.f14911 = new Object();
    }

    @Override // kotlinx.coroutines.AbstractC5432
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14913);
        sb.append(".limitedParallelism(");
        return AbstractC0053.m156(sb, this.f14910, ')');
    }

    @Override // kotlinx.coroutines.InterfaceC5406
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5398 mo10340(long j, Runnable runnable, InterfaceC4360 interfaceC4360) {
        return this.f14912.mo10340(j, runnable, interfaceC4360);
    }

    @Override // kotlinx.coroutines.InterfaceC5406
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo10341(long j, C5444 c5444) {
        this.f14912.mo10341(j, c5444);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Runnable m10342() {
        while (true) {
            Runnable runnable = (Runnable) this.f14909.m10407();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f14911) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14908;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f14909.m10408() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m10343() {
        synchronized (this.f14911) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14908;
            if (atomicIntegerFieldUpdater.get(this) >= this.f14910) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3458(InterfaceC4360 interfaceC4360, Runnable runnable) {
        Runnable runnableM10342;
        this.f14909.m10410(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14908;
        if (atomicIntegerFieldUpdater.get(this) >= this.f14910 || !m10343() || (runnableM10342 = m10342()) == null) {
            return;
        }
        try {
            AbstractC5353.m10374(this.f14913, this, new RunnableC3742(this, 3, runnableM10342));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo10344(InterfaceC4360 interfaceC4360, Runnable runnable) {
        Runnable runnableM10342;
        this.f14909.m10410(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14908;
        if (atomicIntegerFieldUpdater.get(this) >= this.f14910 || !m10343() || (runnableM10342 = m10342()) == null) {
            return;
        }
        try {
            this.f14913.mo10344(this, new RunnableC3742(this, 3, runnableM10342));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }
}
