package androidx.compose.runtime;

import android.os.Trace;
import androidx.collection.AbstractC0285;
import androidx.collection.AbstractC0286;
import androidx.collection.C0235;
import androidx.collection.C0237;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1251;
import androidx.compose.ui.node.C1778;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1391 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1778 f4040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f4041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6554 f4042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1324 f4043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC1372 f4044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1363 f4045;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f4047;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C1251 f4048;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1340 f4049;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC0286 f4051;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AtomicReference f4046 = new AtomicReference(PausedCompositionState.InitialPending);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f4050 = AbstractC1254.m2191();

    public C1391(C1363 c1363, AbstractC1372 abstractC1372, C1324 c1324, C0237 c0237, InterfaceC6554 interfaceC6554, boolean z, C1778 c1778, Object obj) {
        this.f4045 = c1363;
        this.f4044 = abstractC1372;
        this.f4043 = c1324;
        this.f4042 = interfaceC6554;
        this.f4041 = z;
        this.f4040 = c1778;
        this.f4047 = obj;
        C0235 c0235 = AbstractC0285.f997;
        c0235.getClass();
        this.f4051 = c0235;
        C1251 c1251 = new C1251();
        c1251.m2183(c0237, c1324.m2352());
        this.f4048 = c1251;
        this.f4049 = new C1340(c1778.f5214);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2532(InterfaceC1342 interfaceC1342) throws Exception {
        AtomicReference atomicReference = this.f4046;
        try {
            int i = AbstractC1375.f3980[((PausedCompositionState) atomicReference.get()).ordinal()];
            C1363 c1363 = this.f4045;
            AbstractC1372 abstractC1372 = this.f4044;
            switch (i) {
                case 1:
                    C1324 c1324 = this.f4043;
                    boolean z = this.f4041;
                    if (z) {
                        c1324.f3849 = 0;
                        c1324.f3850 = true;
                    }
                    try {
                        this.f4051 = abstractC1372.mo2316(c1363, interfaceC1342, this.f4042);
                        PausedCompositionState pausedCompositionState = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                                if (atomicReference.get() != pausedCompositionState) {
                                    AbstractC1392.m2537("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                                }
                            }
                        }
                        if (this.f4051.m873()) {
                            m2533();
                        }
                        return m2534();
                    } finally {
                        if (z) {
                            c1324.m2367();
                        }
                    }
                case 2:
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(pausedCompositionState3, pausedCompositionState4)) {
                            if (atomicReference.get() != pausedCompositionState3) {
                                AbstractC1392.m2537("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                            }
                        }
                    }
                    long j = this.f4050;
                    try {
                        this.f4050 = AbstractC1254.m2191();
                        this.f4051 = abstractC1372.mo2323(c1363, interfaceC1342, this.f4051);
                        this.f4050 = j;
                        PausedCompositionState pausedCompositionState5 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState6 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState5, pausedCompositionState6)) {
                                if (atomicReference.get() != pausedCompositionState5) {
                                    AbstractC1392.m2537("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                                }
                            }
                        }
                        if (this.f4051.m873()) {
                            m2533();
                        }
                        return m2534();
                    } catch (Throwable th) {
                        this.f4050 = j;
                        PausedCompositionState pausedCompositionState7 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState8 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState7, pausedCompositionState8)) {
                                if (atomicReference.get() != pausedCompositionState7) {
                                    AbstractC1392.m2537("Unexpected state change from: " + pausedCompositionState7 + " to: " + pausedCompositionState8 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                                }
                            }
                        }
                        throw th;
                    }
                case 3:
                    AbstractC1374.m2506("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.Invalid);
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2533() {
        boolean z;
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        while (true) {
            AtomicReference atomicReference = this.f4046;
            if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                z = true;
                break;
            } else if (atomicReference.get() != pausedCompositionState) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        AbstractC1392.m2537("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m2534() {
        return ((PausedCompositionState) this.f4046.get()).compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2535() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f4047) {
                try {
                    this.f4049.m2429(this.f4040, this.f4048);
                    this.f4048.m2180();
                    this.f4048.m2179();
                } finally {
                    this.f4048.m2181();
                    this.f4045.f3956 = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2536() throws Exception {
        AtomicReference atomicReference = this.f4046;
        try {
            switch (AbstractC1375.f3980[((PausedCompositionState) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    m2535();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.Applied;
                    while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                        if (atomicReference.get() != pausedCompositionState) {
                            AbstractC1392.m2537("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.Invalid);
            throw e;
        }
    }
}
