package p183;

import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7765 extends AbstractC7762 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7764 f21065;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f21066;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7764 f21067;

    public C7765(C7764 c7764, C7764 c77642, int i) {
        this.f21066 = i;
        this.f21067 = c77642;
        this.f21065 = c7764;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21065 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C7764 c7764 = this.f21065;
        C7764 c77642 = this.f21067;
        this.f21065 = (c7764 == c77642 || c77642 == null) ? null : m13090(c7764);
        return c7764;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7764 m13090(C7764 c7764) {
        switch (this.f21066) {
            case 0:
                return c7764.f21063;
            default:
                return c7764.f21061;
        }
    }

    @Override // p183.AbstractC7762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo13089(C7764 c7764) {
        C7764 c77642;
        C7764 c7764M13090 = null;
        if (this.f21067 == c7764 && c7764 == this.f21065) {
            this.f21065 = null;
            this.f21067 = null;
        }
        C7764 c77643 = this.f21067;
        if (c77643 == c7764) {
            switch (this.f21066) {
                case 0:
                    c77642 = c77643.f21061;
                    break;
                default:
                    c77642 = c77643.f21063;
                    break;
            }
            this.f21067 = c77642;
        }
        C7764 c77644 = this.f21065;
        if (c77644 == c7764) {
            C7764 c77645 = this.f21067;
            if (c77644 != c77645 && c77645 != null) {
                c7764M13090 = m13090(c77644);
            }
            this.f21065 = c7764M13090;
        }
    }
}
