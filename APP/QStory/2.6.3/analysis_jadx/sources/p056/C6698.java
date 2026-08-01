package p056;

import kotlin.jvm.internal.AbstractC4395;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6698 {
    public static final C6695 Companion = new C6695();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6697 f18110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7152 f18112;

    public C6698(int i, C7152 c7152, C7152 c71522, C6697 c6697) {
        this.f18112 = (i & 1) == 0 ? AbstractC6602.f17976 : c7152;
        if ((i & 2) == 0) {
            this.f18111 = AbstractC6602.f17976;
        } else {
            this.f18111 = c71522;
        }
        if ((i & 4) == 0) {
            this.f18110 = null;
        } else {
            this.f18110 = c6697;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6698)) {
            return false;
        }
        C6698 c6698 = (C6698) obj;
        return AbstractC4395.m8907(this.f18112, c6698.f18112) && AbstractC4395.m8907(this.f18111, c6698.f18111) && AbstractC4395.m8907(this.f18110, c6698.f18110);
    }

    public final int hashCode() {
        C7152 c7152 = this.f18112;
        int iHashCode = (c7152 == null ? 0 : c7152.f19116.hashCode()) * 31;
        C7152 c71522 = this.f18111;
        int iHashCode2 = (iHashCode + (c71522 == null ? 0 : c71522.f19116.hashCode())) * 31;
        C6697 c6697 = this.f18110;
        return iHashCode2 + (c6697 != null ? c6697.hashCode() : 0);
    }

    public final String toString() {
        return "ClientCapabilities(experimental=" + this.f18112 + ", sampling=" + this.f18111 + ", roots=" + this.f18110 + ')';
    }
}
