package p400;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9860 {
    public static final C9861 Companion = new C9861();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25657;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25658;

    public /* synthetic */ C9860(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C9862.f25659.getDescriptor());
            throw null;
        }
        this.f25658 = str;
        this.f25657 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9860)) {
            return false;
        }
        C9860 c9860 = (C9860) obj;
        return AbstractC5227.m9466(this.f25658, c9860.f25658) && this.f25657 == c9860.f25657;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25657) + (this.f25658.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendChatMessageRecall(peerUid=");
        AbstractC7012.m12138(sb, this.f25658, 1359);
        return AbstractC0900.m716(sb, this.f25657, ')');
    }

    public C9860(String str, int i) {
        "peerUid";
        str.getClass();
        this.f25658 = str;
        this.f25657 = i;
    }
}
