package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.text.C0995;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1269 extends AbstractC1286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC1286 f3689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6558 f3690;

    public C1269(long j, C1287 c1287, InterfaceC6558 interfaceC6558, AbstractC1286 abstractC1286) {
        super(j, c1287);
        this.f3690 = interfaceC6558;
        this.f3689 = abstractC1286;
        abstractC1286.mo2211();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo2202() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6558 mo2203() {
        return this.f3690;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2205() {
        AbstractC1286 abstractC1286 = this.f3689;
        if (this.f3761) {
            return;
        }
        if (this.f3762 != abstractC1286.mo2210()) {
            m2285();
        }
        abstractC1286.mo2212();
        this.f3761 = true;
        synchronized (AbstractC1280.f3745) {
            m2286();
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final AbstractC1286 mo2206(InterfaceC6558 interfaceC6558) {
        return new C1269(this.f3762, this.f3763, AbstractC1280.m2277(interfaceC6558, this.f3690, true), this.f3689);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2208(InterfaceC1257 interfaceC1257) {
        C0995 c0995 = AbstractC1280.f3747;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2211() {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2212() {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC6558 mo2213() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2209() {
    }
}
