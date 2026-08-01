package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1255;
import androidx.compose.runtime.snapshots.AbstractC1256;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.InterfaceC1283;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1349 extends AbstractC1256 implements InterfaceC1397, InterfaceC1283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1328 f3916;

    public final String toString() {
        return "MutableFloatState(value=" + ((C1328) AbstractC1280.m2275(this.f3916)).f3885 + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C1353 mo2283() {
        return C1353.f3922;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2193() {
        return this.f3916;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2194(AbstractC1255 abstractC1255) {
        this.f3916 = (C1328) abstractC1255;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC1255 mo2200(AbstractC1255 abstractC1255, AbstractC1255 abstractC12552, AbstractC1255 abstractC12553) {
        if (((C1328) abstractC12552).f3885 == ((C1328) abstractC12553).f3885) {
            return abstractC12552;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float m2434() {
        return ((C1328) AbstractC1280.m2264(this.f3916, this)).f3885;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2435(float f) {
        AbstractC1286 abstractC1286M2280;
        C1328 c1328 = (C1328) AbstractC1280.m2275(this.f3916);
        if (c1328.f3885 == f) {
            return;
        }
        C1328 c13282 = this.f3916;
        synchronized (AbstractC1280.f3745) {
            abstractC1286M2280 = AbstractC1280.m2280();
            ((C1328) AbstractC1280.m2273(c13282, this, abstractC1286M2280, c1328)).f3885 = f;
        }
        AbstractC1280.m2269(abstractC1286M2280, this);
    }
}
