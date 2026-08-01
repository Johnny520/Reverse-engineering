package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.text.C1833;
import androidx.compose.runtime.internal.AbstractC2089;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2096 extends AbstractC2121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f4006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2121 f4007;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC7387 f4008;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f4009;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f4010;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2096(AbstractC2121 abstractC2121, InterfaceC7387 interfaceC7387, boolean z, boolean z2) {
        InterfaceC7387 interfaceC7387Mo2763;
        super(0L, C2122.f4109);
        C1833 c1833 = AbstractC2115.f4092;
        this.f4007 = abstractC2121;
        this.f4006 = z;
        this.f4009 = z2;
        this.f4008 = AbstractC2115.m2837(interfaceC7387, (abstractC2121 == null || (interfaceC7387Mo2763 = abstractC2121.mo2763()) == null) ? AbstractC2115.f4097.f4040 : interfaceC7387Mo2763, z);
        this.f4010 = AbstractC2089.m2751();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo2762() {
        return m2767().mo2762();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7387 mo2763() {
        return this.f4008;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2122 mo2764() {
        return m2767().mo2764();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo2765() {
        AbstractC2121 abstractC2121;
        this.f4106 = true;
        if (!this.f4009 || (abstractC2121 = this.f4007) == null) {
            return;
        }
        abstractC2121.mo2765();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC2121 mo2766(InterfaceC7387 interfaceC7387) {
        InterfaceC7387 interfaceC7387M2837 = AbstractC2115.m2837(interfaceC7387, this.f4008, true);
        return !this.f4006 ? AbstractC2115.m2836(m2767().mo2766(null), interfaceC7387M2837, true) : m2767().mo2766(interfaceC7387M2837);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC2121 m2767() {
        AbstractC2121 abstractC2121 = this.f4007;
        return abstractC2121 == null ? AbstractC2115.f4097 : abstractC2121;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo2768(InterfaceC2092 interfaceC2092) {
        m2767().mo2768(interfaceC2092);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo2769() {
        m2767().mo2769();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long mo2770() {
        return m2767().mo2770();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo2771() {
        AbstractC2109.m2796();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo2772() {
        AbstractC2109.m2796();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC7387 mo2773() {
        return null;
    }
}
