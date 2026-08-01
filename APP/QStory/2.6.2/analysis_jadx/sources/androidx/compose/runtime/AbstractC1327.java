package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1255;
import androidx.compose.runtime.snapshots.AbstractC1256;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.InterfaceC1283;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1327 extends AbstractC1256 implements InterfaceC1283, InterfaceC1333, InterfaceC1395 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f3882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public AbstractC1255 f3883;

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        switch (this.f3882) {
            case 0:
                return Double.valueOf(((C1331) AbstractC1280.m2254((C1331) this.f3883, this)).f3893);
            default:
                return Long.valueOf(m2387());
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1395
    public final void setValue(Object obj) {
        AbstractC1286 abstractC1286M2270;
        switch (this.f3882) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                C1331 c1331 = (C1331) AbstractC1280.m2265((C1331) this.f3883);
                if (c1331.f3893 == dDoubleValue) {
                    return;
                }
                C1331 c13312 = (C1331) this.f3883;
                synchronized (AbstractC1280.f3744) {
                    abstractC1286M2270 = AbstractC1280.m2270();
                    ((C1331) AbstractC1280.m2263(c13312, this, abstractC1286M2270, c1331)).f3893 = dDoubleValue;
                }
                AbstractC1280.m2259(abstractC1286M2270, this);
                return;
            default:
                m2388(((Number) obj).longValue());
                return;
        }
    }

    public final String toString() {
        switch (this.f3882) {
            case 0:
                return "MutableDoubleState(value=" + ((C1331) AbstractC1280.m2265((C1331) this.f3883)).f3893 + ")@" + hashCode();
            default:
                return "MutableLongState(value=" + ((C1345) AbstractC1280.m2265((C1345) this.f3883)).f3910 + ")@" + hashCode();
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C1353 mo2273() {
        switch (this.f3882) {
        }
        return C1353.f3921;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2183() {
        switch (this.f3882) {
            case 0:
                return (C1331) this.f3883;
            default:
                return (C1345) this.f3883;
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2184(AbstractC1255 abstractC1255) {
        switch (this.f3882) {
            case 0:
                this.f3883 = (C1331) abstractC1255;
                break;
            default:
                this.f3883 = (C1345) abstractC1255;
                break;
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC1255 mo2190(AbstractC1255 abstractC1255, AbstractC1255 abstractC12552, AbstractC1255 abstractC12553) {
        switch (this.f3882) {
            case 0:
                if (((C1331) abstractC12552).f3893 != ((C1331) abstractC12553).f3893) {
                    break;
                }
                break;
            default:
                if (((C1345) abstractC12552).f3910 != ((C1345) abstractC12553).f3910) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long m2387() {
        return ((C1345) AbstractC1280.m2254((C1345) this.f3883, this)).f3910;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2388(long j) {
        AbstractC1286 abstractC1286M2270;
        C1345 c1345 = (C1345) AbstractC1280.m2265((C1345) this.f3883);
        if (c1345.f3910 != j) {
            C1345 c13452 = (C1345) this.f3883;
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                ((C1345) AbstractC1280.m2263(c13452, this, abstractC1286M2270, c1345)).f3910 = j;
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        }
    }
}
