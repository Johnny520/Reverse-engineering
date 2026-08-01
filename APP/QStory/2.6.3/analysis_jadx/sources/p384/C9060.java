package p384;

import kotlin.jvm.internal.AbstractC4395;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9060 {
    public static final C9007 Companion = new C9007();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9008 f25354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9061 f25355;

    public /* synthetic */ C9060(int i, C9061 c9061, C9008 c9008) {
        if ((i & 1) == 0) {
            this.f25355 = null;
        } else {
            this.f25355 = c9061;
        }
        if ((i & 2) == 0) {
            this.f25354 = null;
        } else {
            this.f25354 = c9008;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9060)) {
            return false;
        }
        C9060 c9060 = (C9060) obj;
        return AbstractC4395.m8907(this.f25355, c9060.f25355) && AbstractC4395.m8907(this.f25354, c9060.f25354);
    }

    public final int hashCode() {
        C9061 c9061 = this.f25355;
        int iHashCode = (c9061 == null ? 0 : c9061.f25356.hashCode()) * 31;
        C9008 c9008 = this.f25354;
        return iHashCode + (c9008 != null ? c9008.f25287.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC8405.m13972(1445) + this.f25355 + AbstractC8405.m13972(1446) + this.f25354 + ')';
    }
}
