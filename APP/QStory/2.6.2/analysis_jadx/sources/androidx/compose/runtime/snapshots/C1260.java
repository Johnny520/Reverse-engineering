package androidx.compose.runtime.snapshots;

import p124.AbstractC7414;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1260 extends AbstractC1255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f3657;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f3658;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC7414 f3659;

    public C1260(long j, AbstractC7414 abstractC7414) {
        super(j);
        this.f3659 = abstractC7414;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC1255 mo2186(long j) {
        return new C1260(j, this.f3659);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2187(AbstractC1255 abstractC1255) {
        synchronized (AbstractC1274.f3706) {
            abstractC1255.getClass();
            this.f3659 = ((C1260) abstractC1255).f3659;
            this.f3658 = ((C1260) abstractC1255).f3658;
            this.f3657 = ((C1260) abstractC1255).f3657;
        }
    }
}
