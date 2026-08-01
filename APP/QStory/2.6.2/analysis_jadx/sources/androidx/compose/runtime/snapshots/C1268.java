package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.text.C0995;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1268 extends AbstractC1286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f3686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6557 f3687;

    public C1268(long j, C1287 c1287, InterfaceC6557 interfaceC6557) {
        super(j, c1287);
        this.f3687 = interfaceC6557;
        this.f3686 = 1;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo2192() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6557 mo2193() {
        return this.f3687;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2195() {
        if (this.f3760) {
            return;
        }
        mo2202();
        this.f3760 = true;
        synchronized (AbstractC1280.f3744) {
            m2276();
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final AbstractC1286 mo2196(InterfaceC6557 interfaceC6557) {
        AbstractC1280.m2251(this);
        return new C1269(this.f3761, this.f3762, AbstractC1280.m2267(interfaceC6557, this.f3687, true), this);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2198(InterfaceC1257 interfaceC1257) {
        C0995 c0995 = AbstractC1280.f3746;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2201() {
        this.f3686++;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2202() {
        int i = this.f3686 - 1;
        this.f3686 = i;
        if (i == 0) {
            m2275();
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC6557 mo2203() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2199() {
    }
}
