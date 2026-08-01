package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.text.C0995;
import androidx.compose.runtime.internal.AbstractC1254;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1261 extends AbstractC1286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f3660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC1286 f3661;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC6557 f3662;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f3663;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f3664;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261(AbstractC1286 abstractC1286, InterfaceC6557 interfaceC6557, boolean z, boolean z2) {
        InterfaceC6557 interfaceC6557Mo2193;
        super(0L, C1287.f3763);
        C0995 c0995 = AbstractC1280.f3746;
        this.f3661 = abstractC1286;
        this.f3660 = z;
        this.f3663 = z2;
        this.f3662 = AbstractC1280.m2267(interfaceC6557, (abstractC1286 == null || (interfaceC6557Mo2193 = abstractC1286.mo2193()) == null) ? AbstractC1280.f3751.f3694 : interfaceC6557Mo2193, z);
        this.f3664 = AbstractC1254.m2181();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo2192() {
        return m2197().mo2192();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6557 mo2193() {
        return this.f3662;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1287 mo2194() {
        return m2197().mo2194();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo2195() {
        AbstractC1286 abstractC1286;
        this.f3760 = true;
        if (!this.f3663 || (abstractC1286 = this.f3661) == null) {
            return;
        }
        abstractC1286.mo2195();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC1286 mo2196(InterfaceC6557 interfaceC6557) {
        InterfaceC6557 interfaceC6557M2267 = AbstractC1280.m2267(interfaceC6557, this.f3662, true);
        return !this.f3660 ? AbstractC1280.m2266(m2197().mo2196(null), interfaceC6557M2267, true) : m2197().mo2196(interfaceC6557M2267);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC1286 m2197() {
        AbstractC1286 abstractC1286 = this.f3661;
        return abstractC1286 == null ? AbstractC1280.f3751 : abstractC1286;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo2198(InterfaceC1257 interfaceC1257) {
        m2197().mo2198(interfaceC1257);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo2199() {
        m2197().mo2199();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long mo2200() {
        return m2197().mo2200();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo2201() {
        AbstractC1274.m2226();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo2202() {
        AbstractC1274.m2226();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6557 mo2203() {
        return null;
    }
}
