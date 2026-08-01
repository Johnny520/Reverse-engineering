package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC2090;
import androidx.compose.runtime.snapshots.AbstractC2091;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.InterfaceC2118;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2181 extends AbstractC2091 implements InterfaceC2233, InterfaceC2118 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2185 f4257;

    public final String toString() {
        return "MutableIntState(value=" + ((C2185) AbstractC2115.m2835(this.f4257)).f4262 + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2118
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C2188 mo2843() {
        return C2188.f4267;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC2090 mo2753() {
        return this.f4257;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2754(AbstractC2090 abstractC2090) {
        this.f4257 = (C2185) abstractC2090;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC2090 mo2760(AbstractC2090 abstractC2090, AbstractC2090 abstractC20902, AbstractC2090 abstractC20903) {
        if (((C2185) abstractC20902).f4262 == ((C2185) abstractC20903).f4262) {
            return abstractC20902;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m2992() {
        return ((C2185) AbstractC2115.m2824(this.f4257, this)).f4262;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2993(int i) {
        AbstractC2121 abstractC2121M2840;
        C2185 c2185 = (C2185) AbstractC2115.m2835(this.f4257);
        if (c2185.f4262 != i) {
            C2185 c21852 = this.f4257;
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                ((C2185) AbstractC2115.m2833(c21852, this, abstractC2121M2840, c2185)).f4262 = i;
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        }
    }
}
