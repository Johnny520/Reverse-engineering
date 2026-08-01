package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪哲苏子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7427 implements InterfaceC7612 {
    public static final C7424 Companion = new C7424();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18318;

    public /* synthetic */ C7427(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7425.f18315.getDescriptor());
            throw null;
        }
        this.f18318 = str;
        this.f18317 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7427)) {
            return false;
        }
        C7427 c7427 = (C7427) obj;
        return AbstractC5227.m9466(this.f18318, c7427.f18318) && AbstractC5227.m9466(this.f18317, c7427.f18317);
    }

    public final int hashCode() {
        int iHashCode = this.f18318.hashCode() * 31;
        String str = this.f18317;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownResourceContents(uri=");
        sb.append(this.f18318);
        sb.append(", mimeType=");
        return AbstractC0900.m708(sb, this.f18317, ')');
    }
}
