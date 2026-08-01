package p183;

import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7764 extends AbstractC7763 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f21055 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7762 f21056;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7765 f21057;

    public C7764(C7762 c7762) {
        this.f21056 = c7762;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21055) {
            return this.f21056.f21054 != null;
        }
        C7765 c7765 = this.f21057;
        return (c7765 == null || c7765.f21060 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21055) {
            this.f21055 = false;
            this.f21057 = this.f21056.f21054;
        } else {
            C7765 c7765 = this.f21057;
            this.f21057 = c7765 != null ? c7765.f21060 : null;
        }
        return this.f21057;
    }

    @Override // p183.AbstractC7763
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo13117(C7765 c7765) {
        C7765 c77652 = this.f21057;
        if (c7765 == c77652) {
            C7765 c77653 = c77652.f21058;
            this.f21057 = c77653;
            this.f21055 = c77653 == null;
        }
    }
}
