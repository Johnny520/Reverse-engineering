package androidx.compose.runtime.snapshots;

import androidx.collection.C0235;
import androidx.compose.foundation.text.C0995;
import androidx.compose.runtime.internal.AbstractC1254;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1262 extends C1271 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f3665;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC6557 f3666;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f3667;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC6557 f3668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C1271 f3669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f3670;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1262(C1271 c1271, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, boolean z, boolean z2) {
        InterfaceC6557 interfaceC6557Mo2203;
        InterfaceC6557 interfaceC6557Mo2193;
        C0995 c0995 = AbstractC1280.f3746;
        super(0L, C1287.f3763, AbstractC1280.m2267(interfaceC6557, (c1271 == null || (interfaceC6557Mo2193 = c1271.mo2193()) == null) ? AbstractC1280.f3751.f3694 : interfaceC6557Mo2193, z), AbstractC1280.m2268(interfaceC65572, (c1271 == null || (interfaceC6557Mo2203 = c1271.mo2203()) == null) ? AbstractC1280.f3751.f3693 : interfaceC6557Mo2203));
        this.f3669 = c1271;
        this.f3670 = z;
        this.f3667 = z2;
        this.f3668 = this.f3694;
        this.f3666 = this.f3693;
        this.f3665 = AbstractC1254.m2181();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C1271 m2204() {
        C1271 c1271 = this.f3669;
        return c1271 == null ? AbstractC1280.f3751 : c1271;
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C1271 mo2205(InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        InterfaceC6557 interfaceC6557M2267 = AbstractC1280.m2267(interfaceC6557, this.f3668, true);
        InterfaceC6557 interfaceC6557M2268 = AbstractC1280.m2268(interfaceC65572, this.f3666);
        return !this.f3670 ? new C1262(m2204().mo2205(null, interfaceC6557M2268), interfaceC6557M2267, interfaceC6557M2268, false, true) : m2204().mo2205(interfaceC6557M2267, interfaceC6557M2268);
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo2206(C0235 c0235) {
        AbstractC1274.m2226();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC6557 mo2193() {
        return this.f3668;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo2192() {
        return m2204().mo2192();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6557 mo2193() {
        return this.f3668;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C1287 mo2194() {
        return m2204().mo2194();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2195() {
        C1271 c1271;
        this.f3760 = true;
        if (!this.f3667 || (c1271 = this.f3669) == null) {
            return;
        }
        c1271.mo2195();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo2208(int i) {
        m2204().mo2208(i);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void mo2209(long j) {
        AbstractC1274.m2226();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC1274 mo2210() {
        return m2204().mo2210();
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0235 mo2211() {
        return m2204().mo2211();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final AbstractC1286 mo2196(InterfaceC6557 interfaceC6557) {
        InterfaceC6557 interfaceC6557M2267 = AbstractC1280.m2267(interfaceC6557, this.f3668, true);
        return !this.f3670 ? AbstractC1280.m2266(m2204().mo2196(null), interfaceC6557M2267, true) : m2204().mo2196(interfaceC6557M2267);
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2198(InterfaceC1257 interfaceC1257) {
        m2204().mo2198(interfaceC1257);
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2199() {
        m2204().mo2199();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo2212(C1287 c1287) {
        AbstractC1274.m2226();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int mo2213() {
        return m2204().mo2213();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final long mo2200() {
        return m2204().mo2200();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2201() {
        AbstractC1274.m2226();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2202() {
        AbstractC1274.m2226();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC6557 mo2203() {
        return this.f3666;
    }
}
