package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9025 {
    public static final C9026 Companion = new C9026();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25320;

    public /* synthetic */ C9025(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C9027.f25321.getDescriptor());
            throw null;
        }
        this.f25320 = str;
        this.f25319 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9025)) {
            return false;
        }
        C9025 c9025 = (C9025) obj;
        return AbstractC4394.m8917(this.f25320, c9025.f25320) && this.f25319 == c9025.f25319;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25319) + (this.f25320.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendChatMessageRecall(peerUid=");
        AbstractC6136.m11531(sb, this.f25320, -3937685549599688103L);
        return AbstractC0053.m154(sb, this.f25319, ')');
    }

    public C9025(String str, int i) {
        "peerUid";
        str.getClass();
        this.f25320 = str;
        this.f25319 = i;
    }
}
