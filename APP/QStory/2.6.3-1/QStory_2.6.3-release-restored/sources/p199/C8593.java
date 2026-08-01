package p199;

import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8593 extends AbstractC8592 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f21400 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8591 f21401;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8594 f21402;

    public C8593(C8591 c8591) {
        this.f21401 = c8591;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21400) {
            return this.f21401.f21399 != null;
        }
        C8594 c8594 = this.f21402;
        return (c8594 == null || c8594.f21405 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21400) {
            this.f21400 = false;
            this.f21402 = this.f21401.f21399;
        } else {
            C8594 c8594 = this.f21402;
            this.f21402 = c8594 != null ? c8594.f21405 : null;
        }
        return this.f21402;
    }

    @Override // p199.AbstractC8592
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo13676(C8594 c8594) {
        C8594 c85942 = this.f21402;
        if (c8594 == c85942) {
            C8594 c85943 = c85942.f21403;
            this.f21402 = c85943;
            this.f21400 = c85943 == null;
        }
    }
}
