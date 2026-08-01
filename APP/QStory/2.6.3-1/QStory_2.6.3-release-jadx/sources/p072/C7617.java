package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲兰子苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7617 {
    public static final C7616 Companion = new C7616();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18568;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18569;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18570;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18571;

    public /* synthetic */ C7617(String str, String str2, String str3, int i, String str4) {
        if (15 != (i & 15)) {
            AbstractC7973.m12979(i, 15, C7628.f18582.getDescriptor());
            throw null;
        }
        this.f18571 = str;
        this.f18570 = str2;
        this.f18569 = str3;
        this.f18568 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7617)) {
            return false;
        }
        C7617 c7617 = (C7617) obj;
        return AbstractC5227.m9466(this.f18571, c7617.f18571) && AbstractC5227.m9466(this.f18570, c7617.f18570) && AbstractC5227.m9466(this.f18569, c7617.f18569) && AbstractC5227.m9466(this.f18568, c7617.f18568);
    }

    public final int hashCode() {
        int iM12131 = AbstractC7012.m12131(this.f18571.hashCode() * 31, 31, this.f18570);
        String str = this.f18569;
        int iHashCode = (iM12131 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18568;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceTemplate(uriTemplate=");
        sb.append(this.f18571);
        sb.append(", name=");
        sb.append(this.f18570);
        sb.append(", description=");
        sb.append(this.f18569);
        sb.append(", mimeType=");
        return AbstractC0900.m708(sb, this.f18568, ')');
    }
}
