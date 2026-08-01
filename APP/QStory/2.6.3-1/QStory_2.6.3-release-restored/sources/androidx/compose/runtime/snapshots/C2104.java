package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.text.C1833;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2104 extends AbstractC2121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC2121 f4034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7387 f4035;

    public C2104(long j, C2122 c2122, InterfaceC7387 interfaceC7387, AbstractC2121 abstractC2121) {
        super(j, c2122);
        this.f4035 = interfaceC7387;
        this.f4034 = abstractC2121;
        abstractC2121.mo2771();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo2762() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7387 mo2763() {
        return this.f4035;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2765() {
        AbstractC2121 abstractC2121 = this.f4034;
        if (this.f4106) {
            return;
        }
        if (this.f4107 != abstractC2121.mo2770()) {
            m2845();
        }
        abstractC2121.mo2772();
        this.f4106 = true;
        synchronized (AbstractC2115.f4090) {
            m2846();
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final AbstractC2121 mo2766(InterfaceC7387 interfaceC7387) {
        return new C2104(this.f4107, this.f4108, AbstractC2115.m2837(interfaceC7387, this.f4035, true), this.f4034);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2768(InterfaceC2092 interfaceC2092) {
        C1833 c1833 = AbstractC2115.f4092;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2771() {
        AbstractC2109.m2796();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2772() {
        AbstractC2109.m2796();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final InterfaceC7387 mo2773() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC2121
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2769() {
    }
}
