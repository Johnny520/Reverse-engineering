package p056;

import kotlin.jvm.internal.AbstractC4394;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6697 {
    public static final C6694 Companion = new C6694();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6696 f18115;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7151 f18116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7151 f18117;

    public C6697(int i, C7151 c7151, C7151 c71512, C6696 c6696) {
        this.f18117 = (i & 1) == 0 ? AbstractC6601.f17981 : c7151;
        if ((i & 2) == 0) {
            this.f18116 = AbstractC6601.f17981;
        } else {
            this.f18116 = c71512;
        }
        if ((i & 4) == 0) {
            this.f18115 = null;
        } else {
            this.f18115 = c6696;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6697)) {
            return false;
        }
        C6697 c6697 = (C6697) obj;
        return AbstractC4394.m8917(this.f18117, c6697.f18117) && AbstractC4394.m8917(this.f18116, c6697.f18116) && AbstractC4394.m8917(this.f18115, c6697.f18115);
    }

    public final int hashCode() {
        C7151 c7151 = this.f18117;
        int iHashCode = (c7151 == null ? 0 : c7151.f19121.hashCode()) * 31;
        C7151 c71512 = this.f18116;
        int iHashCode2 = (iHashCode + (c71512 == null ? 0 : c71512.f19121.hashCode())) * 31;
        C6696 c6696 = this.f18115;
        return iHashCode2 + (c6696 != null ? c6696.hashCode() : 0);
    }

    public final String toString() {
        return "ClientCapabilities(experimental=" + this.f18117 + ", sampling=" + this.f18116 + ", roots=" + this.f18115 + ')';
    }
}
