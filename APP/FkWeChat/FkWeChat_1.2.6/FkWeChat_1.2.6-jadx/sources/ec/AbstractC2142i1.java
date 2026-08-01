package ec;

import com.alibaba.fastjson2.JSONWriter;
import p145jc.AbstractC3816l;
import p185m8.C5096o;
import p215oc.C5725t;

/* JADX INFO: renamed from: ec.i1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2142i1 extends AbstractC2149k0 {

    /* JADX INFO: renamed from: s */
    public long f5966s;

    /* JADX INFO: renamed from: t */
    public boolean f5967t;

    /* JADX INFO: renamed from: u */
    public C5096o f5968u;

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m7773E0(AbstractC2142i1 abstractC2142i1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: decrementUseCount");
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC2142i1.m7784q0(z10);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m7774P0(AbstractC2142i1 abstractC2142i1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: incrementUseCount");
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC2142i1.m7778O0(z10);
    }

    /* JADX INFO: renamed from: L0 */
    public final long m7775L0(boolean z10) {
        if (z10) {
            return JSONWriter.MASK_IGNORE_NON_FIELD_GETTER;
        }
        return 1L;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m7776M0(AbstractC2112b1 abstractC2112b1) {
        C5096o c5096o = this.f5968u;
        if (c5096o == null) {
            c5096o = new C5096o();
            this.f5968u = c5096o;
        }
        c5096o.addLast(abstractC2112b1);
    }

    /* JADX INFO: renamed from: N0 */
    public long mo7777N0() {
        C5096o c5096o = this.f5968u;
        return (c5096o == null || c5096o.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m7778O0(boolean z10) {
        this.f5966s += m7775L0(z10);
        if (z10) {
            return;
        }
        this.f5967t = true;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m7779Q0() {
        return this.f5966s >= m7775L0(true);
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m7780R0() {
        C5096o c5096o = this.f5968u;
        if (c5096o != null) {
            return c5096o.isEmpty();
        }
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public abstract long mo7781S0();

    /* JADX INFO: renamed from: T0 */
    public final boolean m7782T0() {
        AbstractC2112b1 abstractC2112b1;
        C5096o c5096o = this.f5968u;
        if (c5096o == null || (abstractC2112b1 = (AbstractC2112b1) c5096o.m20635x()) == null) {
            return false;
        }
        abstractC2112b1.run();
        return true;
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m7783U0() {
        return false;
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: b0 */
    public final AbstractC2149k0 mo7753b0(int i10, String str) {
        AbstractC3816l.m15199a(i10);
        return AbstractC3816l.m15200b(this, str);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m7784q0(boolean z10) {
        long jM7775L0 = this.f5966s - m7775L0(z10);
        this.f5966s = jM7775L0;
        if (jM7775L0 <= 0 && this.f5967t) {
            shutdown();
        }
    }

    public abstract void shutdown();
}
