package androidx.compose.runtime;

import android.os.Trace;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1133;
import androidx.collection.C1082;
import androidx.collection.C1084;
import androidx.compose.p001ui.node.C2613;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2086;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2226 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2613 f4385;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f4386;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7383 f4387;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2159 f4388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2207 f4389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2198 f4390;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f4392;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C2086 f4393;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2175 f4394;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC1133 f4396;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AtomicReference f4391 = new AtomicReference(PausedCompositionState.InitialPending);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f4395 = AbstractC2089.m2751();

    public C2226(C2198 c2198, AbstractC2207 abstractC2207, C2159 c2159, C1084 c1084, InterfaceC7383 interfaceC7383, boolean z, C2613 c2613, Object obj) {
        this.f4390 = c2198;
        this.f4389 = abstractC2207;
        this.f4388 = c2159;
        this.f4387 = interfaceC7383;
        this.f4386 = z;
        this.f4385 = c2613;
        this.f4392 = obj;
        C1082 c1082 = AbstractC1132.f1342;
        c1082.getClass();
        this.f4396 = c1082;
        C2086 c2086 = new C2086();
        c2086.m2743(c1084, c2159.m2912());
        this.f4393 = c2086;
        this.f4394 = new C2175(c2613.f5559);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m3092(InterfaceC2177 interfaceC2177) throws Exception {
        AtomicReference atomicReference = this.f4391;
        try {
            int i = AbstractC2210.f4325[((PausedCompositionState) atomicReference.get()).ordinal()];
            C2198 c2198 = this.f4390;
            AbstractC2207 abstractC2207 = this.f4389;
            switch (i) {
                case 1:
                    C2159 c2159 = this.f4388;
                    boolean z = this.f4386;
                    if (z) {
                        c2159.f4194 = 0;
                        c2159.f4195 = true;
                    }
                    try {
                        this.f4396 = abstractC2207.mo2876(c2198, interfaceC2177, this.f4387);
                        PausedCompositionState pausedCompositionState = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                                if (atomicReference.get() != pausedCompositionState) {
                                    AbstractC2227.m3097("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                                }
                            }
                        }
                        if (this.f4396.m1433()) {
                            m3093();
                        }
                        return m3094();
                    } finally {
                        if (z) {
                            c2159.m2927();
                        }
                    }
                case 2:
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(pausedCompositionState3, pausedCompositionState4)) {
                            if (atomicReference.get() != pausedCompositionState3) {
                                AbstractC2227.m3097("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                            }
                        }
                    }
                    long j = this.f4395;
                    try {
                        this.f4395 = AbstractC2089.m2751();
                        this.f4396 = abstractC2207.mo2883(c2198, interfaceC2177, this.f4396);
                        this.f4395 = j;
                        PausedCompositionState pausedCompositionState5 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState6 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState5, pausedCompositionState6)) {
                                if (atomicReference.get() != pausedCompositionState5) {
                                    AbstractC2227.m3097("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                                }
                            }
                        }
                        if (this.f4396.m1433()) {
                            m3093();
                        }
                        return m3094();
                    } catch (Throwable th) {
                        this.f4395 = j;
                        PausedCompositionState pausedCompositionState7 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState8 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState7, pausedCompositionState8)) {
                                if (atomicReference.get() != pausedCompositionState7) {
                                    AbstractC2227.m3097("Unexpected state change from: " + pausedCompositionState7 + " to: " + pausedCompositionState8 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                                }
                            }
                        }
                        throw th;
                    }
                case 3:
                    AbstractC2209.m3066("Recursive call to resume()");
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
    public final void m3093() {
        boolean z;
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        while (true) {
            AtomicReference atomicReference = this.f4391;
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
        AbstractC2227.m3097("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m3094() {
        return ((PausedCompositionState) this.f4391.get()).compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3095() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f4392) {
                try {
                    this.f4394.m2989(this.f4385, this.f4393);
                    this.f4393.m2740();
                    this.f4393.m2739();
                } finally {
                    this.f4393.m2741();
                    this.f4390.f4301 = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3096() throws Exception {
        AtomicReference atomicReference = this.f4391;
        try {
            switch (AbstractC2210.f4325[((PausedCompositionState) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    m3095();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.Applied;
                    while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                        if (atomicReference.get() != pausedCompositionState) {
                            AbstractC2227.m3097("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
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
