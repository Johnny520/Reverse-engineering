package p183;

import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7763 extends AbstractC7762 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f21058 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7761 f21059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7764 f21060;

    public C7763(C7761 c7761) {
        this.f21059 = c7761;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21058) {
            return this.f21059.f21057 != null;
        }
        C7764 c7764 = this.f21060;
        return (c7764 == null || c7764.f21063 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21058) {
            this.f21058 = false;
            this.f21060 = this.f21059.f21057;
        } else {
            C7764 c7764 = this.f21060;
            this.f21060 = c7764 != null ? c7764.f21063 : null;
        }
        return this.f21060;
    }

    @Override // p183.AbstractC7762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo13089(C7764 c7764) {
        C7764 c77642 = this.f21060;
        if (c7764 == c77642) {
            C7764 c77643 = c77642.f21061;
            this.f21060 = c77643;
            this.f21058 = c77643 == null;
        }
    }
}
