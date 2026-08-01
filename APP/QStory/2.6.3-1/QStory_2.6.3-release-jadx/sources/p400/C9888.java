package p400;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9888 {
    public static final C9868 Companion = new C9868();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9894 f25696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9886 f25697;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9887 f25698;

    public /* synthetic */ C9888(int i, C9887 c9887, C9886 c9886, C9894 c9894) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C9867.f25669.getDescriptor());
            throw null;
        }
        this.f25698 = c9887;
        this.f25697 = c9886;
        if ((i & 4) == 0) {
            this.f25696 = null;
        } else {
            this.f25696 = c9894;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9888 m15172(C9888 c9888, C9894 c9894) {
        C9887 c9887 = c9888.f25698;
        C9886 c9886 = c9888.f25697;
        c9888.getClass();
        AbstractC9234.m14531(1415);
        c9887.getClass();
        AbstractC9234.m14531(1416);
        c9886.getClass();
        return new C9888(c9887, c9886, c9894);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9888)) {
            return false;
        }
        C9888 c9888 = (C9888) obj;
        return AbstractC5227.m9466(this.f25698, c9888.f25698) && AbstractC5227.m9466(this.f25697, c9888.f25697) && AbstractC5227.m9466(this.f25696, c9888.f25696);
    }

    public final int hashCode() {
        int iHashCode = (this.f25697.hashCode() + (this.f25698.hashCode() * 31)) * 31;
        C9894 c9894 = this.f25696;
        return iHashCode + (c9894 == null ? 0 : c9894.hashCode());
    }

    public final String toString() {
        return AbstractC9234.m14531(1465) + this.f25698 + AbstractC9234.m14531(1466) + this.f25697 + AbstractC9234.m14531(1467) + this.f25696 + ')';
    }

    public C9888(C9887 c9887, C9886 c9886, C9894 c9894) {
        AbstractC9234.m14531(1415);
        AbstractC9234.m14531(1416);
        this.f25698 = c9887;
        this.f25697 = c9886;
        this.f25696 = c9894;
    }
}
