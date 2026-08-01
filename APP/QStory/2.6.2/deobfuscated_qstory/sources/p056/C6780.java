package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲世子兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6780 {
    public static final C6781 Companion = new C6781();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18225;

    public /* synthetic */ C6780(String str, String str2, String str3, int i, String str4) {
        if (15 != (i & 15)) {
            AbstractC7143.m12393(i, 15, C6793.f18239.getDescriptor());
            throw null;
        }
        this.f18225 = str;
        this.f18224 = str2;
        this.f18223 = str3;
        this.f18222 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6780)) {
            return false;
        }
        C6780 c6780 = (C6780) obj;
        return AbstractC4394.m8917(this.f18225, c6780.f18225) && AbstractC4394.m8917(this.f18224, c6780.f18224) && AbstractC4394.m8917(this.f18223, c6780.f18223) && AbstractC4394.m8917(this.f18222, c6780.f18222);
    }

    public final int hashCode() {
        int iM11539 = AbstractC6136.m11539(this.f18225.hashCode() * 31, 31, this.f18224);
        String str = this.f18223;
        int iHashCode = (iM11539 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18222;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resource(uri=");
        sb.append(this.f18225);
        sb.append(", name=");
        sb.append(this.f18224);
        sb.append(", description=");
        sb.append(this.f18223);
        sb.append(", mimeType=");
        return AbstractC0053.m155(sb, this.f18222, ')');
    }
}
