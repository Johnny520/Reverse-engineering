package p199;

import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8595 extends AbstractC8592 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8594 f21407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f21408;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8594 f21409;

    public C8595(C8594 c8594, C8594 c85942, int i) {
        this.f21408 = i;
        this.f21409 = c85942;
        this.f21407 = c8594;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21407 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C8594 c8594 = this.f21407;
        C8594 c85942 = this.f21409;
        this.f21407 = (c8594 == c85942 || c85942 == null) ? null : m13677(c8594);
        return c8594;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8594 m13677(C8594 c8594) {
        switch (this.f21408) {
            case 0:
                return c8594.f21405;
            default:
                return c8594.f21403;
        }
    }

    @Override // p199.AbstractC8592
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo13676(C8594 c8594) {
        C8594 c85942;
        C8594 c8594M13677 = null;
        if (this.f21409 == c8594 && c8594 == this.f21407) {
            this.f21407 = null;
            this.f21409 = null;
        }
        C8594 c85943 = this.f21409;
        if (c85943 == c8594) {
            switch (this.f21408) {
                case 0:
                    c85942 = c85943.f21403;
                    break;
                default:
                    c85942 = c85943.f21405;
                    break;
            }
            this.f21409 = c85942;
        }
        C8594 c85944 = this.f21407;
        if (c85944 == c8594) {
            C8594 c85945 = this.f21409;
            if (c85944 != c85945 && c85945 != null) {
                c8594M13677 = m13677(c85944);
            }
            this.f21407 = c8594M13677;
        }
    }
}
