package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1255;
import androidx.compose.runtime.snapshots.AbstractC1256;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1272;
import androidx.compose.runtime.snapshots.InterfaceC1283;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1347 extends AbstractC1256 implements InterfaceC1283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1353 f3913;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1348 f3914;

    public AbstractC1347(Object obj, C1353 c1353) {
        this.f3913 = c1353;
        AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
        C1348 c1348 = new C1348(obj, abstractC1286M2280.mo2210());
        if (!(abstractC1286M2280 instanceof C1272)) {
            c1348.f3646 = new C1348(obj, 1L);
        }
        this.f3914 = c1348;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        return ((C1348) AbstractC1280.m2264(this.f3914, this)).f3915;
    }

    @Override // androidx.compose.runtime.InterfaceC1395
    public final void setValue(Object obj) {
        AbstractC1286 abstractC1286M2280;
        C1348 c1348 = (C1348) AbstractC1280.m2275(this.f3914);
        if (this.f3913.m2436(c1348.f3915, obj)) {
            return;
        }
        C1348 c13482 = this.f3914;
        synchronized (AbstractC1280.f3745) {
            abstractC1286M2280 = AbstractC1280.m2280();
            ((C1348) AbstractC1280.m2273(c13482, this, abstractC1286M2280, c1348)).f3915 = obj;
        }
        AbstractC1280.m2269(abstractC1286M2280, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((C1348) AbstractC1280.m2275(this.f3914)).f3915 + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C1353 mo2283() {
        return this.f3913;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2193() {
        return this.f3914;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2194(AbstractC1255 abstractC1255) {
        this.f3914 = (C1348) abstractC1255;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC1255 mo2200(AbstractC1255 abstractC1255, AbstractC1255 abstractC12552, AbstractC1255 abstractC12553) {
        if (this.f3913.m2436(((C1348) abstractC12552).f3915, ((C1348) abstractC12553).f3915)) {
            return abstractC12552;
        }
        return null;
    }
}
