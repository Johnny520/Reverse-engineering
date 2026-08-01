package androidx.compose.runtime.snapshots;

import androidx.collection.C0235;
import androidx.compose.foundation.text.C0995;
import androidx.compose.runtime.internal.AbstractC1254;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1262 extends C1271 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f3666;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC6558 f3667;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f3668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC6558 f3669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C1271 f3670;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f3671;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1262(C1271 c1271, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, boolean z, boolean z2) {
        InterfaceC6558 interfaceC6558Mo2213;
        InterfaceC6558 interfaceC6558Mo2203;
        C0995 c0995 = AbstractC1280.f3747;
        super(0L, C1287.f3764, AbstractC1280.m2277(interfaceC6558, (c1271 == null || (interfaceC6558Mo2203 = c1271.mo2203()) == null) ? AbstractC1280.f3752.f3695 : interfaceC6558Mo2203, z), AbstractC1280.m2278(interfaceC65582, (c1271 == null || (interfaceC6558Mo2213 = c1271.mo2213()) == null) ? AbstractC1280.f3752.f3694 : interfaceC6558Mo2213));
        this.f3670 = c1271;
        this.f3671 = z;
        this.f3668 = z2;
        this.f3669 = this.f3695;
        this.f3667 = this.f3694;
        this.f3666 = AbstractC1254.m2191();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C1271 m2214() {
        C1271 c1271 = this.f3670;
        return c1271 == null ? AbstractC1280.f3752 : c1271;
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C1271 mo2215(InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        InterfaceC6558 interfaceC6558M2277 = AbstractC1280.m2277(interfaceC6558, this.f3669, true);
        InterfaceC6558 interfaceC6558M2278 = AbstractC1280.m2278(interfaceC65582, this.f3667);
        return !this.f3671 ? new C1262(m2214().mo2215(null, interfaceC6558M2278), interfaceC6558M2277, interfaceC6558M2278, false, true) : m2214().mo2215(interfaceC6558M2277, interfaceC6558M2278);
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo2216(C0235 c0235) {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC6558 mo2203() {
        return this.f3669;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo2202() {
        return m2214().mo2202();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6558 mo2203() {
        return this.f3669;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C1287 mo2204() {
        return m2214().mo2204();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2205() {
        C1271 c1271;
        this.f3761 = true;
        if (!this.f3668 || (c1271 = this.f3670) == null) {
            return;
        }
        c1271.mo2205();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo2218(int i) {
        m2214().mo2218(i);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void mo2219(long j) {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC1274 mo2220() {
        return m2214().mo2220();
    }

    @Override // androidx.compose.runtime.snapshots.C1271
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0235 mo2221() {
        return m2214().mo2221();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final AbstractC1286 mo2206(InterfaceC6558 interfaceC6558) {
        InterfaceC6558 interfaceC6558M2277 = AbstractC1280.m2277(interfaceC6558, this.f3669, true);
        return !this.f3671 ? AbstractC1280.m2276(m2214().mo2206(null), interfaceC6558M2277, true) : m2214().mo2206(interfaceC6558M2277);
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2208(InterfaceC1257 interfaceC1257) {
        m2214().mo2208(interfaceC1257);
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2209() {
        m2214().mo2209();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo2222(C1287 c1287) {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int mo2223() {
        return m2214().mo2223();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final long mo2210() {
        return m2214().mo2210();
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2211() {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2212() {
        AbstractC1274.m2236();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C1271, androidx.compose.runtime.snapshots.AbstractC1286
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC6558 mo2213() {
        return this.f3667;
    }
}
