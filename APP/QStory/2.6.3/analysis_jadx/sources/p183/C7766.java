package p183;

import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7766 extends AbstractC7763 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7765 f21062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f21063;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7765 f21064;

    public C7766(C7765 c7765, C7765 c77652, int i) {
        this.f21063 = i;
        this.f21064 = c77652;
        this.f21062 = c7765;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21062 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C7765 c7765 = this.f21062;
        C7765 c77652 = this.f21064;
        this.f21062 = (c7765 == c77652 || c77652 == null) ? null : m13118(c7765);
        return c7765;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7765 m13118(C7765 c7765) {
        switch (this.f21063) {
            case 0:
                return c7765.f21060;
            default:
                return c7765.f21058;
        }
    }

    @Override // p183.AbstractC7763
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo13117(C7765 c7765) {
        C7765 c77652;
        C7765 c7765M13118 = null;
        if (this.f21064 == c7765 && c7765 == this.f21062) {
            this.f21062 = null;
            this.f21064 = null;
        }
        C7765 c77653 = this.f21064;
        if (c77653 == c7765) {
            switch (this.f21063) {
                case 0:
                    c77652 = c77653.f21058;
                    break;
                default:
                    c77652 = c77653.f21060;
                    break;
            }
            this.f21064 = c77652;
        }
        C7765 c77654 = this.f21062;
        if (c77654 == c7765) {
            C7765 c77655 = this.f21064;
            if (c77654 != c77655 && c77655 != null) {
                c7765M13118 = m13118(c77654);
            }
            this.f21062 = c7765M13118;
        }
    }
}
