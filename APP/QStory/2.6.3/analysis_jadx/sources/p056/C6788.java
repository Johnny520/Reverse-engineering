package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲兰子苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6788 {
    public static final C6787 Companion = new C6787();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18226;

    public /* synthetic */ C6788(String str, String str2, String str3, int i, String str4) {
        if (15 != (i & 15)) {
            AbstractC7144.m12420(i, 15, C6799.f18237.getDescriptor());
            throw null;
        }
        this.f18226 = str;
        this.f18225 = str2;
        this.f18224 = str3;
        this.f18223 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6788)) {
            return false;
        }
        C6788 c6788 = (C6788) obj;
        return AbstractC4395.m8907(this.f18226, c6788.f18226) && AbstractC4395.m8907(this.f18225, c6788.f18225) && AbstractC4395.m8907(this.f18224, c6788.f18224) && AbstractC4395.m8907(this.f18223, c6788.f18223);
    }

    public final int hashCode() {
        int iM11572 = AbstractC6183.m11572(this.f18226.hashCode() * 31, 31, this.f18225);
        String str = this.f18224;
        int iHashCode = (iM11572 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18223;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceTemplate(uriTemplate=");
        sb.append(this.f18226);
        sb.append(", name=");
        sb.append(this.f18225);
        sb.append(", description=");
        sb.append(this.f18224);
        sb.append(", mimeType=");
        return AbstractC0053.m148(sb, this.f18223, ')');
    }
}
