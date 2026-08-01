package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC2090;
import androidx.compose.runtime.snapshots.AbstractC2091;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.InterfaceC2118;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2162 extends AbstractC2091 implements InterfaceC2118, InterfaceC2168, InterfaceC2230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f4228;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public AbstractC2090 f4229;

    @Override // androidx.compose.runtime.InterfaceC2168
    public final Object getValue() {
        switch (this.f4228) {
            case 0:
                return Double.valueOf(((C2166) AbstractC2115.m2824((C2166) this.f4229, this)).f4239);
            default:
                return Long.valueOf(m2957());
        }
    }

    @Override // androidx.compose.runtime.InterfaceC2230
    public final void setValue(Object obj) {
        AbstractC2121 abstractC2121M2840;
        switch (this.f4228) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                C2166 c2166 = (C2166) AbstractC2115.m2835((C2166) this.f4229);
                if (c2166.f4239 == dDoubleValue) {
                    return;
                }
                C2166 c21662 = (C2166) this.f4229;
                synchronized (AbstractC2115.f4090) {
                    abstractC2121M2840 = AbstractC2115.m2840();
                    ((C2166) AbstractC2115.m2833(c21662, this, abstractC2121M2840, c2166)).f4239 = dDoubleValue;
                }
                AbstractC2115.m2829(abstractC2121M2840, this);
                return;
            default:
                m2958(((Number) obj).longValue());
                return;
        }
    }

    public final String toString() {
        switch (this.f4228) {
            case 0:
                return "MutableDoubleState(value=" + ((C2166) AbstractC2115.m2835((C2166) this.f4229)).f4239 + ")@" + hashCode();
            default:
                return "MutableLongState(value=" + ((C2180) AbstractC2115.m2835((C2180) this.f4229)).f4256 + ")@" + hashCode();
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2118
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C2188 mo2843() {
        switch (this.f4228) {
        }
        return C2188.f4267;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC2090 mo2753() {
        switch (this.f4228) {
            case 0:
                return (C2166) this.f4229;
            default:
                return (C2180) this.f4229;
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2754(AbstractC2090 abstractC2090) {
        switch (this.f4228) {
            case 0:
                this.f4229 = (C2166) abstractC2090;
                break;
            default:
                this.f4229 = (C2180) abstractC2090;
                break;
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC2090 mo2760(AbstractC2090 abstractC2090, AbstractC2090 abstractC20902, AbstractC2090 abstractC20903) {
        switch (this.f4228) {
            case 0:
                if (((C2166) abstractC20902).f4239 != ((C2166) abstractC20903).f4239) {
                    break;
                }
                break;
            default:
                if (((C2180) abstractC20902).f4256 != ((C2180) abstractC20903).f4256) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long m2957() {
        return ((C2180) AbstractC2115.m2824((C2180) this.f4229, this)).f4256;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2958(long j) {
        AbstractC2121 abstractC2121M2840;
        C2180 c2180 = (C2180) AbstractC2115.m2835((C2180) this.f4229);
        if (c2180.f4256 != j) {
            C2180 c21802 = (C2180) this.f4229;
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                ((C2180) AbstractC2115.m2833(c21802, this, abstractC2121M2840, c2180)).f4256 = j;
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        }
    }
}
