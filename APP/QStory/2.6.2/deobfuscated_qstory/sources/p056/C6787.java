package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲兰子苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6787 {
    public static final C6786 Companion = new C6786();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18228;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18229;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18230;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18231;

    public /* synthetic */ C6787(String str, String str2, String str3, int i, String str4) {
        if (15 != (i & 15)) {
            AbstractC7143.m12393(i, 15, C6798.f18242.getDescriptor());
            throw null;
        }
        this.f18231 = str;
        this.f18230 = str2;
        this.f18229 = str3;
        this.f18228 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6787)) {
            return false;
        }
        C6787 c6787 = (C6787) obj;
        return AbstractC4394.m8917(this.f18231, c6787.f18231) && AbstractC4394.m8917(this.f18230, c6787.f18230) && AbstractC4394.m8917(this.f18229, c6787.f18229) && AbstractC4394.m8917(this.f18228, c6787.f18228);
    }

    public final int hashCode() {
        int iM11539 = AbstractC6136.m11539(this.f18231.hashCode() * 31, 31, this.f18230);
        String str = this.f18229;
        int iHashCode = (iM11539 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18228;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceTemplate(uriTemplate=");
        sb.append(this.f18231);
        sb.append(", name=");
        sb.append(this.f18230);
        sb.append(", description=");
        sb.append(this.f18229);
        sb.append(", mimeType=");
        return AbstractC0053.m155(sb, this.f18228, ')');
    }
}
