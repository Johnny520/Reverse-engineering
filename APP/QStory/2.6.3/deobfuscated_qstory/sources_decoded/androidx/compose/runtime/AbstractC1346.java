package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1255;
import androidx.compose.runtime.snapshots.AbstractC1256;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.InterfaceC1283;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1346 extends AbstractC1256 implements InterfaceC1398, InterfaceC1283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1350 f3912;

    public final String toString() {
        return "MutableIntState(value=" + ((C1350) AbstractC1280.m2275(this.f3912)).f3917 + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C1353 mo2283() {
        return C1353.f3922;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2193() {
        return this.f3912;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2194(AbstractC1255 abstractC1255) {
        this.f3912 = (C1350) abstractC1255;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC1255 mo2200(AbstractC1255 abstractC1255, AbstractC1255 abstractC12552, AbstractC1255 abstractC12553) {
        if (((C1350) abstractC12552).f3917 == ((C1350) abstractC12553).f3917) {
            return abstractC12552;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int m2432() {
        return ((C1350) AbstractC1280.m2264(this.f3912, this)).f3917;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2433(int i) {
        AbstractC1286 abstractC1286M2280;
        C1350 c1350 = (C1350) AbstractC1280.m2275(this.f3912);
        if (c1350.f3917 != i) {
            C1350 c13502 = this.f3912;
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                ((C1350) AbstractC1280.m2273(c13502, this, abstractC1286M2280, c1350)).f3917 = i;
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        }
    }
}
