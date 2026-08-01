package p072;

import kotlin.jvm.internal.AbstractC5227;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7527 {
    public static final C7524 Companion = new C7524();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7526 f18455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7981 f18457;

    public C7527(int i, C7981 c7981, C7981 c79812, C7526 c7526) {
        this.f18457 = (i & 1) == 0 ? AbstractC7431.f18321 : c7981;
        if ((i & 2) == 0) {
            this.f18456 = AbstractC7431.f18321;
        } else {
            this.f18456 = c79812;
        }
        if ((i & 4) == 0) {
            this.f18455 = null;
        } else {
            this.f18455 = c7526;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7527)) {
            return false;
        }
        C7527 c7527 = (C7527) obj;
        return AbstractC5227.m9466(this.f18457, c7527.f18457) && AbstractC5227.m9466(this.f18456, c7527.f18456) && AbstractC5227.m9466(this.f18455, c7527.f18455);
    }

    public final int hashCode() {
        C7981 c7981 = this.f18457;
        int iHashCode = (c7981 == null ? 0 : c7981.f19461.hashCode()) * 31;
        C7981 c79812 = this.f18456;
        int iHashCode2 = (iHashCode + (c79812 == null ? 0 : c79812.f19461.hashCode())) * 31;
        C7526 c7526 = this.f18455;
        return iHashCode2 + (c7526 != null ? c7526.hashCode() : 0);
    }

    public final String toString() {
        return "ClientCapabilities(experimental=" + this.f18457 + ", sampling=" + this.f18456 + ", roots=" + this.f18455 + ')';
    }
}
