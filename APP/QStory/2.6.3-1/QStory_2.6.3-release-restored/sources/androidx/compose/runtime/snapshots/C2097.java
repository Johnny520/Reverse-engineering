package androidx.compose.runtime.snapshots;

import androidx.collection.C1082;
import androidx.compose.foundation.text.C1833;
import androidx.compose.runtime.internal.AbstractC2089;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2097 extends C2106 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f4011;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC7387 f4012;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f4013;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC7387 f4014;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C2106 f4015;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f4016;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2097(C2106 c2106, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, boolean z, boolean z2) {
        InterfaceC7387 interfaceC7387Mo2773;
        InterfaceC7387 interfaceC7387Mo2763;
        C1833 c1833 = AbstractC2115.f4092;
        super(0L, C2122.f4109, AbstractC2115.m2837(interfaceC7387, (c2106 == null || (interfaceC7387Mo2763 = c2106.mo2763()) == null) ? AbstractC2115.f4097.f4040 : interfaceC7387Mo2763, z), AbstractC2115.m2838(interfaceC73872, (c2106 == null || (interfaceC7387Mo2773 = c2106.mo2773()) == null) ? AbstractC2115.f4097.f4039 : interfaceC7387Mo2773));
        this.f4015 = c2106;
        this.f4016 = z;
        this.f4013 = z2;
        this.f4014 = this.f4040;
        this.f4012 = this.f4039;
        this.f4011 = AbstractC2089.m2751();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2106 m2774() {
        C2106 c2106 = this.f4015;
        return c2106 == null ? AbstractC2115.f4097 : c2106;
    }

    @Override // androidx.compose.runtime.snapshots.C2106
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C2106 mo2775(InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        InterfaceC7387 interfaceC7387M2837 = AbstractC2115.m2837(interfaceC7387, this.f4014, true);
        InterfaceC7387 interfaceC7387M2838 = AbstractC2115.m2838(interfaceC73872, this.f4012);
        return !this.f4016 ? new C2097(m2774().mo2775(null, interfaceC7387M2838), interfaceC7387M2837, interfaceC7387M2838, false, true) : m2774().mo2775(interfaceC7387M2837, interfaceC7387M2838);
    }

    @Override // androidx.compose.runtime.snapshots.C2106
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo2776(C1082 c1082) {
        AbstractC2109.m2796();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C2106
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC7387 mo2763() {
        return this.f4014;
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo2762() {
        return m2774().mo2762();
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7387 mo2763() {
        return this.f4014;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C2122 mo2764() {
        return m2774().mo2764();
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2765() {
        C2106 c2106;
        this.f4106 = true;
        if (!this.f4013 || (c2106 = this.f4015) == null) {
            return;
        }
        c2106.mo2765();
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo2778(int i) {
        m2774().mo2778(i);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void mo2779(long j) {
        AbstractC2109.m2796();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C2106
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC2109 mo2780() {
        return m2774().mo2780();
    }

    @Override // androidx.compose.runtime.snapshots.C2106
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1082 mo2781() {
        return m2774().mo2781();
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final AbstractC2121 mo2766(InterfaceC7387 interfaceC7387) {
        InterfaceC7387 interfaceC7387M2837 = AbstractC2115.m2837(interfaceC7387, this.f4014, true);
        return !this.f4016 ? AbstractC2115.m2836(m2774().mo2766(null), interfaceC7387M2837, true) : m2774().mo2766(interfaceC7387M2837);
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2768(InterfaceC2092 interfaceC2092) {
        m2774().mo2768(interfaceC2092);
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2769() {
        m2774().mo2769();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo2782(C2122 c2122) {
        AbstractC2109.m2796();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int mo2783() {
        return m2774().mo2783();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final long mo2770() {
        return m2774().mo2770();
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2771() {
        AbstractC2109.m2796();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2772() {
        AbstractC2109.m2796();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C2106, androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC7387 mo2773() {
        return this.f4012;
    }
}
