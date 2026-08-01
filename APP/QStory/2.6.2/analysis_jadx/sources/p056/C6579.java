package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6579 implements InterfaceC6782 {
    public static final C6576 Companion = new C6576();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17959;

    public /* synthetic */ C6579(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC7143.m12393(i, 7, C6577.f17955.getDescriptor());
            throw null;
        }
        this.f17959 = str;
        this.f17958 = str2;
        this.f17957 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6579)) {
            return false;
        }
        C6579 c6579 = (C6579) obj;
        return AbstractC4394.m8917(this.f17959, c6579.f17959) && AbstractC4394.m8917(this.f17958, c6579.f17958) && AbstractC4394.m8917(this.f17957, c6579.f17957);
    }

    public final int hashCode() {
        int iM11539 = AbstractC6136.m11539(this.f17959.hashCode() * 31, 31, this.f17958);
        String str = this.f17957;
        return iM11539 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextResourceContents(text=");
        sb.append(this.f17959);
        sb.append(", uri=");
        sb.append(this.f17958);
        sb.append(", mimeType=");
        return AbstractC0053.m155(sb, this.f17957, ')');
    }
}
