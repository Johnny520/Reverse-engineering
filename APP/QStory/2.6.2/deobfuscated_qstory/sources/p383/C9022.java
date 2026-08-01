package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9022 {
    public static final C9023 Companion = new C9023();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25317;

    public C9022(int i, String str, String str2) {
        AbstractC6136.m11546(-3937702974282007975L, -3937702875497760167L, str);
        str2.getClass();
        this.f25317 = str;
        this.f25316 = str2;
        this.f25315 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9022)) {
            return false;
        }
        C9022 c9022 = (C9022) obj;
        return AbstractC4394.m8917(this.f25317, c9022.f25317) && AbstractC4394.m8917(this.f25316, c9022.f25316) && this.f25315 == c9022.f25315;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25315) + AbstractC6136.m11539(this.f25317.hashCode() * 31, 31, this.f25316);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupChatMessageRecall(groupUin=");
        AbstractC6136.m11531(sb, this.f25317, -3937702656454428071L);
        AbstractC6136.m11531(sb, this.f25316, -3937685549599688103L);
        return AbstractC0053.m154(sb, this.f25315, ')');
    }

    public /* synthetic */ C9022(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC7143.m12393(i, 7, C9024.f25318.getDescriptor());
            throw null;
        }
        this.f25317 = str;
        this.f25316 = str2;
        this.f25315 = i2;
    }
}
