package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC2090;
import androidx.compose.runtime.snapshots.AbstractC2091;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.C2107;
import androidx.compose.runtime.snapshots.InterfaceC2118;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2182 extends AbstractC2091 implements InterfaceC2118 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2188 f4258;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C2183 f4259;

    public AbstractC2182(Object obj, C2188 c2188) {
        this.f4258 = c2188;
        AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
        C2183 c2183 = new C2183(obj, abstractC2121M2840.mo2770());
        if (!(abstractC2121M2840 instanceof C2107)) {
            c2183.f3991 = new C2183(obj, 1L);
        }
        this.f4259 = c2183;
    }

    @Override // androidx.compose.runtime.InterfaceC2168
    public final Object getValue() {
        return ((C2183) AbstractC2115.m2824(this.f4259, this)).f4260;
    }

    @Override // androidx.compose.runtime.InterfaceC2230
    public final void setValue(Object obj) {
        AbstractC2121 abstractC2121M2840;
        C2183 c2183 = (C2183) AbstractC2115.m2835(this.f4259);
        if (this.f4258.m2996(c2183.f4260, obj)) {
            return;
        }
        C2183 c21832 = this.f4259;
        synchronized (AbstractC2115.f4090) {
            abstractC2121M2840 = AbstractC2115.m2840();
            ((C2183) AbstractC2115.m2833(c21832, this, abstractC2121M2840, c2183)).f4260 = obj;
        }
        AbstractC2115.m2829(abstractC2121M2840, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((C2183) AbstractC2115.m2835(this.f4259)).f4260 + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2118
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C2188 mo2843() {
        return this.f4258;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC2090 mo2753() {
        return this.f4259;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2754(AbstractC2090 abstractC2090) {
        this.f4259 = (C2183) abstractC2090;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC2090 mo2760(AbstractC2090 abstractC2090, AbstractC2090 abstractC20902, AbstractC2090 abstractC20903) {
        if (this.f4258.m2996(((C2183) abstractC20902).f4260, ((C2183) abstractC20903).f4260)) {
            return abstractC20902;
        }
        return null;
    }
}
