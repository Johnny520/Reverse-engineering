package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1255;
import androidx.compose.runtime.snapshots.AbstractC1256;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.InterfaceC1283;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1349 extends AbstractC1256 implements InterfaceC1397, InterfaceC1283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1328 f3915;

    public final String toString() {
        return "MutableFloatState(value=" + ((C1328) AbstractC1280.m2265(this.f3915)).f3884 + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C1353 mo2273() {
        return C1353.f3921;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2183() {
        return this.f3915;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2184(AbstractC1255 abstractC1255) {
        this.f3915 = (C1328) abstractC1255;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC1255 mo2190(AbstractC1255 abstractC1255, AbstractC1255 abstractC12552, AbstractC1255 abstractC12553) {
        if (((C1328) abstractC12552).f3884 == ((C1328) abstractC12553).f3884) {
            return abstractC12552;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float m2424() {
        return ((C1328) AbstractC1280.m2254(this.f3915, this)).f3884;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2425(float f) {
        AbstractC1286 abstractC1286M2270;
        C1328 c1328 = (C1328) AbstractC1280.m2265(this.f3915);
        if (c1328.f3884 == f) {
            return;
        }
        C1328 c13282 = this.f3915;
        synchronized (AbstractC1280.f3744) {
            abstractC1286M2270 = AbstractC1280.m2270();
            ((C1328) AbstractC1280.m2263(c13282, this, abstractC1286M2270, c1328)).f3884 = f;
        }
        AbstractC1280.m2259(abstractC1286M2270, this);
    }
}
