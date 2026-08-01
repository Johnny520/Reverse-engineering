package p056;

import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6573 {
    public static final C6574 Companion = new C6574();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6570 f17951;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17953;

    public /* synthetic */ C6573(int i, String str, String str2, C6570 c6570) {
        if (7 != (i & 7)) {
            AbstractC7143.m12393(i, 7, C6578.f17956.getDescriptor());
            throw null;
        }
        this.f17953 = str;
        this.f17952 = str2;
        this.f17951 = c6570;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6573)) {
            return false;
        }
        C6573 c6573 = (C6573) obj;
        return AbstractC4394.m8917(this.f17953, c6573.f17953) && AbstractC4394.m8917(this.f17952, c6573.f17952) && AbstractC4394.m8917(this.f17951, c6573.f17951);
    }

    public final int hashCode() {
        int iHashCode = this.f17953.hashCode() * 31;
        String str = this.f17952;
        return this.f17951.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Tool(name=" + this.f17953 + ", description=" + this.f17952 + ", inputSchema=" + this.f17951 + ')';
    }
}
