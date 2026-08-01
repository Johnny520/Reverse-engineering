package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6685 implements InterfaceC6782 {
    public static final C6686 Companion = new C6686();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18102;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18103;

    public /* synthetic */ C6685(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC7143.m12393(i, 7, C6687.f18104.getDescriptor());
            throw null;
        }
        this.f18103 = str;
        this.f18102 = str2;
        this.f18101 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6685)) {
            return false;
        }
        C6685 c6685 = (C6685) obj;
        return AbstractC4394.m8917(this.f18103, c6685.f18103) && AbstractC4394.m8917(this.f18102, c6685.f18102) && AbstractC4394.m8917(this.f18101, c6685.f18101);
    }

    public final int hashCode() {
        int iM11539 = AbstractC6136.m11539(this.f18103.hashCode() * 31, 31, this.f18102);
        String str = this.f18101;
        return iM11539 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlobResourceContents(blob=");
        sb.append(this.f18103);
        sb.append(", uri=");
        sb.append(this.f18102);
        sb.append(", mimeType=");
        return AbstractC0053.m155(sb, this.f18101, ')');
    }
}
