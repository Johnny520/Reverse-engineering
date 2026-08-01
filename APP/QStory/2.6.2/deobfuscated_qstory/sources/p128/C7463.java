package p128;

import android.view.ViewGroup;
import kotlin.reflect.jvm.internal.AbstractC5061;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7463 extends AbstractC7474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ViewGroup f20202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f20203 = false;

    public C7463(ViewGroup viewGroup) {
        this.f20202 = viewGroup;
    }

    @Override // p128.AbstractC7474, p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo12638() {
        AbstractC5061.m10017(this.f20202, true);
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo12639(AbstractC7482 abstractC7482) {
        if (!this.f20203) {
            AbstractC5061.m10017(this.f20202, false);
        }
        abstractC7482.mo12648(this);
    }

    @Override // p128.AbstractC7474, p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo12640(AbstractC7482 abstractC7482) {
        AbstractC5061.m10017(this.f20202, false);
        this.f20203 = true;
    }

    @Override // p128.AbstractC7474, p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo12641() {
        AbstractC5061.m10017(this.f20202, false);
    }
}
