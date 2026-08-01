package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC2090;
import androidx.compose.runtime.snapshots.AbstractC2091;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.InterfaceC2118;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2184 extends AbstractC2091 implements InterfaceC2232, InterfaceC2118 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2163 f4261;

    public final String toString() {
        return "MutableFloatState(value=" + ((C2163) AbstractC2115.m2835(this.f4261)).f4230 + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2118
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C2188 mo2843() {
        return C2188.f4267;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC2090 mo2753() {
        return this.f4261;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2754(AbstractC2090 abstractC2090) {
        this.f4261 = (C2163) abstractC2090;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC2090 mo2760(AbstractC2090 abstractC2090, AbstractC2090 abstractC20902, AbstractC2090 abstractC20903) {
        if (((C2163) abstractC20902).f4230 == ((C2163) abstractC20903).f4230) {
            return abstractC20902;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float m2994() {
        return ((C2163) AbstractC2115.m2824(this.f4261, this)).f4230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2995(float f) {
        AbstractC2121 abstractC2121M2840;
        C2163 c2163 = (C2163) AbstractC2115.m2835(this.f4261);
        if (c2163.f4230 == f) {
            return;
        }
        C2163 c21632 = this.f4261;
        synchronized (AbstractC2115.f4090) {
            abstractC2121M2840 = AbstractC2115.m2840();
            ((C2163) AbstractC2115.m2833(c21632, this, abstractC2121M2840, c2163)).f4230 = f;
        }
        AbstractC2115.m2829(abstractC2121M2840, this);
    }
}
