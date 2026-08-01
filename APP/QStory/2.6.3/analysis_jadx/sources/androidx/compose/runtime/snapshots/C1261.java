package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.text.C0995;
import androidx.compose.runtime.internal.AbstractC1254;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1261 extends AbstractC1286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f3661;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC1286 f3662;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC6558 f3663;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f3664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f3665;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261(AbstractC1286 abstractC1286, InterfaceC6558 interfaceC6558, boolean z, boolean z2) {
        InterfaceC6558 interfaceC6558Mo2203;
        super(0L, C1287.f3764);
        C0995 c0995 = AbstractC1280.f3747;
        this.f3662 = abstractC1286;
        this.f3661 = z;
        this.f3664 = z2;
        this.f3663 = AbstractC1280.m2277(interfaceC6558, (abstractC1286 == null || (interfaceC6558Mo2203 = abstractC1286.mo2203()) == null) ? AbstractC1280.f3752.f3695 : interfaceC6558Mo2203, z);
        this.f3665 = AbstractC1254.m2191();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo2202() {
        return m2207().mo2202();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6558 mo2203() {
        return this.f3663;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1287 mo2204() {
        return m2207().mo2204();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo2205() {
        AbstractC1286 abstractC1286;
        this.f3761 = true;
        if (!this.f3664 || (abstractC1286 = this.f3662) == null) {
            return;
        }
        abstractC1286.mo2205();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC1286 mo2206(InterfaceC6558 interfaceC6558) {
        InterfaceC6558 interfaceC6558M2277 = AbstractC1280.m2277(interfaceC6558, this.f3663, true);
        return !this.f3661 ? AbstractC1280.m2276(m2207().mo2206(null), interfaceC6558M2277, true) : m2207().mo2206(interfaceC6558M2277);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC1286 m2207() {
        AbstractC1286 abstractC1286 = this.f3662;
        return abstractC1286 == null ? AbstractC1280.f3752 : abstractC1286;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo2208(InterfaceC1257 interfaceC1257) {
        m2207().mo2208(interfaceC1257);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo2209() {
        m2207().mo2209();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long mo2210() {
        return m2207().mo2210();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo2211() {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo2212() {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6558 mo2213() {
        return null;
    }
}
