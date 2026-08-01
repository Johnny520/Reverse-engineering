package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1255;
import androidx.compose.runtime.snapshots.AbstractC1256;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1272;
import androidx.compose.runtime.snapshots.InterfaceC1283;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1347 extends AbstractC1256 implements InterfaceC1283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1353 f3912;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1348 f3913;

    public AbstractC1347(Object obj, C1353 c1353) {
        this.f3912 = c1353;
        AbstractC1286 abstractC1286M2270 = AbstractC1280.m2270();
        C1348 c1348 = new C1348(obj, abstractC1286M2270.mo2200());
        if (!(abstractC1286M2270 instanceof C1272)) {
            c1348.f3645 = new C1348(obj, 1L);
        }
        this.f3913 = c1348;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        return ((C1348) AbstractC1280.m2254(this.f3913, this)).f3914;
    }

    @Override // androidx.compose.runtime.InterfaceC1395
    public final void setValue(Object obj) {
        AbstractC1286 abstractC1286M2270;
        C1348 c1348 = (C1348) AbstractC1280.m2265(this.f3913);
        if (this.f3912.m2426(c1348.f3914, obj)) {
            return;
        }
        C1348 c13482 = this.f3913;
        synchronized (AbstractC1280.f3744) {
            abstractC1286M2270 = AbstractC1280.m2270();
            ((C1348) AbstractC1280.m2263(c13482, this, abstractC1286M2270, c1348)).f3914 = obj;
        }
        AbstractC1280.m2259(abstractC1286M2270, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((C1348) AbstractC1280.m2265(this.f3913)).f3914 + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C1353 mo2273() {
        return this.f3912;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2183() {
        return this.f3913;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2184(AbstractC1255 abstractC1255) {
        this.f3913 = (C1348) abstractC1255;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC1255 mo2190(AbstractC1255 abstractC1255, AbstractC1255 abstractC12552, AbstractC1255 abstractC12553) {
        if (this.f3912.m2426(((C1348) abstractC12552).f3914, ((C1348) abstractC12553).f3914)) {
            return abstractC12552;
        }
        return null;
    }
}
