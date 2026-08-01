package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲世子兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7610 {
    public static final C7611 Companion = new C7611();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18562;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18563;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18565;

    public /* synthetic */ C7610(String str, String str2, String str3, int i, String str4) {
        if (15 != (i & 15)) {
            AbstractC7973.m12979(i, 15, C7623.f18579.getDescriptor());
            throw null;
        }
        this.f18565 = str;
        this.f18564 = str2;
        this.f18563 = str3;
        this.f18562 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7610)) {
            return false;
        }
        C7610 c7610 = (C7610) obj;
        return AbstractC5227.m9466(this.f18565, c7610.f18565) && AbstractC5227.m9466(this.f18564, c7610.f18564) && AbstractC5227.m9466(this.f18563, c7610.f18563) && AbstractC5227.m9466(this.f18562, c7610.f18562);
    }

    public final int hashCode() {
        int iM12131 = AbstractC7012.m12131(this.f18565.hashCode() * 31, 31, this.f18564);
        String str = this.f18563;
        int iHashCode = (iM12131 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18562;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resource(uri=");
        sb.append(this.f18565);
        sb.append(", name=");
        sb.append(this.f18564);
        sb.append(", description=");
        sb.append(this.f18563);
        sb.append(", mimeType=");
        return AbstractC0900.m708(sb, this.f18562, ')');
    }
}
