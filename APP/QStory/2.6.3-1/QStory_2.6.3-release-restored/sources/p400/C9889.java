package p400;

import kotlin.jvm.internal.AbstractC5227;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9889 {
    public static final C9836 Companion = new C9836();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9837 f25699;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9890 f25700;

    public /* synthetic */ C9889(int i, C9890 c9890, C9837 c9837) {
        if ((i & 1) == 0) {
            this.f25700 = null;
        } else {
            this.f25700 = c9890;
        }
        if ((i & 2) == 0) {
            this.f25699 = null;
        } else {
            this.f25699 = c9837;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9889)) {
            return false;
        }
        C9889 c9889 = (C9889) obj;
        return AbstractC5227.m9466(this.f25700, c9889.f25700) && AbstractC5227.m9466(this.f25699, c9889.f25699);
    }

    public final int hashCode() {
        C9890 c9890 = this.f25700;
        int iHashCode = (c9890 == null ? 0 : c9890.f25701.hashCode()) * 31;
        C9837 c9837 = this.f25699;
        return iHashCode + (c9837 != null ? c9837.f25632.hashCode() : 0);
    }

    public final String toString() {
        return "MsgContent(textMsg=" + this.f25700 + ", msgSender=" + this.f25699 + ')';
    }
}
