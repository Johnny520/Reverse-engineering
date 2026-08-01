package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1255;
import androidx.compose.runtime.snapshots.AbstractC1256;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.InterfaceC1283;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1327 extends AbstractC1256 implements InterfaceC1283, InterfaceC1333, InterfaceC1395 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f3883;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public AbstractC1255 f3884;

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        switch (this.f3883) {
            case 0:
                return Double.valueOf(((C1331) AbstractC1280.m2264((C1331) this.f3884, this)).f3894);
            default:
                return Long.valueOf(m2397());
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1395
    public final void setValue(Object obj) {
        AbstractC1286 abstractC1286M2280;
        switch (this.f3883) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                C1331 c1331 = (C1331) AbstractC1280.m2275((C1331) this.f3884);
                if (c1331.f3894 == dDoubleValue) {
                    return;
                }
                C1331 c13312 = (C1331) this.f3884;
                synchronized (AbstractC1280.f3745) {
                    abstractC1286M2280 = AbstractC1280.m2280();
                    ((C1331) AbstractC1280.m2273(c13312, this, abstractC1286M2280, c1331)).f3894 = dDoubleValue;
                }
                AbstractC1280.m2269(abstractC1286M2280, this);
                return;
            default:
                m2398(((Number) obj).longValue());
                return;
        }
    }

    public final String toString() {
        switch (this.f3883) {
            case 0:
                return "MutableDoubleState(value=" + ((C1331) AbstractC1280.m2275((C1331) this.f3884)).f3894 + ")@" + hashCode();
            default:
                return "MutableLongState(value=" + ((C1345) AbstractC1280.m2275((C1345) this.f3884)).f3911 + ")@" + hashCode();
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C1353 mo2283() {
        switch (this.f3883) {
        }
        return C1353.f3922;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2193() {
        switch (this.f3883) {
            case 0:
                return (C1331) this.f3884;
            default:
                return (C1345) this.f3884;
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2194(AbstractC1255 abstractC1255) {
        switch (this.f3883) {
            case 0:
                this.f3884 = (C1331) abstractC1255;
                break;
            default:
                this.f3884 = (C1345) abstractC1255;
                break;
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC1255 mo2200(AbstractC1255 abstractC1255, AbstractC1255 abstractC12552, AbstractC1255 abstractC12553) {
        switch (this.f3883) {
            case 0:
                if (((C1331) abstractC12552).f3894 != ((C1331) abstractC12553).f3894) {
                    break;
                }
                break;
            default:
                if (((C1345) abstractC12552).f3911 != ((C1345) abstractC12553).f3911) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long m2397() {
        return ((C1345) AbstractC1280.m2264((C1345) this.f3884, this)).f3911;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2398(long j) {
        AbstractC1286 abstractC1286M2280;
        C1345 c1345 = (C1345) AbstractC1280.m2275((C1345) this.f3884);
        if (c1345.f3911 != j) {
            C1345 c13452 = (C1345) this.f3884;
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                ((C1345) AbstractC1280.m2273(c13452, this, abstractC1286M2280, c1345)).f3911 = j;
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        }
    }
}
