package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7409 implements InterfaceC7612 {
    public static final C7406 Companion = new C7406();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18299;

    public /* synthetic */ C7409(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC7973.m12979(i, 7, C7407.f18295.getDescriptor());
            throw null;
        }
        this.f18299 = str;
        this.f18298 = str2;
        this.f18297 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7409)) {
            return false;
        }
        C7409 c7409 = (C7409) obj;
        return AbstractC5227.m9466(this.f18299, c7409.f18299) && AbstractC5227.m9466(this.f18298, c7409.f18298) && AbstractC5227.m9466(this.f18297, c7409.f18297);
    }

    public final int hashCode() {
        int iM12131 = AbstractC7012.m12131(this.f18299.hashCode() * 31, 31, this.f18298);
        String str = this.f18297;
        return iM12131 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextResourceContents(text=");
        sb.append(this.f18299);
        sb.append(", uri=");
        sb.append(this.f18298);
        sb.append(", mimeType=");
        return AbstractC0900.m708(sb, this.f18297, ')');
    }
}
